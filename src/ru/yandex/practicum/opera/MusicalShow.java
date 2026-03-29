package ru.yandex.practicum.opera;

import java.util.ArrayList;

public class MusicalShow extends Show {
    Person musicAuthor;
    String librettoText;

    MusicalShow(String title,
                int duration,
                Director director,
                Person musicAuthor,
                String librettoText) {
        super(title, duration, director);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    void printLibretto() {
        System.out.println(librettoText);
    }
}
