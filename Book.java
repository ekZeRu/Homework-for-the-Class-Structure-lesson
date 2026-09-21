public class Book {
    public String title;
    public int releaseYear;
    public String author;
    public int pages;

    public Book(String title, int releaseYear, String author, int pages) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.author = author;
        this.pages = pages;
    }

    public String isBig() {
        return pages > 500 ? "Да" : "Нет";
    }

    public String matches(String word) {
        return (title.contains(word) || author.contains(word)) ? "Да" : "Нет";
    }

    public int estimatePrice() {
        int price = pages * 3;
        return Math.max(price, 250);
    }
}
