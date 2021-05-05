package com.phong.polo.dao.QLSV.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


@Entity
@Table(name="Student")
public class Student implements Serializable {
    private static final long serialVersionUID = 721038453740868236L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="studentID")
    private int studentID;
    @Column(name = "student_name")
    private String studentName;
    @Column(name = "birth_of_day")
    private Date birthOfDay;

    public Student() {
    }

    public Student(int studentID, String studentName, Date birthOfDay) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.birthOfDay = birthOfDay;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Date getBirthOfDay() {
        return birthOfDay;
    }

    public void setBirthOfDay(Date birthOfDay) {
        this.birthOfDay = birthOfDay;
    }
}
