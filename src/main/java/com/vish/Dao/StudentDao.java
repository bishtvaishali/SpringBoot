package com.vish.Dao;

import com.vish.Entity.Student;

import java.util.Collection;

public interface StudentDao {
    Collection<Student> getAllStudents();

    Student getStudentById(int id);

    boolean removeStudentById(int id);

    void updateStudentById(Student student);

    void insertStudent(Student student);
}
