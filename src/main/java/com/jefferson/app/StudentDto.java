package com.jefferson.app;

public record StudentDto(
        String firstName,
        String lastName,
        String email,
        Integer schoolId
) {
}
