class Student1
{
    int rollno;
    String name;
    static String school_name = "Xyz Public School";

    Student1(int rollno, String name)
    {
        this.rollno=rollno;
        this.name=name;
    }

    void display()
    {
        System.out.println("Rollno : "+rollno);
        System.out.println("Name : "+name);
        System.out.println("School Name : "+school_name+"\n");
    }
}
public class StaticVariables1
{
    public static void main(String[] args)
    {
        Student1 obj1 = new Student1(101, "Deepak");
        obj1.display();

        Student1 obj2 = new Student1(102, "Amit");
        obj2.display();

        Student1 obj3 = new Student1(103, "Priya");
        obj3.display();
    }
}














/*
class Student1
{
    int rollno;
    String name;
    String school_name;

    Student1(int rollno, String name, String school_name)
    {
        this.rollno=rollno;
        this.name=name;
        this.school_name=school_name;
    }

    void display()
    {
        System.out.println("Rollno : "+rollno);
        System.out.println("Name : "+name);
        System.out.println("School Name : "+school_name+"\n");
    }
}
public class StaticVariables1
{
    public static void main(String[] args)
    {
        Student1 obj1 = new Student1(101, "Deepak", "Xyz Public School");
        obj1.display();

        Student1 obj2 = new Student1(102, "Amit", "Xyz Public School");
        obj2.display();

        Student1 obj3 = new Student1(103, "Priya", "Xyz Public School");
        obj3.display();
    }
}
*/















/*
class Student1
{
    int rollno;
    String name;
    String school_name;

    void display()
    {
        System.out.println("Rollno : "+rollno);
        System.out.println("Name : "+name);
        System.out.println("School Name : "+school_name);
    }
}
public class StaticVariables1
{
    public static void main(String[] args)
    {
        Student1 obj1 = new Student1();
        obj1.rollno = 101;
        obj1.name = "Deepak";
        obj1.school_name = "Xyz Public School";
        obj1.display();

        Student1 obj2 = new Student1();
        obj2.rollno = 102;
        obj2.name = "Amit";
        obj2.school_name = "Xyz Public School";
        obj2.display();
    }
}
*/