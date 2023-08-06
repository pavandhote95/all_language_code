import java.util.Scanner;

public class second {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter your age : ");
            int age = sc.nextInt();
            if (age < 18) {
                System.out.print("You111 are not eligible to vote");
            } else if (age > 100) {
                System.out.print("Invalid age");
            } else if (age >= 18) {
                System.out.print("Congratulations! You can now vote.");

            } else {
                System.out.print(" invailid input"); // this line will never execute as the previous conditions cover
                                                     // all
                                                     // cases
            }
        }

    }
}
