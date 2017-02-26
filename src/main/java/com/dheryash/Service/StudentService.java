package com.dheryash.Service;

import com.dheryash.Dao.StudentDao;
import com.dheryash.Entity.Movies;
import com.dheryash.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

/**
 * Created by dheryash on 20/02/2017.
 */
@Service
public class StudentService {

    @Autowired
    private StudentDao studentDao;

    public List<Movies> getAllMovies(){
        return studentDao.getAllMovies();
    }
}
