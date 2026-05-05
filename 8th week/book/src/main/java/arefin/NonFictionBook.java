package arefin;

class NonFictionBook extends Book {
    String topic;

    NonFictionBook(String title, String author, double price, String topic) {
        super(title, author, price);
        this.topic = topic;
    }

    void show() {
        System.out.println("Non-Fiction: " + title + " | Topic: " + topic + " | $" + price);
    }
}
