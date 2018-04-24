package com.crowsoft.kazimamun.practicerecyclerview;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by kazia on 29-May-16.
 */
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {


    public List<Movie> movieList;

    public MyAdapter(List<Movie> movieList) {
        this.movieList = movieList;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        public TextView txtMovieName, txtMovieGener, txtMovieYear;

        public MyViewHolder(View itemView) {

            super(itemView);
            txtMovieName = (TextView) itemView.findViewById(R.id.txtMovieName);
            txtMovieGener = (TextView) itemView.findViewById(R.id.txtMovieGener);
            txtMovieYear = (TextView) itemView.findViewById(R.id.txtMovieYear);
        }
    }

    @Override
    public MyAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.movie_row, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyAdapter.MyViewHolder holder, int position) {

        Movie movie = movieList.get(position);
        Log.d("Movie Name", movie.getMovieName());
        holder.txtMovieName.setText(movie.getMovieName());
        holder.txtMovieGener.setText(movie.getMovieGener());
        holder.txtMovieYear.setText(movie.getMovieYear());

    }

    @Override
    public int getItemCount() {
        Log.d("List Size: ", String.valueOf(movieList.size()));
        return movieList.size();
    }
}
