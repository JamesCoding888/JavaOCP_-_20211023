package com.study.ocp.day10;
class school
{
	void show()
	{
		System.out.println("new school");
	}
	class A
	{
		void show()
		{
			System.out.println("new A");
		}

		/*static*/ void show2()
		{
			System.out.println("new A");
		}
	}
}

public class ex1{
	public static void main(String[] args) {
		school s=new school();
		s.show();
		new school().show();

		school.A a=new school().new A();
		a.show();

		new school().new A().show();
	}
}