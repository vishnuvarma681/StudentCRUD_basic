package com.example.Student.services;

import com.example.Student.StudentRepository;
import com.example.Student.model.student;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class studentService {

    public student student;

    private final StudentRepository studentrepository;

    public studentService(StudentRepository studentrepository){
        this.studentrepository = studentrepository;
    }

    public student addstudent(student student){
        return studentrepository.save(student);
    }

    public List<student> getAllStudent(){
        return studentrepository.findAll();
    }

    public student getById(int id){
        return studentrepository.findById(id).orElse(null);
    }

    public student update(int id, student newstudent){
        student = studentrepository.findById(id).orElse(null);
        if(student == null) {
            return null;
        }
        student.setName(newstudent.getName());
        student.setAge(newstudent.getAge());
        student.setCity(newstudent.getCity());

        return studentrepository.save(student);
    }

    public String delete(int id){
        if(studentrepository.existsById(id)){
            studentrepository.deleteById(id);
            return "Student Deleted Successfully";
        }else{
            return "Student Not Found";
        }
    }

}
