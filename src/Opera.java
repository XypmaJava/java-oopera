import java.util.ArrayList;

public class Opera extends MusicalShow {
    private int choirSize; //количество человек в хоре

    public Opera(String title, int duration, ArrayList<Actor> listOfActors, Director director,
                 Person musicAuthor, String librettoText, int choirSize) {
        super(title, duration, listOfActors, director, musicAuthor, librettoText);
        this.choirSize = choirSize;
    }

    public int getChoirSize() {
        return choirSize;
    }

    public void setChoirSize(int choirSize) {
        this.choirSize = choirSize;
    }

    @Override
    public String toString() {
        return super.toString() + ", количество человек в хоре=" + choirSize;
    }
}

