
import java.util.Scanner;

public class palindrome {

    public static void main(String[] args) {

        System.out.println("Enter your number ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int arm = n;
        int digit;
        int order = String.valueOf(n).length();

        while (n > 0) {
            digit = n % 10;
            sum = sum * 10 + digit;
            n = n / 10;

        }
        if (sum == arm) {
            System.out.println("number is Palindrome ");
        } else {
            System.out.println("number is not Palindrome ");
        }
    }

}