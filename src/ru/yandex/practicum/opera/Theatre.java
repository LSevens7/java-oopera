package ru.yandex.practicum.opera;

import java.util.ArrayList;
import java.util.List;

public class Theatre {
    public static void main(String[] args) {
        Actor fistActor = new Actor("Евгений", "Брюхин", Gender.MALE, 180);
        Actor secondActor = new Actor("Анна", "Плюшкина", Gender.FEMALE, 176);
        Actor thirdActor = new Actor("Джон", "До", Gender.MALE, 175);

        Director fistDirector = new Director("Андрей", "Завьялов", Gender.MALE, 2);
        Director secondDirector = new Director("Полина", "Жаронкова", Gender.FEMALE, 3);

        Person authorMusic = new Person("Людвиг", "Ван Бетховен", Gender.MALE);
        Person choreographer = new Person("Мариус", "Петипа", Gender.MALE);

        Show generalShow = new Show("Однажды в лесу", 60, fistDirector);
        Opera operaShow = new Opera("Травиата", 120, secondDirector, authorMusic, "Фигаро", 10);
        Ballet balletShow = new Ballet("Лебединное озеро", 110, fistDirector, authorMusic, "Вместо передач", choreographer);

        generalShow.addActor(fistActor);
        generalShow.addActor(secondActor);

        operaShow.addActor(secondActor);
        operaShow.addActor(thirdActor);

        balletShow.addActor(fistActor);
        balletShow.addActor(secondActor);
        balletShow.addActor(thirdActor);

        System.out.println("В обычной постановке участвуют:");
        generalShow.printActors();
        System.out.println("В оперной поставке участвуют:");
        operaShow.printActors();
        System.out.println("В баллетной постановке участвуют:");
        balletShow.printActors();

        System.out.println("После замены в обычной постановке");
        generalShow.replaceActor(thirdActor, "Брюхин");
        generalShow.printActors();

        operaShow.replaceActor(fistActor, "Холопов");
        operaShow.printActors();

        operaShow.printLibretto();
        balletShow.printLibretto();
    }
}
