package ru.yandex.practicum.opera;

public class MusicalShow extends Show {
    protected Person musicAuthor;
    protected String librettoText;

    public MusicalShow(String title,
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
