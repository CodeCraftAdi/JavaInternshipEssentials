class A2
{
    void m2()
    {
        System.out.println("1111");
    }
}
public class SuperDemo2 extends A2
{
    void m1()
    {
        super.m2();
    }

    public static void main(String[] args)
    {
        new SuperDemo2().m1();
    }
}
