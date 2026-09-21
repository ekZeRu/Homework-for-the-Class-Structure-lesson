public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Первая книга", 1800, "Первый автор", 4);
        Book book2 = new Book("Вторая книга", 2000, "Второй автор", 600);

        System.out.println("1");
        System.out.println("Название книги: " + book1.title +
                ", Год выпуска: " + book1.releaseYear +
                ", Автор: " + book1.author +
                ", Количество страниц: " + book1.pages +
                ", Книга большая? " + book1.isBig() +
                ", Содержит описание? " + book1.matches("Первая") +
                ", Стоимость: " + book1.estimatePrice() + " руб."
        );
        System.out.println("2");
        System.out.println("Название книги: " + book2.title +
                ", Год выпуска: " + book2.releaseYear +
                ", Автор: " + book2.author +
                ", Количество страниц: " + book2.pages +
                ", Книга большая? " + book2.isBig() +
                ", Содержит описание? " + book2.matches("Первая") +
                ", Стоимость: " + book2.estimatePrice() + " руб."
        );
    }
}
