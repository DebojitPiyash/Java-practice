import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int X = scanner.nextInt();

        int subscriptionsNeeded;
        if (N % 6 == 0) {
            subscriptionsNeeded = N / 6;
        } else {
            subscriptionsNeeded = (N / 6) + 1;
        }

        int totalCost = subscriptionsNeeded * X;
        System.out.println(totalCost);

        scanner.close();
    }
}