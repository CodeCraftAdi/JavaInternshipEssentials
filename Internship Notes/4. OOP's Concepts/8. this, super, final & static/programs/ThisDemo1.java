public class ThisDemo1
{
    int no=10;

    void display(int no)
    {
//        System.out.println("Number is : "+no);
        System.out.println("Number is : "+this.no);
    }

    public static void main(String[] args)
    {
        ThisDemo1 obj = new ThisDemo1();
        obj.display(20);
    }
}
