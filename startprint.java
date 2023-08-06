import java.util.Scanner;

public class startprint {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your number : ");
        int n = sc.nextInt();
        int i = 1;

        while (i <= n) {
            int j = 1;
            while (j <= i) {

                System.out.print("*");

                j = j + 1;

            }
            System.out.println();
            i = i + 1;

        }

    }

}
