package com.jefferson.app.school;

import org.springframework.stereotype.Service;

@Service
public class SchoolMapper {
    public SchoolDto toschoolDto(School school) {
        return new SchoolDto(school.getSchoolName());
    }
}
