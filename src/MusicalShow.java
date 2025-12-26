import java.util.ArrayList;

public class MusicalShow extends Show {
    protected Person musicAuthor; //автор музыки
    protected String librettoText; //текст либретто

    public MusicalShow(String title, int duration, ArrayList<Actor> listOfActors, Director director,
                       Person musicAuthor, String librettoText) {
        super(title, duration, listOfActors, director);
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

    public void printLibrettoText() {
        System.out.println(librettoText);
    }

    @Override
    public String toString() {
        return "Название='" + title + '\'' +
                ", длительность=" + duration +
                ", режиссёр=" + director +
                "автор музыки=" + musicAuthor;
    }
}
