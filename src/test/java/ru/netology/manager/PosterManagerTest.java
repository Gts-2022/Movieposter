package ru.netology.manager;
import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;



public class PosterManagerTest {

    @Test
    public void addMovies() {//Добавление фильмов
        PosterManager manager = new PosterManager();//Создан репозиторий
        manager.add("movie1");//Менеджер заполнен позициями афиши
        manager.add("movie2");
        manager.add("movie3");
        manager.add("movie4");

        String[] expected = {"movie1", "movie2", "movie3", "movie4" };
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void outInReverseOrderWithLimit() {//Вывод фильмов в обратном порядке с ограниченым лимитом
        PosterManager manager = new PosterManager();//Создан репозиторий
        manager.add("movie1");//Менеджер заполнен позициями афиши
        manager.add("movie2");
        manager.add("movie3");
        manager.add("movie4");

        String[] expected = {"movie4", "movie3", "movie2", "movie1" };
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void outInReverseOrder() {//Вывод фильмов в обратном порядке с изиеняемым лимитом лимитом
        PosterManager manager = new PosterManager(5);//Создан репозиторий
        manager.add("movie1");//Менеджер заполнен позициями афиши
        manager.add("movie2");
        manager.add("movie3");
        manager.add("movie4");

        String[] expected = {"movie4", "movie3", "movie2", "movie1" };
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldResultFindAll() {
        PosterManager manager = new PosterManager();//Создан репозиторий
        manager.add("movie1");//Менеджер заполнен позициями афиши
        manager.add("movie2");
        manager.add("movie3");
        manager.add("movie4");
        String[] expected = {"movie1", "movie2", "movie3", "movie4" };
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

}