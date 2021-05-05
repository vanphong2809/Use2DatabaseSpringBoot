package com.phong.polo.services.impl;

import com.phong.polo.dao.QLSV.entities.Student;
import com.phong.polo.dao.QLSV.repositories.StudentRepository;
import com.phong.polo.services.StudentService;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepository studentRepository;
    private Logger LOGGER=  LoggerFactory.getLogger(StudentServiceImpl.class);
    @Override
    public List<Student> getAllStudent() {
        List<Student> listStudent=new ArrayList<Student>();
        try{
            listStudent=studentRepository.getAllStudent();
        }catch (Exception e){
            e.printStackTrace();
            LOGGER.error(e.getMessage());
        }
        return listStudent;
    }
}
