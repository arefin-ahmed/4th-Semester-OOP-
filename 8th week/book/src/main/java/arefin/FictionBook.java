package arefin;

class FictionBook extends Book {
    String genre;

    FictionBook(String title, String author, double price, String genre) {
        super(title, author, price);
        this.genre = genre;
    }

    void show() {
        System.out.println("Fiction: " + title + " | Genre: " + genre + " | $" + price);
    }
}
