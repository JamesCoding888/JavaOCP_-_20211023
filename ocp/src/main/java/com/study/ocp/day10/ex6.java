package com.study.ocp.day10;

interface book2
{
	void bookName(String name);
	double bookPrice(double price);
}
class bookStore implements book2
{
	public void bookName(String name)
	{
		System.out.println("書名="+name);
	}
	public double bookPrice(double price)
	{
		return price;
	}
}
class ex6
{
	public static void main(String[] args) {
		//book2 b=new book2();
		book2 b1=new bookStore();
		bookStore b2=new bookStore();
		b1.bookName("java");
		b2.bookName("java8");
	}
}
