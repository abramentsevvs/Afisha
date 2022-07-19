package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AfishaManagerTest {
    Cinema one = new Cinema(1, "One");
    Cinema two = new Cinema(2, "Two");
    Cinema three = new Cinema(3, "Three");
    Cinema four = new Cinema(4, "Four");
    Cinema five = new Cinema(5, "Five");
    Cinema six = new Cinema(6, "Six");
    Cinema seven = new Cinema(7, "Seven");
    Cinema eight = new Cinema(8, "Eight");
    Cinema nine = new Cinema(9, "Nine");
    Cinema ten = new Cinema(10, "Ten");
    Cinema eleven = new Cinema(11, "Eleven");

    @Test
    void checkCinemaLimit() {
        AfishaManager manager = new AfishaManager();
        int actual = manager.getLimitMovies();
        int expected = 10;
        assertEquals(expected, actual);
    }

    @Test
    void addCinema() {
        AfishaManager manager = new AfishaManager();
        manager.addMovie(one);
        manager.addMovie(two);
        Cinema[] expected = {one, two};
        Cinema[] actual = manager.findAll();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void showNullCinema() {
        AfishaManager manager = new AfishaManager();
        Cinema[] expected = {};
        Cinema[] actual = manager.findAll();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void addTenCinema() {
        AfishaManager manager = new AfishaManager();
        manager.addMovie(one);
        manager.addMovie(two);
        manager.addMovie(three);
        manager.addMovie(four);
        manager.addMovie(five);
        manager.addMovie(six);
        manager.addMovie(seven);
        manager.addMovie(eight);
        manager.addMovie(nine);
        manager.addMovie(ten);
        Cinema[] expected = {one, two, three, four, five, six, seven, eight, nine, ten};
        Cinema[] actual = manager.findAll();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddAllCinema() {
        AfishaManager manager = new AfishaManager(11);
        manager.addMovie(one);
        manager.addMovie(two);
        manager.addMovie(three);
        manager.addMovie(four);
        manager.addMovie(five);
        manager.addMovie(six);
        manager.addMovie(seven);
        manager.addMovie(eight);
        manager.addMovie(nine);
        manager.addMovie(ten);
        manager.addMovie(eleven);
        Cinema[] expected = {one, two, three, four, five, six, seven, eight, nine, ten, eleven};
        Cinema[] actual = manager.findAll();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastTenCinema() {
        AfishaManager manager = new AfishaManager(10);
        manager.addMovie(one);
        manager.addMovie(two);
        manager.addMovie(three);
        manager.addMovie(four);
        manager.addMovie(five);
        manager.addMovie(six);
        manager.addMovie(seven);
        manager.addMovie(eight);
        manager.addMovie(nine);
        manager.addMovie(ten);
        manager.addMovie(eleven);
        Cinema[] expected = {eleven, ten, nine, eight, seven, six, five, four, three, two};
        Cinema[] actual = manager.findLast();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastFiveCinema() {
        AfishaManager manager = new AfishaManager(5);
        manager.addMovie(one);
        manager.addMovie(two);
        manager.addMovie(three);
        manager.addMovie(four);
        manager.addMovie(five);
        manager.addMovie(six);

        Cinema[] expected = {six, five, four, three, two};
        Cinema[] actual = manager.findLast();

        assertArrayEquals(expected, actual);
    }
}
