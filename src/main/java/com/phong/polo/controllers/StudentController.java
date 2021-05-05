package com.phong.polo.controllers;

import com.phong.polo.dao.QLSV.entities.Student;
import com.phong.polo.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/students")
public class StudentController {
    @Autowired
    private StudentService studentService;
    @RequestMapping(value = "/all", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public List<Student> getAllStudent(){
        List<Student> listStudent=null;
        listStudent=studentService.getAllStudent();
        return listStudent;
    }
}
