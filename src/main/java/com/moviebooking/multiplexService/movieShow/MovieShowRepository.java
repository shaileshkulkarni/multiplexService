package com.moviebooking.multiplexService.movieShow;

import com.moviebooking.multiplexService.common.City;
import com.moviebooking.multiplexService.common.Movie;
import org.springframework.data.repository.CrudRepository;

import java.util.Date;
import java.util.List;

public interface MovieShowRepository extends CrudRepository<MovieShow, Long> {

    public List<MovieShow> findByCityAndMovieAndDateAndStartTimeGreaterThan(City city, Movie movie, Date date, int startTime);
}
