package com.example.spring_oop;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;


@Service
public class MovieService {
    public List<Movie> query (final String query) {
        return Arrays.asList(
                Movie.builder().title("영화1").link("http://test").build(),
                Movie.builder().title("영화2").link("http://test").build()
        );
    }

}

