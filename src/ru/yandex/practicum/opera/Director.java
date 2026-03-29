package ru.yandex.practicum.opera;

public class Director extends Person{

    private int numberOfShows;

    Director(String name, String surname, Gender gender, int numberOfShows) {
        super(name, surname, gender);
        this.numberOfShows = numberOfShows;
    }

}
