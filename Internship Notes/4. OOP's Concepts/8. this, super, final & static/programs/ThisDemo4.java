public class ThisDemo4
{
    void m1()
    {
//        ThisDemo4 obj = new ThisDemo4();
//        m2(obj);

        m2(this);
    }
    void m2(ThisDemo4 td)
    {
        System.out.println(td);
    }

    public static void main(String[] args)
    {
        ThisDemo4 obj = new ThisDemo4();
        obj.m1();
    }
}
