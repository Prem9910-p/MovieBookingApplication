package com.example.MovieBookingApplication.Controller;


import com.example.MovieBookingApplication.Dto.MovieDto;
import com.example.MovieBookingApplication.Entity.Movie;
import com.example.MovieBookingApplication.Service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/movies")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @PostMapping("/addmovie")
    public ResponseEntity<Movie> addMovie(@RequestBody MovieDto movieDto){
        return ResponseEntity.ok(movieService.addMovie(movieDto));

    }
    @GetMapping("/getallmovies")
    public ResponseEntity<List<Movie>> getAllMovies(){
        return ResponseEntity.ok(movieService.getAllMovies());
    }




}
