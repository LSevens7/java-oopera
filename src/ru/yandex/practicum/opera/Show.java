package ru.yandex.practicum.opera;

import java.util.ArrayList;

public class Show {
    String title;
    int duration;
    Director director;
    ArrayList<Actor> listOfActor = new ArrayList<>();

    Show(String title, int duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
    }

    void printActors() {
        for (Actor actor : listOfActor) {
            System.out.println(actor.toString());
        }
    }

    void addActor(Actor newActor) {
        for (Actor actor : listOfActor) {
            if (newActor.equals(actor)) {
                System.out.println("Такой актер уже присутствует в списке");
                return;
            }
        }
        listOfActor.add(newActor);
    }


    void replaceActor(Actor newActor, String surname) {
        for (int i = 0; i < listOfActor.size(); i++) {
            if (listOfActor.get(i).getSurname().equals(surname)) {
                listOfActor.set(i, newActor);
            }
        }
    }
}
