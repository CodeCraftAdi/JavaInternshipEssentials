package programs;

public class FactorialNumber
{
    public static void main(String[] args)
    {
        // factorial of number - 8 = 1*2*3*4*5 or 5*4*3*2*1

//        int no = 5;
//
//        int fact =1;
//        for(int i=1; i<=no; i++)
//        {
//            fact = fact * i;
//        }
//        System.out.println("Factorial of "+no+" is "+ fact);





        int no = 5;

        int fact = 1;
        for(int i=no; i>=1; i--)
        {
            fact = fact * i;
        }
        System.out.println("Factorial of "+no+" is "+ fact);
    }
}
