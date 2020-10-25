package com.uc.mymvvm.network;


import com.uc.mymvvm.model.cast.CastResponse;
import com.uc.mymvvm.model.genre.GenreResponse;
import com.uc.mymvvm.model.movies.MovieResponse;
import com.uc.mymvvm.model.tvshow.TvShowResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiEndPoints {

   @GET("discover/movie")
   Call<MovieResponse> getMovies(@Query("api_key")String apiKey);

    @GET("discover/tv")
    Call<TvShowResponse> getTvShow(@Query("api_key")String apiKey);

    @GET("movie/{movie_id}")
    Call<GenreResponse> getGenre(@Path("id") int id, @Query("api_key")String apiKey);

    @GET("{type}/{id}")
    Call<GenreResponse> getGenres(@Path("type") String type, @Path("id") int id, @Query("api_key") String apiKey);

    @GET("{type}/{id}/credits")
    Call<CastResponse> getCasts(@Path("type") String type, @Path("id") int id, @Query("api_key") String apiKey);
}
