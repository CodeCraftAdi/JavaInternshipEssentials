package p1;

public class Test2 extends Test1
{
    public void m2()
    {
        System.out.println("m2() method");
    }
    public static void main(String[] args)
    {
        Test1 obj = new Test1();
        obj.m1();
    }
}