package com.study.ocp.day10;
class product
{
	public static final String p1="java6";
	public static final String p2="java7";
	public static final String p3="java8";
}

enum product2//product2[]
{
	java6,java7,java8	
}
/*
product2[] ?=new product2[]{java6,java7,java8};
*/

class ex3
{
	public static void main(String[] args) {
		System.out.println(product.p1);
		System.out.println(product2.java6);
		product2[] p=product2.values();

		for(int i=0;i<p.length;i++)
		{
			System.out.println(p[i]);
		}
	}
}