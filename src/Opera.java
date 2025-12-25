import java.util.ArrayList;

public class Opera extends MusicalShow {
    private int choirSize; //количество человек в хоре

    public Opera(String title, double duration, ArrayList<Actor> listOfActors, ArrayList<Director> listOfDirectors,
                 Person musicAuthor, String librettoText, int choirSize) {
        super(title, duration, listOfActors, listOfDirectors, musicAuthor, librettoText);
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
        return "Название='" + title + '\'' +
                ", количество человек в хоре=" + choirSize +
                ", длительность (мин.)=" + duration +
                ", режиссёр=" + listOfDirectors +
                ", автор музыки=" + musicAuthor +
                '}';
    }
}

