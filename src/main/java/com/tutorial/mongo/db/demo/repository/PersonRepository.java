package com.tutorial.mongo.db.demo.repository;

import com.tutorial.mongo.db.demo.model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PersonRepository extends MongoRepository<Post, String>
{

}
