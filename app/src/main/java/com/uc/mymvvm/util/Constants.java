package com.uc.mymvvm.util;

import androidx.annotation.StringDef;

import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.SOURCE;

public class Constants {
   // public static final String BASE_URL = "https://api.themoviedb.org/3/movie/{movie_id}/";
   // public static final String API_KEY = "c7947ca80820be0361a3d90f6e41f143";

    public static final String BASE_URL = "https://api.themoviedb.org/3/";
    public static final String BASE_IMAGE_URL = "https://image.tmdb.org/t/p/original";
    public static final String API_KEY = "c7947ca80820be0361a3d90f6e41f143";

    @Retention(SOURCE)
    @StringDef
    public @interface Type {
        String MOVIES = "movie";
        String TV_SHOWS = "tv";
    }
}
