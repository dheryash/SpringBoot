package com.dheryash.Dao;

import com.dheryash.Entity.Movies;
import com.dheryash.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by dheryash on 20/02/2017.
 */
@Repository
public class StudentDao {

    @Autowired
    private MongoTemplate mongoTemplate;

    public List<Movies> getAllMovies(){
        return mongoTemplate.findAll(Movies.class);
    }
}
