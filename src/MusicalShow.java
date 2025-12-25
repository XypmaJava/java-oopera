import java.util.ArrayList;

public class MusicalShow extends Show {
    protected Person musicAuthor; //автор музыки
    protected String librettoText; //текст либретто

    public MusicalShow(String title, double duration, ArrayList<Actor> listOfActors, ArrayList<Director> listOfDirectors,
                       Person musicAuthor, String librettoText) {
        super(title, duration, listOfActors, listOfDirectors);
        this.librettoText = librettoText;
        this.musicAuthor = musicAuthor;
    }

    public Person getMusicAuthor() {
        return musicAuthor;
    }

    // сеттер для установки автора музыки
    public void setMusicAuthor(Person musicAuthor) {
        this.musicAuthor = musicAuthor;
    }

    void printLibrettoText() {
        System.out.println(librettoText);
    }

    @Override
    public String toString() {
        return "Название='" + title + '\'' +
                ", длительность=" + duration +
                ", режиссёр=" + listOfDirectors +
                "автор музыки=" + musicAuthor +
                '}';
    }
}
