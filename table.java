import java.util.Scanner;

class third {
    public static void main(String[] args)

    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your table number : ");
        int n = sc.nextInt();
        int i = 1;

        while (i < 10) {
            i = i + 1;

            System.out.println(i * n);
        }
    }

}