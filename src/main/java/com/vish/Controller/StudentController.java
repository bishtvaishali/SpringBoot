package com.vish.Controller;

import com.vish.Entity.Student;
import com.vish.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/students")
public class StudentController {

    /**
     * spring will look for this bean and instantiate and inject it here
     */
    @Autowired
    private StudentService studentService;

    @RequestMapping(method = RequestMethod.GET)
    public Collection<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

    @RequestMapping(value="/{id}", method = RequestMethod.GET)
    public Student getStudentById(@PathVariable("id") int id){
        return studentService.getStudentById(id);
    }

    @RequestMapping(value="/{id}", method = RequestMethod.DELETE)
    public boolean deleteStudentById( @PathVariable("id") int id){
        return studentService.removeStudentById(id);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public void updateStudentById(@RequestBody Student student){
         studentService.updateStudentById(student);
    }

    @RequestMapping(method = RequestMethod.POST)
    public void insertStudent(@RequestBody Student student){
        studentService.insertStudent(student);
    }


}
