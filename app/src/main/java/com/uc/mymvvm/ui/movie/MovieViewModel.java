package com.uc.mymvvm.ui.movie;

import com.uc.mymvvm.model.movies.Movie;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.uc.mymvvm.repository.MovieRepository;

import java.util.List;

public class MovieViewModel extends ViewModel {
    private MovieRepository repository;

    public MovieViewModel(){
        repository = MovieRepository.getInstance();
    }

    public MutableLiveData<List<Movie>> getMovieCollection(){
        return  repository.getMovieCollection();
    }
}
