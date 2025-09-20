import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startTime = scanner.nextInt();
        int assignments = 3;
        int timePerAssignment = 1;

        int totalTimeNeeded = assignments * timePerAssignment;
        int finishTime = startTime + totalTimeNeeded;

        if (finishTime <= 10) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        scanner.close();
    }
}