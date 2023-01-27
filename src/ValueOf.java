public class ValueOf {
        public static void main(String[] args) {
            // Создадим переменную с типом нашего перечисления,
            // в которую положим результат метода valueOf()
            Genre genre = Genre.valueOf("HORROR");
            System.out.println("Выбран жанр " + genre);
        }

    enum Genre {
        HORROR,
        FICTION,
        FANTASY,
        FAIRY_TALE
    }
}
