import java.util.Scanner;

public class Calculator
{
    public void addition(int no1, int no2)
    {
        System.out.println("Addition is : "+(no1+no2));
    }

    public void subtraction(int no1, int no2)
    {
        System.out.println("Subtraction is : "+(no1-no2));
    }

    public void multiplication(int no1, int no2)
    {
        System.out.println("Multiplication is : "+(no1*no2));
    }

    public void division(int no1, int no2)
    {
        System.out.println("Division is : "+(no1/no2));
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Calculator cal = new Calculator();

        String yn;
        do
        {
            System.out.println("Please Select an Option\n1 - Addition\n2 - Subtraction\n3 - Multiplication\n4 - Division\n5 - Exit");
            int user_input = scanner.nextInt();

            System.out.print("Enter Number 1 : ");
            int no1 = scanner.nextInt();

            System.out.print("Enter Number 2 : ");
            int no2 = scanner.nextInt();

            switch(user_input)
            {
                case 1:
                    cal.addition(no1, no2);
                    break;
                case 2:
                    cal.subtraction(no1, no2);
                    break;
                case 3:
                    cal.multiplication(no1, no2);
                    break;
                case 4:
                    while(no2 <= 0)
                    {
                        System.out.println("Number should be greater then zero");
                        System.out.println("Enter Number 2 Again");
                        no2 = scanner.nextInt();
                    }
                    cal.division(no1, no2);
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Input");
                    break;
            }

            System.out.println("Do you want to continue, press y for yes else any other option for no");
            yn = scanner.next();
        }
        while(yn.equals("y") || yn.equals("Y"));
    }
}
