import java.util.Scanner;

public class character {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String word;
        int vowels = 0, consonents = 0;

        System.out.print("Enter a string: ");
        word = sc.nextLine();

                          // length of the string -> word.lemgth()
        for (int i = 0; i < word.length(); i++) 
            {
                             // Returns the char value of a string -> word.charAt(i)
            char ch = word.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') 
            {
                vowels++;
            } 
            else if (Character.isLetter(ch))
            {
                consonents++;
            }
        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonents: " + consonents);
        sc.close();
    }
}
