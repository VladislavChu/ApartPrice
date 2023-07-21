import java.util.Scanner;
public class CalcApartPrice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan1.nextInt();
        int x = scan2.nextInt();

        int d = 1000;
        int k = n / m;

        int result = x * n + d * k * (n - m * (k + 1) / 2);

        System.out.println(result);

    }
}
