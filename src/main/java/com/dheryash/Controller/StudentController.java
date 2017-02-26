package com.dheryash.Controller;

import com.dheryash.Entity.Movies;
import com.dheryash.Entity.Student;
import com.dheryash.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.List;

/**
 * Created by dheryash on 20/02/2017.
 */
@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Movies> getAllMovies(){
        return studentService.getAllMovies();
    }
}
