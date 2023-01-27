public class Test1 {
        public static void main(String[] args) {
            for (Day day : Day.values()) {
                System.out.println("Type of day is " + day.getDayType());
            }
        }
    // Создаем перечисление
    enum Day{

        // Наполняем enum константами
        // Создаем их в соответствии с конструктором
        MONDAY("Weekday"),
        TUESDAY("Weekday"),
        WEDNESDAY("Weekday"),
        THURSDAY("Weekday"),
        FRIDAY("Weekday"),
        SATURDAY("Day off"),
        SUNDAY("Day off");

        // Создаем приватное поле
        private String dayType;

        // Создаем конструктор, который принимает значение поля
        Day(String dayType) {
            this.dayType = dayType;
        }

        // Создаем геттер для поля
        public String getDayType() {
            return dayType;
        }
    }
}
