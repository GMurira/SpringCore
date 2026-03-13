package com.jefferson.app;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SchoolService {
    private final SchoolRepository schoolRepository;
    private final SchoolMapper schoolMapper;

    public SchoolService(SchoolRepository schoolRepository, SchoolMapper schoolMapper) {
        this.schoolRepository = schoolRepository;
        this.schoolMapper = schoolMapper;
    }

    public  School saveSchool(School school){
        return schoolRepository.save(school);
    }

    public List<SchoolDto> findAllSchools(){
        return schoolRepository.findAll()
                .stream()
                .map(schoolMapper::toschoolDto)
                .collect(Collectors.toList());
    }

}
