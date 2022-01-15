package com.study.ocp.day10;

class school2
{
	static void show()
	{
		System.out.println("new school2");
	}

	static class A
	{
		void show()
		{
			System.out.println("non-static new A");
		}
		static void show2()
		{
			System.out.println("static new A");
		}
	}
}
class ex2
{
	public static void main(String[] args) {
		school2.show();
		school2.A a=new school2.A();
		System.out.println(a);
		a.show();

		new school2.A().show();
		school2.A.show2();
		
	}
}
