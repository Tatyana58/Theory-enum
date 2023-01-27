public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // Переменную ссылаем на конкретную константу
        // через имя перечисления
        Day current = Day.MONDAY;
        System.out.println(current); // MONDAY
    }
}

enum Day {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
}
