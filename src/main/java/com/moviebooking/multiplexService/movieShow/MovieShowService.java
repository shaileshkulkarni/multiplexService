package com.moviebooking.multiplexService.movieShow;

import com.moviebooking.multiplexService.common.City;
import com.moviebooking.multiplexService.common.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class MovieShowService {

    @Autowired
    private MovieShowRepository movieShowRepository;


    public MovieShow addMovieShow(MovieShow movieShow){
        System.out.println("Adding Movie Show : " + movieShow);
        return movieShowRepository.save(movieShow);
    }

    public List<MovieShow> findMovieShows(int cityId, Long movieId, Date date, int startTime){
        City city = new City();
        city.setCityId(cityId);

        Movie movie = new Movie();
        movie.setMovieId(movieId);

        System.out.println("Find Movie Shows by city : " + cityId + " : Movie : " + movieId + " : date : " + date + " : startTime : " + startTime);

        return movieShowRepository.findByCityAndMovieAndDateAndStartTimeGreaterThan(city,movie,date, startTime);
    }
}
