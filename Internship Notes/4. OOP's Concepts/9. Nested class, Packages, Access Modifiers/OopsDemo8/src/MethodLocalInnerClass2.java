class Outer2
{
    void m1()
    {
        System.out.println("m1() method");

        class Inner2
        {
            void m2()
            {
                System.out.println("m2() method");
            }
        }
        Inner2 obj = new Inner2();
        obj.m2();
    }
    void m()
    {
//        Inner2 obj = new Inner2();            //error
//        obj.m2();
    }
}
public class MethodLocalInnerClass2
{
    public static void main(String[] args)
    {
        Outer2 obj1 = new Outer2();
        obj1.m1();

        obj1.m();
    }
}
