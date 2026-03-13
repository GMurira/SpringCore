package com.jefferson.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class SchoolController {
    private final SchoolRepository schoolRepository;

    public SchoolController(SchoolRepository schoolRepository) {
        this.schoolRepository = schoolRepository;
    }

    @PostMapping("/schools")
    public School create(@RequestBody School school) {
        return schoolRepository.save(school);
    }


    private SchoolDto toschoolDto(School school) {
        return new SchoolDto(school.getSchoolName());
    }

    @GetMapping("/schools")
    public List<SchoolDto> findAllSchools() {
        return schoolRepository.findAll()
                .stream()
                .map(this::toschoolDto)
                .collect(Collectors.toList());
    }
}
