class Outer
{
	class Inner
	{
		void m1()
		{
			System.out.println("m1() method");
		}
	}
	
	void m2()
	{
		System.out.println("m2() method");
	}
}
class MainApp1
{
	public static void main(String[] args)
	{
		Outer obj1 = new Outer();
		obj1.m2();

		Outer.Inner obj2 = obj1.new Inner();
		obj2.m1();
	}
}