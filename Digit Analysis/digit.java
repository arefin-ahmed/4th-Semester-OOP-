import java.util.Scanner;

public class digit 
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num, digit, count = 0, sum = 0;

        System.out.print("Enter a number: ");
        num = sc.nextInt();

        while (num > 0)
        {
            digit = num % 10;
            sum += digit;
            count ++;
            num = num / 10;
        }
        System.out.print("Number of digits: " + count);
        System.out.println();
        System.out.print("Sum of digits: " + sum);
        sc.close();
    } 
    
}
