package programs;

import java.util.Scanner;

public class UserInput2
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter Rollno : ");
        int rollno = s.nextInt();

        System.out.print("Enter Name : ");
        String name = s.next();

        System.out.print("Enter Marks : ");
        float marks = s.nextFloat();

        System.out.println("-------------------");

        System.out.println("Name : "+name);
        System.out.println("Rollno :"+rollno);
        System.out.println("Marks : "+marks);
    }
}
