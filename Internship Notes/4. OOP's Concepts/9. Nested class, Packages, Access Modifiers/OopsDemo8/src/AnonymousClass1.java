abstract class A
{
    abstract void mA1();
    abstract void mA2();
}
public class AnonymousClass1
{
    public static void main(String[] args)
    {
        A obj = new A()
        {
            void mA1()
            {
                System.out.println("mA1() method");
            }
            void mA2()
            {
                System.out.println("mA2() method");
            }
        };
        obj.mA1();
        obj.mA2();
    }
}




















/*
abstract class A
{
    abstract void mA1();
}
public class AnonymousClass1 extends A
{
    void mA1()
    {
        System.out.println("1111");
    }
    public static void main(String[] args)
    {

    }
}
*/