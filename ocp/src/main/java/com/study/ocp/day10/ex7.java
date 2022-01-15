package com.study.ocp.day10;

interface book3
{
	void bookName(String name);
	double bookPrice(double price);
}
class ex7
{
	public static void main(String[] args) {
		book3 b=new book3()
		{
			public void bookName(String name)
			{
				System.out.println("書名:"+name);
			}
			public double bookPrice(double price)
			{
				return price;
			}
		};//class ? implements book3{}

		b.bookName("java");
		System.out.println(b.bookPrice(1000));


		System.out.println("===========================");

		new book3(){
			public void bookName(String name)
			{
				System.out.println("java書名:"+name);
			}
			public double bookPrice(double price)
			{
				return 0;
			}

		}.bookName("javaWEB");

		System.out.println("===========================");

		System.out.println("價格合計="
			+(new book3()
			{
					public void bookName(String name)
					{
						System.out.println("java書名:"+name);
					}
					public double bookPrice(double price)
					{
						return price*0.95;
					}
			}.bookPrice(1000)
			+new book3()
			{
				public void bookName(String name)
					{
						System.out.println("java書名:"+name);
					}
					public double bookPrice(double price)
					{
						return price*0.8;
					}
			}.bookPrice(1000))
			);
	}
}