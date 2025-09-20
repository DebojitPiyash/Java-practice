import java.util.Scanner;
public class Main{
    public static void main(String[] args)
    {
        Scanner S = new Scanner(System.in);

        System.out.print("Enter A: ");
        int A = S.nextInt();

        System.out.print("Enter B: ");
        int C = S.nextInt();

        int sum = A+C;
        if(sum % 2 ==0)
        {
            System.out.print("B is integer and its value is: ");
            int B = sum/2;
            System.out.print(B);
        } else
        {
            System.out.print("B is not an integer!");
        }
    }
}