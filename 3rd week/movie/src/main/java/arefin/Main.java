package arefin;

public class Main 
{
        public static void main( String[] args )
    {
        movie m1 = new movie();
        m1.title = "Action Hero";
        m1.genre = "Action";
        m1.leadActor = "AR Rahman";
        m1.director = "Arefin";
        m1.releaseYear = 2023;
        m1.rating = 7;
        m1.checkReview();

        movie m2 = new movie();
        m2.title = "Ulab Day";
        m2.genre = "Drama";
        m2.leadActor = "Tamin Iqbal";
        m2.director = "Arefin";
        m2.releaseYear = 2022;
        m2.rating = 4;
        m2.checkReview();

        m1.display();
        m2.display();
    }

}
