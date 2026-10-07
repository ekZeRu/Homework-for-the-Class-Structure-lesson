public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Первая книга", 1800, "Первый автор", 4);
        Book book2 = new Book("Вторая книга", 2000, "Второй автор", 600);

        Book[] books = {book1, book2};

        System.out.println("Все книги");
        printBookInfo(1, book1);
        printBookInfo(2, book2);

        String searchWord = "Вторая";
        System.out.println("\nПоиск книг по слову \"" + searchWord + "\"");

        boolean found = false;
        for (int i = 0; i < books.length; i++) {
            if (books[i].matches(searchWord).equals("Да")) {
                printBookInfo(i + 1, books[i]);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Книга \"" + searchWord + "\" не найдена.");
        }
    }

    private static void printBookInfo(int number, Book book) {
        System.out.println(number +
                ". Название: " + book.title +
                ", Год: " + book.releaseYear +
                ", Автор: " + book.author +
                ", Страниц: " + book.pages +
                ", Большая? " + book.isBig() +
                ", Стоимость: " + book.estimatePrice() + " руб.");
    }
}