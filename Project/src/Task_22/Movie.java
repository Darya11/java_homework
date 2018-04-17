package Task_22;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

public class Movie {
    private Map<TodayFilm, Integer> map;
    private int counter;

    public Movie() {
        this.map = new LinkedHashMap<>();
    }

    public void printPoster(){
        System.out.println(map);
    }

    public void seePoster(){

        map.put(new TodayFilm("True or action", "Jeff Vadlow", "horror, thriller", 100),++counter);
        map.put(new TodayFilm("The first player to get ready", "Stephen Spielberg", "science fiction," +
                " action movie, adventure", 140), ++counter);
        map.put(new TodayFilm("Pacific Rim: Rise", "Stephen S. DeNight","science fiction, action film",
                110), ++counter);
    }

    private class TodayFilm{
        private String name;
        private String producer;
        private String genre;
        private int time;

        public TodayFilm(String name, String producer, String genre, int time) {
            this.name = name;
            this.producer = producer;
            this.genre = genre;
            this.time = time;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            TodayFilm todayFilm = (TodayFilm) o;
            return time == todayFilm.time &&
                    Objects.equals(name, todayFilm.name) &&
                    Objects.equals(producer, todayFilm.producer) &&
                    Objects.equals(genre, todayFilm.genre);
        }

        @Override
        public int hashCode() {

            return Objects.hash(name, producer, genre, time);
        }

        @Override
        public String toString() {
            return "TodayFilm{" +
                    "name='" + name + '\'' +
                    ", producer='" + producer + '\'' +
                    ", genre='" + genre + '\'' +
                    ", time=" + time + " minutes " +
                    '}';
        }
    }
}
