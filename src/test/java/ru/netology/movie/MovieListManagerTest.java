package ru.netology.movie;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieListManagerTest {

    @Test
    public void testAddFiveMovieLimitDefault() {
        MovieListManager manager = new MovieListManager();
        manager.addMovie("Movie 1");
        manager.addMovie("Movie 2");
        manager.addMovie("Movie 3");
        manager.addMovie("Movie 4");
        manager.addMovie("Movie 5");
        Assertions.assertArrayEquals(new String[]{"Movie 1", "Movie 2", "Movie 3", "Movie 4", "Movie 5"}, manager.findAll());
    }
    @Test
    public void testAddAboveMovieLimitDefault() {
        MovieListManager manager = new MovieListManager();
        manager.addMovie("Movie 1");
        manager.addMovie("Movie 2");
        manager.addMovie("Movie 3");
        manager.addMovie("Movie 4");
        manager.addMovie("Movie 5");
        manager.addMovie("Movie 6");
        Assertions.assertArrayEquals(new String[]{"Movie 1", "Movie 2", "Movie 3", "Movie 4", "Movie 5"}, manager.findAll());
    }
    @Test
    public void testAddOneMovieLimitDefault() {
        MovieListManager manager = new MovieListManager();
        manager.addMovie("Movie 1");
        Assertions.assertArrayEquals(new String[]{"Movie 1"}, manager.findAll());
    }
    @Test
    public void testAddNoneMovieLimitDefault() {
        MovieListManager manager = new MovieListManager();
        manager.addMovie(null);
        Assertions.assertArrayEquals(new String[]{null}, manager.findAll());
    }
    @Test
    public void testAddSevenMovieLimitPersonal() {
        MovieListManager manager = new MovieListManager(7);
        manager.addMovie("Movie 1");
        manager.addMovie("Movie 2");
        manager.addMovie("Movie 3");
        manager.addMovie("Movie 4");
        manager.addMovie("Movie 5");
        manager.addMovie("Movie 6");
        manager.addMovie("Movie 7");
        Assertions.assertArrayEquals(new String[]{"Movie 1", "Movie 2", "Movie 3", "Movie 4", "Movie 5", "Movie 6", "Movie 7"}, manager.findAll());
    }
    @Test
    public void testAddEightMovieLimitPersonal() {
        MovieListManager manager = new MovieListManager(7);
        manager.addMovie("Movie 1");
        manager.addMovie("Movie 2");
        manager.addMovie("Movie 3");
        manager.addMovie("Movie 4");
        manager.addMovie("Movie 5");
        manager.addMovie("Movie 6");
        manager.addMovie("Movie 7");
        manager.addMovie("Movie 8");
        Assertions.assertArrayEquals(new String[]{"Movie 1", "Movie 2", "Movie 3", "Movie 4", "Movie 5", "Movie 6", "Movie 7"}, manager.findAll());
    }
    @Test
    public void testAddThreeMovieLimitPersonal() {
        MovieListManager manager = new MovieListManager(3);
        manager.addMovie("Movie 1");
        manager.addMovie("Movie 2");
        manager.addMovie("Movie 3");
        Assertions.assertArrayEquals(new String[]{"Movie 1", "Movie 2", "Movie 3"}, manager.findAll());
    }
    @Test
    public void testAddTwoMovieLimitPersonal() {
        MovieListManager manager = new MovieListManager(3);
        manager.addMovie("Movie 1");
        manager.addMovie("Movie 2");
        Assertions.assertArrayEquals(new String[]{"Movie 1", "Movie 2"}, manager.findAll());
    }
    @Test
    public void testAddTwoOneMoreMovieLimitPersonal() {
        MovieListManager manager = new MovieListManager(3);
        manager.addMovie("Movie 1");
        manager.addMovie("Movie 2");
        Assertions.assertArrayEquals(new String[]{"Movie 1", "Movie 2"}, manager.findAll());
        manager.addMovie("Movie 4");
        Assertions.assertArrayEquals(new String[]{"Movie 1", "Movie 2", "Movie 4"}, manager.findAll());
    }
    @Test
    public void testFindLastMovieLimitPersonal() {
        MovieListManager manager = new MovieListManager(4);
        manager.addMovie("Movie 1");
        manager.addMovie("Movie 2");
        manager.addMovie("Movie 3");
        manager.addMovie("Movie 4");
        Assertions.assertArrayEquals(new String[]{"Movie 4", "Movie 3", "Movie 2", "Movie 1"}, manager.findLast());
    }
    @Test
    public void testFindLastMovieLimitDefault() {
        MovieListManager manager = new MovieListManager();
        manager.addMovie("Movie 1");
        manager.addMovie("Movie 2");
        manager.addMovie("Movie 3");
        manager.addMovie("Movie 4");
        Assertions.assertArrayEquals(new String[]{"Movie 4", "Movie 3", "Movie 2", "Movie 1"}, manager.findLast());
    }
    @Test
    public void testFindLastMovieLimitPersonalEmpty() {
        MovieListManager manager = new MovieListManager(4);
        Assertions.assertArrayEquals(new String[]{}, manager.findLast());
    }

    @Test
    public void testFindLastMovieLimitPersonalLess() {
        MovieListManager manager = new MovieListManager(4);
        manager.addMovie("Movie 1");
        manager.addMovie("Movie 2");
        Assertions.assertArrayEquals(new String[]{"Movie 2", "Movie 1"}, manager.findLast());
    }

    @Test
    public void testFindLastMovieLimitPersonalEqual() {
        MovieListManager manager = new MovieListManager(4);
        manager.addMovie("Movie 1");
        manager.addMovie("Movie 2");
        manager.addMovie("Movie 3");
        manager.addMovie("Movie 4");
        Assertions.assertArrayEquals(new String[]{"Movie 4", "Movie 3", "Movie 2", "Movie 1"}, manager.findLast());
    }

    @Test
    public void testFindLastMovieLimitPersonalMore() {
        MovieListManager manager = new MovieListManager(4);
        manager.addMovie("Movie 1");
        manager.addMovie("Movie 2");
        manager.addMovie("Movie 3");
        manager.addMovie("Movie 4");
        manager.addMovie("Movie 5");
        manager.addMovie("Movie 6");
        Assertions.assertArrayEquals(new String[]{"Movie 4", "Movie 3", "Movie 2", "Movie 1"}, manager.findLast());
    }

    @Test
    public void testFindLastMovieLimitDefaultEmpty() {
        MovieListManager manager = new MovieListManager();
        Assertions.assertArrayEquals(new String[]{}, manager.findLast());
    }
}
