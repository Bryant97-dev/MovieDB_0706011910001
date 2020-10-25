package com.uc.mymvvm.ui.detail;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.uc.mymvvm.model.cast.Cast;
import com.uc.mymvvm.model.genre.Genre;
import com.uc.mymvvm.repository.MovieRepository;
import com.uc.mymvvm.repository.TvShowRepository;

import java.util.List;

public class DetailViewModel extends ViewModel {
    private MovieRepository movieRepository;
    private TvShowRepository tvShowRepository;

    public DetailViewModel() {
        movieRepository = MovieRepository.getInstance();
        tvShowRepository = TvShowRepository.getInstance();
    }

    public LiveData<List<Genre>> getMovieGenre(int id) {
        return movieRepository.getGenres(id);
    }

    public LiveData<List<Genre>> getTvShowGenre(int id) {
        return tvShowRepository.getGenres(id);
    }

    public LiveData<List<Cast>> getShowCast(int id) {
        return tvShowRepository.getCasts(id);
    }

    public LiveData<List<Cast>> getMovieCast(int id) {
        return movieRepository.getCasts(id);
    }
}
