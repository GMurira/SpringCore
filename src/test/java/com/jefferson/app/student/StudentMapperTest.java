package com.jefferson.app.student;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class StudentMapperTest {
    private StudentMapper studentMapper;

    @BeforeEach
    void setUp() {
        studentMapper = new StudentMapper();
    }

    @Test
    public void shouldMapStudentDtoToStudent() {
        StudentDto studentDto = new StudentDto("John", "Doe", "john@email.com", 1);
        Student student = studentMapper.toStudent(studentDto);

        Assertions.assertEquals(studentDto.firstName(), student.getFirstName());
        Assertions.assertEquals(studentDto.lastName(), student.getLastName());
        Assertions.assertEquals(studentDto.email(), student.getEmail());
        Assertions.assertNotNull(student.getSchool());
        Assertions.assertEquals(studentDto.schoolId(), student.getSchool().getId());
    }


    @Test
    public void shouldMapStudenDtotoStudentResponseDto() {
        //Given
        Student student = new Student("Jane", "Smith", "jane@mail,com", 16);
        StudentResponseDto studentResponseDto = studentMapper.toStudentResponseDto(student);

        //When
        Assertions.assertEquals(student.getFirstName(), studentResponseDto.firstName());
        Assertions.assertEquals(student.getLastName(), studentResponseDto.lastName());
        Assertions.assertEquals(student.getEmail(), studentResponseDto.email());
        Assertions.assertNotNull(studentResponseDto);
    }

    @Test
    public void shouldThrowNullPointerExceptionWhenStudentDtoIsNull() {
        var msg = assertThrows(NullPointerException.class, () -> studentMapper.toStudent(null));
        assertEquals("The student dto should not be null.", msg.getMessage());
    }
}