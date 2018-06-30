package com.example.demoapp1.controller;

import com.example.demoapp1.domain.Response;
import com.example.demoapp1.repository.ResponseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/response")
public class ResponseController {

    @Autowired
    private ResponseRepository responseRepository;

    //get all responses
    @GetMapping("/list")
    List<Response> list() {
        return responseRepository.findAll();
    }

    //get response by id
    @GetMapping("/view/{id}")
    Response view(@PathVariable Long id) {
        return responseRepository.findOneById(id);
    }

    //get response by user id
    @GetMapping("/user-list/{userId}")
    List<Response> userlist(@PathVariable Long userId) {
        return responseRepository.findAllByUserId(userId);
    }

    //create response
    @PostMapping("/add")
    Response add(@RequestBody Response response) {
        return responseRepository.save(response);
    }

    //update response
    @PutMapping("/update")
    Response update(@RequestBody Response response) {
        return responseRepository.save(response);
    }

    //delete response
    @DeleteMapping("/delete/{id}")
    void delete(@PathVariable Long id) {
        responseRepository.removeById(id);
    }

}
