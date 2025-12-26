import java.util.ArrayList;

public class Ballet extends MusicalShow {
    private Person choreographer; //хореограф

    public Ballet(String title, int duration, ArrayList<Actor> listOfActors, Director director,
                  Person musicAuthor, String librettoText, Person choreographer) {
        super(title, duration, listOfActors, director, musicAuthor, librettoText);
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
        return super.toString() + ", хореограф=" + choreographer;
    }
}

