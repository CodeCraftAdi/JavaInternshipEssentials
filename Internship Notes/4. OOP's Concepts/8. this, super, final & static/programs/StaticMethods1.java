public class StaticMethods1
{
    void m1()
    {
        System.out.println("m1() method");
    }
    static void m2()
    {
        System.out.println("m2() method");
    }

    public static void main(String[] args)
    {
        StaticMethods1 obj = new StaticMethods1();
        obj.m1();

        StaticMethods1.m2();
    }
}
