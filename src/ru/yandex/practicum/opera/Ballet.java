package ru.yandex.practicum.opera;

public class Ballet extends MusicalShow {
    private Person choreographer;

    Ballet(String title,
           int duration,
           Director director,
           Person musicAuthor,
           String librettoText,
           Person choreographer) {
        super(title, duration, director, musicAuthor, librettoText);
        this.choreographer = choreographer;
    }
}
