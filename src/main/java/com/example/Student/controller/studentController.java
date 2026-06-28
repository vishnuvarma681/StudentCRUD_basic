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
        return studentService.addstudent(student);
    }

    @GetMapping("/all")
    public List<student> getall(){
        return studentService.getAllStudent();
    }

    @PutMapping("/update/{id}")
    public student update(@PathVariable int id,@RequestBody student newstudent){
        return studentService.update(id,newstudent);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable int id){
        return studentService.delete(id);
    }
}
