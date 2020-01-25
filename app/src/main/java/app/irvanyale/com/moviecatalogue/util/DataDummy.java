package app.irvanyale.com.moviecatalogue.util;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import app.irvanyale.com.moviecatalogue.R;
import app.irvanyale.com.moviecatalogue.data.MovieEntity;

public class DataDummy {

    public static List<MovieEntity> generateDummyMovies(Context context) {

        List<MovieEntity> movies = new ArrayList<>();

        movies.add(new MovieEntity(
                "332562",
                "A Star Is Born",
                "2018-04-25",
                context.getResources().getString(R.string.m1),
                "7.5",
                context.getResources().getDrawable(R.mipmap.poster_a_start_is_born)));

        movies.add(new MovieEntity(
                "399579",
                "Alita: Battle Angel",
                "2019-01-31",
                context.getResources().getString(R.string.m2),
                "6.9",
                context.getResources().getDrawable(R.mipmap.poster_alita)));

        movies.add(new MovieEntity(
                "297802",
                "Aquaman",
                "2018-12-07",
                context.getResources().getString(R.string.m3),
                "6.8",
                context.getResources().getDrawable(R.mipmap.poster_aquaman)));

        movies.add(new MovieEntity(
                "424694",
                "Bohemian Rhapsody",
                "2018-10-24",
                context.getResources().getString(R.string.m4),
                "8.0",
                context.getResources().getDrawable(R.mipmap.poster_bohemian)));

        movies.add(new MovieEntity(
                "438650",
                "Cold Pursuit",
                "2019-02-07",
                context.getResources().getString(R.string.m5),
                "5.4",
                context.getResources().getDrawable(R.mipmap.poster_cold_persuit)));

        movies.add(new MovieEntity(
                "480530",
                "Creed II",
                "2018-11-21",
                context.getResources().getString(R.string.m6),
                "6.8",
                context.getResources().getDrawable(R.mipmap.poster_creed)));

        movies.add(new MovieEntity(
                "338952",
                "Fantastic Beasts: The Crimes of Grindelwald",
                "2018-11-14",
                context.getResources().getString(R.string.m7),
                "6.8",
                context.getResources().getDrawable(R.mipmap.poster_crimes)));

        movies.add(new MovieEntity(
                "450465",
                "Glass",
                "2019-01-16",
                context.getResources().getString(R.string.m8),
                "6.5",
                context.getResources().getDrawable(R.mipmap.poster_glass)));

        movies.add(new MovieEntity(
                "166428",
                "How to Train Your Dragon: The Hidden World",
                "2019-01-03",
                context.getResources().getString(R.string.m9),
                "7.7",
                context.getResources().getDrawable(R.mipmap.poster_how_to_train)));

        movies.add(new MovieEntity(
                "299536",
                "Avengers: Infinity War",
                "2018-10-03",
                context.getResources().getString(R.string.m10),
                "8.3",
                context.getResources().getDrawable(R.mipmap.poster_infinity_war)));

        return movies;
    }
}
