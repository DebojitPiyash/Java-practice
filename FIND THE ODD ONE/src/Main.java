import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int result;

        if (a == b) {
            result = c;
        } else if (a == c) {
            result = b;
        } else {
            result = a;
        }
        System.out.println(result);

        scanner.close();
    }
}