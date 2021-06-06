package com.rest.docs.springrestdocs.module.main.controller;

import com.rest.docs.springrestdocs.module.main.model.Person;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @GetMapping("/hello/{name}")
    public ResponseEntity<Person> hello(@PathVariable String name) {
        return ResponseEntity.ok()
                .body(new Person(name, "안녕하세요!"));
    }
}
