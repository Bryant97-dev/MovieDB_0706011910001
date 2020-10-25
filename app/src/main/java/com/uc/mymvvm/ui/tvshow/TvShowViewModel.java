package com.uc.mymvvm.ui.tvshow;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.uc.mymvvm.model.tvshow.TvShow;
import com.uc.mymvvm.repository.TvShowRepository;

import java.util.List;

public class TvShowViewModel extends ViewModel {

    private TvShowRepository repository;

    public TvShowViewModel() {
        repository = TvShowRepository.getInstance();
    }

    public LiveData<List<TvShow>> getTvShowCollection(){
        return repository.getTvShowCollection();
    }
}
