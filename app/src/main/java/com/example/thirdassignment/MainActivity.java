package com.example.thirdassignment;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView moviesList_rv;
    MovieAdapter movieAdapter;

    List<Movie> movieList  = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        movieList.add(new Movie("Inception ","Leonardo DiCaprio","Sci-fi/Thriller","04/09/2010"));
        movieList.add(new Movie("Cowboy Bebop ","Kōichi Yamadera","Greatest Anime/Series Ever Made","20/01/1998"));
        movieList.add(new Movie("Endgame","Thanos","For the memes","10/04/2018"));
        movieList.add(new Movie("Inception ","Leonardo DiCaprio","Sci-fi/Thriller","04/09/2010"));
        movieList.add(new Movie("Cowboy Bebop ","Kōichi Yamadera","Greatest Anime/Series Ever Made","20/01/1998"));
        movieList.add(new Movie("Endgame","Thanos","For the memes","10/04/2018"));
        movieList.add(new Movie("Inception ","Leonardo DiCaprio","Sci-fi/Thriller","04/09/2010"));
        movieList.add(new Movie("Cowboy Bebop ","Kōichi Yamadera","Greatest Anime/Series Ever Made","20/01/1998"));
        movieList.add(new Movie("Endgame","Thanos","For the memes","10/04/2018"));
        movieList.add(new Movie("Inception ","Leonardo DiCaprio","Sci-fi/Thriller","04/09/2010"));
        movieList.add(new Movie("Cowboy Bebop ","Kōichi Yamadera","Greatest Anime/Series Ever Made","20/01/1998"));
        movieList.add(new Movie("Endgame","Thanos","For the memes","10/04/2018"));

        moviesList_rv = findViewById(R.id.moviesList_rv);
        moviesList_rv.setLayoutManager(new LinearLayoutManager(this));
        movieAdapter = new MovieAdapter(this ,movieList);
        moviesList_rv.setAdapter(movieAdapter);
    }
}
