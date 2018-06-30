package com.example.demoapp1.controller;


import com.example.demoapp1.domain.Field_;
import com.example.demoapp1.repository.FieldRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/field")
public class FieldController {

    @Autowired
    private FieldRepository fieldRepository;

    //all fields
    @GetMapping("/list")
    List<Field_> list() {
        return fieldRepository.findAll();
    }

    //all active fields
    @GetMapping("/active-list")
    List<Field_> activelist() {
        return fieldRepository.findAllByActiveTrue();
    }

    //get field by id
    @GetMapping("/view/{id}")
    Field_ view(@PathVariable Long id) {
        return fieldRepository.findOneById(id);
    }

    //create field
    @PostMapping("/add")
    Field_ add(@RequestBody Field_ field) {
        return fieldRepository.save(field);
    }

    //update field
    @PutMapping("/update")
    Field_ update(@RequestBody Field_ field) {
        return fieldRepository.save(field);
    }

    //delete field
    @DeleteMapping("/delete/{id}")
    void delete(@PathVariable Long id){
        fieldRepository.removeById(id);
    }

}
