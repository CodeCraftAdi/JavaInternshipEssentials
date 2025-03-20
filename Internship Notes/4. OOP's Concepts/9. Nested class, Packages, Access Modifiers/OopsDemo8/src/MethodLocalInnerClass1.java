class Outer1
{
    void m1()
    {
        System.out.println("m1() method");

        class Inner1
        {
            void m2()
            {
                System.out.println("m2() method");
            }
        }

        Inner1 obj = new Inner1();
        obj.m2();
    }
}
public class MethodLocalInnerClass1
{
    public static void main(String[] args)
    {
        Outer1 obj1 = new Outer1();
        obj1.m1();
    }
}
