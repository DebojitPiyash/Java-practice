import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int B1 = scanner.nextInt();
        int B2 = scanner.nextInt();
        int B3 = scanner.nextInt();

        int emptyCount = 0;
        if (B1 == 0) emptyCount++;
        if (B2 == 0) emptyCount++;
        if (B3 == 0) emptyCount++;

        if (emptyCount >= 2) {
            System.out.println("Water filling time");
        } else {
            System.out.println("Not now");
        }

        scanner.close();
    }
}