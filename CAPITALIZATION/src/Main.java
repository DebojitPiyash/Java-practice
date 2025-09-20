import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();

        if (word != null && !word.isEmpty()) {
            String capitalized = word.substring(0, 1).toUpperCase() + word.substring(1);
            System.out.println(capitalized);
        } else {
            System.out.println(word);
        }
        scanner.close();
    }
}