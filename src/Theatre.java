import java.util.ArrayList;

public class Theatre {
    public static void main(String[] args) {

        ArrayList<Actor> actors = new ArrayList<>();

        actors.add(new Actor("Александр", "Мурашкинцев", Gender.MALE, 170));
        actors.add(new Actor("Дамир", "Валиев", Gender.MALE, 168));
        actors.add(new Actor("Лилия", "Асмандиярова", Gender.FEMALE, 162));

        Director director = new Director("Ксения", "Ларионова", Gender.FEMALE, 2);

        Person musicAuthor = new Person("Алсу", "Насырова", Gender.FEMALE); //автор музыки

        Person choreographer = new Person("Стелла", "Ларионова", Gender.FEMALE); //хореограф

        Show regularShow = new Show("Обычный спектакль", 120, new ArrayList<>(), director);
        Opera operaShow = new Opera("Оперный спектакль", 90, new ArrayList<>(), director,
                musicAuthor, "Текст либретто оперы", 12);
        Ballet balletShow = new Ballet("Балет", 60, new ArrayList<>(), director,
                musicAuthor, "Текст либретто балета", choreographer);

        // Добавляем актёров в спектакли
        regularShow.addActor(actors.get(0)); // Александр Мурашкинцев участвует в обычном спектакле
        operaShow.addActor(actors.get(1));   // Дамир Валиев участвует в оперном спектакле
        balletShow.addActor(actors.get(2));  // Лилия Асмандиярова участвует в балете

        // Один актёр может участвовать в нескольких спектаклях
        regularShow.addActor(actors.get(1)); // Дамир Валиев также участвует в обычном спектакле

        System.out.println(regularShow);
        System.out.println("\nАктёры обычного спектакля:");
        regularShow.printListOfActors();

        System.out.println("\n" + operaShow);
        System.out.println("\nАктёры оперного спектакля:");
        operaShow.printListOfActors();

        System.out.println("\n" + balletShow);
        System.out.println("\nАктёры балета:");
        balletShow.printListOfActors();

        regularShow.replaceActor(actors.get(2), "Валиев", "Дамир"); //замена актёра

        System.out.println("\nАктёры обычного спектакля:");
        regularShow.printListOfActors();

        operaShow.replaceActor(actors.get(1), "Зорин", "Дмитрий");

        System.out.println("\nТекст либретто оперного спектакля:");
        operaShow.printLibrettoText();

        System.out.println("\nТекст либретто балета:");
        balletShow.printLibrettoText();
    }
}