package arefin;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Book> b1 = new ArrayList<>();

        b1.add(new FictionBook("The Great Gatsby", "F. Scott Fitzgerald", 15.99, "Classic"));
        b1.add(new NonFictionBook("Sapiens", "Yuval Noah Harari", 22.50, "History"));

        for (Book b : b1) {
            if (b instanceof FictionBook) {
                ((FictionBook) b).show();
            } else if (b instanceof NonFictionBook) {
                ((NonFictionBook) b).show();
            }
        }
    }
}
