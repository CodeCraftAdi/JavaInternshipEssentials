public class StaticVariables2
{
    int no1 = 10;
    static int no2 = 20;

    void m1()
    {
//        static int no = 10;
        System.out.println("Number is : "+no1);
        System.out.println("Number is : "+no2);
    }

    public static void main(String[] args)
    {
//        System.out.println("Number is : "+no1);
        System.out.println("Number is : "+no2);
    }
}
