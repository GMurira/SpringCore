package com.jefferson.app.school;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SchoolController {

    public final SchoolService schoolService;

    public SchoolController(SchoolService schoolService) {
        this.schoolService = schoolService;
    }

    @PostMapping("/schools")
    public School create(@RequestBody School school) {
        return schoolService.saveSchool(school);
    }

    @GetMapping("/schools")
    public List<SchoolDto> findAllSchools() {
        return schoolService.findAllSchools();
    }
}
