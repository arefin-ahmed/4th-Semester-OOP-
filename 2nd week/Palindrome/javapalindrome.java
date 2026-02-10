import java.util.Scanner;

public class javapalindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        if (isPalindrome(num)) {
            System.out.println("The number is a Palindrome.");
        } else {
            System.out.println("The number is not a Palindrome.");
        }
        input.close();
    }

    public static boolean isPalindrome(int num)
    {
        int originalNum = num;
        int reverseNum = 0;

        while (num != 0)
        {
            int digit = num % 10;
            reverseNum = reverseNum * 10 + digit;
            num /= 10;
        }
        return originalNum == reverseNum;
    }
}
