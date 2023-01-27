public class Values {
    public static void main(String[] args) {
        // Создадим массив,
        // в который положим результат вызова метода values()
        Genre[] genres = Genre.values();
        for (Genre genre : genres) {
            System.out.println(genre);
        }
    }

    enum Genre {
        HORROR,
        FICTION,
        FANTASY,
        FAIRY_TALE
    }
}
