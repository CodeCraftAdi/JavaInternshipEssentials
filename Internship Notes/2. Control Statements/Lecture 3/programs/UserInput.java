package programs;

import java.util.Scanner;

public class UserInput
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter number 1 : ");
        int no1 = s.nextInt();

        System.out.print("Enter number 2 : ");
        int no2 = s.nextInt();

        int sum = no1 + no2;

        System.out.println("Result : "+sum);
    }
}
