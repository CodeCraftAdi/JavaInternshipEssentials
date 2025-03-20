class Outers1
{
    static class Inners1
    {
        void m1()
        {
            System.out.println("m1() method");
        }
    }
}
public class StaticNestedClass1
{
    public static void main(String[] args)
    {
        Outers1.Inners1 obj2 = new Outers1.Inners1();
        obj2.m1();
    }
}



/*
class Outers1
{
    class Inners1
    {
        void m1()
        {
            System.out.println("m1() method");
        }
    }
}
public class StaticNestedClass1
{
    public static void main(String[] args)
    {
        Outers1 obj1 = new Outers1();
        Outers1.Inners1 obj2 = obj1.new Inners1();
        obj2.m1();
    }
}
*/