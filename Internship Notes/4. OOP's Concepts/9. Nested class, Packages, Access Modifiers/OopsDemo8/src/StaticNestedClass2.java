class Outers2
{
    static class Inners2
    {
        static void m1()
        {
            System.out.println("m1() method");
        }
    }
}
public class StaticNestedClass2
{
    public static void main(String[] args)
    {
        Outers2.Inners2.m1();
    }
}