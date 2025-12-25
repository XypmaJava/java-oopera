import java.util.ArrayList;

public class Ballet extends MusicalShow {
    private Person choreographer; //хореограф

    public Ballet(String title, double duration, ArrayList<Actor> listOfActors, ArrayList<Director> listOfDirectors,
                  Person musicAuthor, String librettoText, Person choreographer) {
        super(title, duration, listOfActors, listOfDirectors, musicAuthor, librettoText);
        this.choreographer = choreographer;
    }

    public Person getChoreographer() {
        return choreographer;
    }

    public void setChoreographer(Person choreographer) {
        this.choreographer = choreographer;
    }

    @Override
    public String toString() {
        return "Название='" + title + '\'' +
                ", длительность (мин.)=" + duration +
                ", режиссёр=" + listOfDirectors +
                ", автор музыки=" + musicAuthor +
                ", хореограф=" + choreographer +
                '}';
    }
}

