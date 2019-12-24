package com.tutorial.mongo.db.demo.controller;

import com.tutorial.mongo.db.demo.model.Post;
import com.tutorial.mongo.db.demo.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "post")
public class PostController
{
    private final PersonRepository repository;
    @Autowired
    public PostController(PersonRepository repository){
        this.repository = repository;
    }

    //FIXME make GET for possible folders? :O

    @GetMapping("/get-all")
    public ResponseEntity<List<Post>> getAllPeople()
    {
        return new ResponseEntity<>(repository.findAll(), HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<Post> createNewPerson(@RequestBody Post post)
    {
        return new ResponseEntity<>(repository.save(post), HttpStatus.OK);
    }

    @DeleteMapping("/delete-all")
    public String deleteAll()
    {
        repository.deleteAll();
        return "Successfully deleted all records";
    }

    @DeleteMapping("/delete-id/{id}")
    public String delete(@PathVariable("id") String postId)
    {
        repository.deleteById(postId);
        return "Successfully deleted the record";
    }

    @DeleteMapping("/delete-entry")
    public String delete(@RequestBody Post post)
    {
        repository.delete(post);
        return "Successfully deleted the record";
    }
}