package arefin;

public class Main 
{
        public static void main( String[] args )
    {
        movie m1 = new movie();
        m1.title = "Action Hero";
        m1.genre = "Action";
        m1.leadActor = "John";
        m1.director = "Smith";
        m1.releaseYear = 2023;
        m1.rating = 7;
        m1.checkReview();

        movie m2 = new movie();
        m2.title = "Sad Story";
        m2.genre = "Drama";
        m2.leadActor = "Mike";
        m2.director = "David";
        m2.releaseYear = 2022;
        m2.rating = 4;
        m2.checkReview();

        m1.display();
        m2.display();
    }

}
