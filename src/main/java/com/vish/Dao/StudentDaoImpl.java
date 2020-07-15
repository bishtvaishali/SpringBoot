package com.vish.Dao;

import com.vish.Entity.Student;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

//it is a type of componeet but we want to specify its type
//Spring will initiate all the beans.
@Repository
@Qualifier("studentDaoImpl")
public class StudentDaoImpl implements StudentDao {

    private static Map<Integer, Student> studentMap;

    static{
        studentMap = new HashMap<Integer, Student>(){
            {
                put(1, new Student(1, "John", "CS"));
                put(2, new Student(2, "Alex", "Math"));
                put(3, new Student(3, "Kelly", "Biology"));

            }
        };
    }


    @Override
    public Collection<Student> getAllStudents(){
        return this.studentMap.values();
    }


    @Override
    public Student getStudentById(int id){
        return studentMap.get(id);
    }


    @Override
    public boolean removeStudentById(int id) {
        Student val = studentMap.remove(id);
        return false ? val == null : true;
    }

    @Override
    public void updateStudentById(Student student){
        Student stud = studentMap.get(student.getId());
        stud.setCourse(student.getCourse());
        stud.setName(student.getName());
    }

    @Override
    public void insertStudent(Student student) {
        studentMap.put(student.getId(), student);
    }
}
