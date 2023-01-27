package Book;

public class Book {
    String name;
    Genre genre;
    String author;

    Book(String name, String author, Genre genre) {
        this.genre = genre;
        this.name = name;
        this.author = author;
    }
}

// Создадим перечисление
enum Genre {
    HORROR,
    FICTION,
    FANTASY,
    FAIRY_TALE
}
