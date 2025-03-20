public class ThisDemo3
{
    ThisDemo3()
    {
        this(10);
        System.out.println("1111");
//        this(10);             // error
    }
    ThisDemo3(int no)
    {
        this("Deepak");
        System.out.println("2222");
    }
    ThisDemo3(String str)
    {
        System.out.println("3333");
    }

    public static void main(String[] args)
    {
        new ThisDemo3();
    }
}
