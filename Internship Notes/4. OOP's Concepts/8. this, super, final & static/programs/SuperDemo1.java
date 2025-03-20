class A1
{
    int no = 10;
}
public class SuperDemo1 extends A1
{
    int no = 20;

    void m1(int no)
    {
//        System.out.println("Number is "+no);
//        System.out.println("Number is "+this.no);
        System.out.println("Number is "+super.no);
    }

    public static void main(String[] args)
    {
        SuperDemo1 obj = new SuperDemo1();
        obj.m1(30);
    }
}
