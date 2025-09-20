import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int X = scanner.nextInt();
        int Y = scanner.nextInt();
        
        int regularDays = 4;
        int chillDay = 1; // Wednesday

        int totalHours = (regularDays * X) + (chillDay * Y);

        System.out.println(totalHours);

        scanner.close();
    }
}