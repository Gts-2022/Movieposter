package ru.netology.manager;

public class PosterManager {

    private String[] movies = new String[0];

    public int limit=10;

    public PosterManager() {//Конмтрутор без параметров неизменяемый/По умолчанию 10 фильмов


    }

    public PosterManager(int limit) {//Конструктор с задаваемым параметром /лимитом фильмов
        this.limit = limit;
    }


    public void add(String movie) {//Создаем метод добавления фильмов
        String[] tmp = new String[movies.length + 1];//Создаем Новый массив равный старому +1 ячейка
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];  //Скопируем все элементы в новый массив из старого
        }
        tmp[tmp.length - 1] = movie;
        movies = tmp; //Присваеваеи полю movies новый массив


    }

    public String[] findAll() {//Метод вывода всех фильмов
        return movies;


    }

    public String[] findLast() {
        int numberOfFilms;
        if (movies.length < limit) {//Если количество фильмов меньше kbvbnf
            numberOfFilms = movies.length;//Отдает количество фильмов,сколько есть в массиве
        } else {//Иначе количество фильмов определенное лимитом
            numberOfFilms = limit;
        }
        String[] result = new String[numberOfFilms];//Создаём новый  массив из 10 фильмов
        for (int i = 0; i < result.length; ++i) {
            result[i] = movies[movies.length - 1 - i];//Вывод с последне добавленного(С конца)
        }
        return result;
    }
}
