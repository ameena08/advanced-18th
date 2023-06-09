package com.UST.BookServicesFeign.controller;

import com.UST.BookServicesFeign.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookRestController {

    @Autowired
    Environment environment;

    @GetMapping("/data")
    public String getBookData(){
        return "data of BOOK-SERVICE, Running on port: "+environment.getProperty("local.server.port");
    }

    @GetMapping("/{id}")
    public Book getBookById(@PathVariable Integer id){
        return new Book(id,"Head of Java",675.44);
    }



    @GetMapping("/all")
    public List<Book> getAll(){
        return List.of(
                new Book(501,"Head First Java",439.75),
                new Book(502,"Tails first java",340.87),
                new Book(503,"Hibernate in Action",340.45)

        );
    }


    @GetMapping("/entity")
    public ResponseEntity<String> getEntityData(){
        return new ResponseEntity<String>("Hello from BookRestController", HttpStatus.OK);
    }






}
