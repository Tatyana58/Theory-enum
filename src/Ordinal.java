public class Ordinal {
    public static void main(String[] args) {
        // В цикле foreach проходим по массиву,
        // который получаем в результате вызова метода Genre.values()
        for (Genre genre : Genre.values()) {
            // В результате в консоль будут выведены константы
            // и их порядковые номера (ячейки массива)
            System.out.println(genre + " " + genre.ordinal());
        }
    }
}

enum Genre {
    HORROR,
    FICTION,
    FANTASY,
    FAIRY_TALE
}
