package Book;

public class Test {
    public static void main(String[] args) {

        // Создадим объект класса Book
        Book book = new Book("Dracula", "Bram Stoker", Genre.HORROR);
        System.out.println("Book " + book.name + " has a type " + book.genre);

        // Объявим конструкцию switch
        // В параметре указываем поле, объекты которого будем перебирать
        switch(book.genre){
            // В блоках case указываем варианты реализаций enum'а
            case FICTION:
                System.out.println("Fiction");
                break;
            case HORROR:
                System.out.println("Horror");
                break;
            case FAIRY_TALE:
                System.out.println("Fairy tale");
                break;
            case FANTASY:
                System.out.println("Fantasy");
                break;
        }
    }
}
