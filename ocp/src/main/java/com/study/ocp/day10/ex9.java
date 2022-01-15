package com.study.ocp.day10;

interface book5
{
	void bookName(String name);
	//void abc();
}
class ex9
{
	public static void main(String[] args) {
		book5 b=new book5()
		{
			public void bookName(String name)
			{
				System.out.println("書名="+name);
			}
		};


		b.bookName("java");

		System.out.println("====================");
		book5 b2=(String name)->System.out.println("java書="+name);
		b2.bookName("java8");

		book5 b3=(name)->System.out.println("java書="+name);
		book5 b4=name->System.out.println("java書="+name);
		book5 b5=n->System.out.println("java書="+n);

	}
}