import java.util.Scanner;

public class prime {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        int temp = 0;

        while (i <= n) {
            if (n % i == 0) {
                temp = temp + 1;

            }
            i = i + 1;
        }

        if (temp == 2) {
            System.out.println("prime");

        } else {
            System.out.println("notprime");

        }
    }

}
