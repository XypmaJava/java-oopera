import java.util.ArrayList;

public class Show {
    protected String title; //название
    protected int duration; //длительность в минутах
    protected Director director; //режиссёр
    protected ArrayList<Actor> listOfActors = new ArrayList<>(); //список актёров

    public Show(String title, int duration, ArrayList<Actor> listOfActors, Director director) {
        this.title = title;
        this.duration = duration;
        this.listOfActors = listOfActors;
        this.director = director;
    }

    public void addActor(Actor actor) { //добавление актёров
        if (listOfActors.contains(actor)) {
            System.out.println("Добавление невозможно, актёр уже участвует в спектакле");
        } else {
            listOfActors.add(actor);
        }
    }

    public void replaceActor(Actor newActor, String surname, String name) {
        boolean found = false;
        for (int i = 0; i < listOfActors.size(); i++) {
            Actor actor = listOfActors.get(i);
            if (actor.surname.equals(surname) && actor.name.equals(name)) {
                listOfActors.set(i, newActor);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Актёр с такой фамилией и именем не найден.");
        }
    }

    public void printListOfActors() {
        for (Actor actor : listOfActors) {
            System.out.println(actor.toString());
        }
    }

    @Override
    public String toString() {
        return "Название='" + title + '\'' +
                ", длительность (мин.)=" + duration +
                ", режиссёр=" + director;
    }
}

