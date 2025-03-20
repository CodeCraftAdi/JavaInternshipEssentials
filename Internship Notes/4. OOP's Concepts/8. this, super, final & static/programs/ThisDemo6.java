public class ThisDemo6
{
    ThisDemo6 m1()
    {
        return this;
    }

    public static void main(String[] args)
    {
//        ThisDemo6 obj = new ThisDemo6();
//        obj.m1();

        new ThisDemo6().m1();
    }
}
