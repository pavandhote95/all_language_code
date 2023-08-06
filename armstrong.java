
import java.util.Scanner;

public class armstrong {

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
            sum += Math.pow(digit, order);
            n = n / 10;

        }
        if (sum == arm) {
            System.out.println("number is arstrong ");
        } else {
            System.out.println("number is not arstrong ");
        }
    }

}

// import java.util.Scanner;

// public class armstrong {

// public static void main(String[] args) {
// Scanner scanner = new Scanner(System.in);

// System.out.println("Enter a number: ");
// int number = scanner.nextInt();

// int sum = 0;
// int temp = number;
// int digit=(str.length(n) (temp > 0) {
// int digit = temp % 10;
// sum += digit * digit * digit * digit;
// temp = temp / 10;
// }

// if (sum == number) {
// System.out.println("The number " + number + " is an Armstrong number.");
// } else {
// System.out.println("The number " + number + " is not an Armstrong number.");
// }
// }
// }