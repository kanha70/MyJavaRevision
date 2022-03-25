package Collection;

import java.util.ArrayList;
import java.util.Collections;

class Movie implements Comparable<Movie> {

    private double rating;
    private String name;
    private int year;

    //Used to sort Movie by year
    @Override
    public int compareTo(Movie o) {
        return this.year - o.year;

    }

    public Movie(double rating, String name, int year) {
        this.rating = rating;
        this.name = name;
        this.year = year;
    }

    public double getRating() {
        return rating;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }
}

public class ComparableEx {

    public static void main(String[] args) {
        ArrayList<Movie> list = new ArrayList<Movie>();
        list.add(new Movie(8.3,"Star wars",2015));
        list.add(new Movie(8.2,"Force Awakens" , 1997));
        list.add(new Movie(8.7,"Force Awakens" , 1996));
        list.add(new Movie(8.9,"Return of Rebel" , 1984));

        Collections.sort(list);
        System.out.println("Movie after sorting");
        for (Movie movie:list) {
            System.out.println(movie.getName()+" "+movie.getRating()+" "+movie.getYear());
        }
    }
}
