package com.uc.mymvvm.network;

import com.uc.mymvvm.model.cast.CastResponse;
import com.uc.mymvvm.model.genre.GenreResponse;
import com.uc.mymvvm.model.movies.MovieResponse;
import com.uc.mymvvm.model.tvshow.TvShowResponse;
import com.uc.mymvvm.util.Constants;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitService {

    private ApiEndPoints api;
    private static RetrofitService service;

    private RetrofitService() {
        api = new Retrofit.Builder()
                .baseUrl(Constants.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(ApiEndPoints.class);
    }

    public static RetrofitService getInstance() {
        if (service == null) {
            service = new RetrofitService();
        }
        return service;
    }

    public Call<MovieResponse> getMovies(){
        return api.getMovies(Constants.API_KEY);
    }
    public Call<TvShowResponse> getTvShow(){
        return api.getTvShow(Constants.API_KEY);
    }

    public Call<GenreResponse> getGenres(String type, int id) {
        return api.getGenres(type, id, Constants.API_KEY);
    }

    public Call<CastResponse> getCasts(String type, int id) {
        return api.getCasts(type, id, Constants.API_KEY);
    }
}
