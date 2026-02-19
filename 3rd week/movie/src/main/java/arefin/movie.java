package arefin;

public class movie {
        String title;
        String genre;
        String leadActor;
        String director;
        int releaseYear;
        double rating;
        String review;

        void checkReview() {
            if (rating < 5) {
                review = "Not Good";
            } else {
                review = "Good";
            }
        }

        void display() 
        {
            System.out.println("Title: " + title);
            System.out.println("Genre: " + genre);
            System.out.println("Lead Actor: " + leadActor);
            System.out.println("Director: " + director);
            System.out.println("Release Year: " + releaseYear);
            System.out.println("Rating: " + rating);
            System.out.println("Review: " + review);
            System.out.println("");
        }
}
