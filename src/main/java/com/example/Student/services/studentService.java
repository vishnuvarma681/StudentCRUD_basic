package com.example.Student.services;

import com.example.Student.model.student;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class studentService {

    private ArrayList<student> students = new ArrayList<>();
    int idcount = 1;

    public student addStudent(student student){
        student.setId(idcount);
        idcount++;
        students.add(student);
        return student;
    }

    public List<student> getAll(){
        return students;
    }

    public student update(int id, student newstudent){
        for(student student : students){
            if(newstudent.getId() == id){
                newstudent.setname(newstudent.getname());
                newstudent.setcity(newstudent.getcity());
                newstudent.setage(newstudent.getage());
                return student;
            }
        }
        return null;
    }

    public String delete(int id){
        for (student student : students){
            if(student.getId() == id){
                students.remove(student);
                return "Student deleted Successfully";
            }
        }
        return "Student not found";
    }

}
