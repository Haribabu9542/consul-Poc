package org.java.controller;

import org.java.model.Student;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/user")
public class MyController {
    @GetMapping(path = "/data")
    public ResponseEntity<List<Object>> msg() {

        return ResponseEntity.ok(List.of(new Student("hari", 90),
                new Student("vinay", 110)));
    }
}
