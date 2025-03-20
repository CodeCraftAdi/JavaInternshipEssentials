class Aa1
{
    final void m1()
    {
        System.out.println("1111");
    }
}
public class FinalDemo2 extends Aa1
{
//    void m1()
//    {
//        System.out.println("2222");
//    }

    public static void main(String[] args)
    {
        Aa1 obj = new FinalDemo2();
        obj.m1();
    }
}
