package com.vish.Service;
import com.vish.Dao.StudentDao;
import com.vish.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class StudentService {

    @Autowired
    @Qualifier("mongoData")
    private StudentDao studentDao;

    public Collection<Student> getAllStudents(){
        return studentDao.getAllStudents();
    }

    public Student getStudentById(int id){
        return studentDao.getStudentById(id);
    }

    public boolean removeStudentById(int id) {
        return studentDao.removeStudentById(id);
    }

    public void updateStudentById(Student student){
        studentDao.updateStudentById(student);
    }

    public void insertStudent(Student student) {
        studentDao.insertStudent(student);
    }
}
