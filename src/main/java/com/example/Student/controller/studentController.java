package com.example.Student.controller;


import com.example.Student.model.student;
import com.example.Student.services.studentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class studentController {
    private studentService studentService;

    public studentController(studentService studentService){
        this.studentService = studentService;
    }

    @PostMapping("/add")
    public student addstudent(@RequestBody student student){
        return studentService.addStudent(student);
    }

    @GetMapping("/all")
    public List<student> getall(){
        return studentService.getAll();
    }

    @PutMapping("/update/{id}")
    public student update(@PathVariable int id,@RequestBody student newstudent){
        return studentService.update(id,newstudent);
    }

    @PutMapping("/delete/{id}")
    public String delete(@PathVariable int id){
        return studentService.delete(id);
    }
}
