package com.moviebooking.multiplexService.movieShow;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/movieShow")
public class MovieShowController {

    @Autowired
    private MovieShowService movieShowService;


    @PutMapping
    public MovieShow addMovieShow(@RequestBody MovieShow movieShow) {
        System.out.println("Adding Movie Show : " + movieShow);
        return movieShowService.addMovieShow(movieShow);
    }

    @GetMapping
    public List<MovieShow> findMovieShows(@RequestParam int cityId, @RequestParam Long movieId){
        Date today = new Date();
        Date date = new Date(today.getYear(), today.getMonth(), today.getDate());
        return movieShowService.findMovieShows(cityId,movieId,date,today.getHours());
    }
}
