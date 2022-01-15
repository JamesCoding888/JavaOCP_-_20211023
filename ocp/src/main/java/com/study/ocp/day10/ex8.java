package com.study.ocp.day10;

class book4
{
	String show(String name)
	{
		return "java書名="+name;
	}
}
class ex8
{
	public static void main(String[] args) {
		book4 b=new book4()
		{
			@Override
			String show(String name)
			{
				return "購買的書"+super.show(name);
			}
		};

		System.out.println(b.show("java8"));
	}
}