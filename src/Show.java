import java.util.ArrayList;

public class Show {
    protected String title; //название
    protected double duration; //длительность в минутах
    protected ArrayList<Director> listOfDirectors; //режиссёр
    protected ArrayList<Actor> listOfActors; //список актёров

    public Show(String title, double duration, ArrayList<Actor> listOfActors, ArrayList<Director> listOfDirectors) {
        this.title = title;
        this.duration = duration;
        this.listOfActors = listOfActors;
        this.listOfDirectors = listOfDirectors;
    }

    public void addActor(Actor actor) { //добавление актёров
        if (listOfActors.contains(actor)) {
            System.out.println("Добавление невозможно, актёр уже участвует в спектакле");
        } else {
            listOfActors.add(actor);
        }
    }

    public void replaceActor(Actor newActor, String surname) {
        boolean found = false;
        for (int i = 0; i < listOfActors.size(); i++) {
            Actor actor = listOfActors.get(i);
            if (actor.surname.equals(surname)) {
                listOfActors.set(i, newActor);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Актёр с такой фамилией не найден.");
        }
    }

    public void printListOfActors() {
        for (Actor actor : listOfActors) {
            System.out.println(actor.toString());
        }
    }

    public void addDirector(Director director) {
        if (listOfDirectors.contains(director)) {
            System.out.println("Добавление невозможно, режиссёр уже указан");
        } else {
            listOfDirectors.add(director);
        }
    }

    @Override
    public String toString() {
        return "Название='" + title + '\'' +
                ", длительность (мин.)=" + duration +
                ", режиссёр=" + listOfDirectors;
    }
}

