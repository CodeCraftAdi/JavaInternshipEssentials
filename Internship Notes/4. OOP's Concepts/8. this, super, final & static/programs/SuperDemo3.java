class A3
{
    A3()
    {
        System.out.println("1111");
    }
}
public class SuperDemo3 extends A3
{
    SuperDemo3()
    {
        super();
    }

    public static void main(String[] args)
    {
        new SuperDemo3();
    }
}
