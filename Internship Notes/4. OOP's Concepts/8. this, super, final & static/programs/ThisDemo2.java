public class ThisDemo2
{
    void m1()
    {
//        m2();
        this.m2();
    }
    void m2()
    {
        System.out.println("m2() method executed");
    }

    public static void main(String[] args)
    {
        ThisDemo2 obj = new ThisDemo2();
        obj.m1();
    }
}
