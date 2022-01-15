package com.study.ocp.day10;
interface book6{
	String show(String bookName, int price); // 書名 =? 價格 = ?
}
	 
public class ex10 {
	public static void main(String[] args) {
		System.out.println("1. Lambda 省略方法的名稱，重點在函式的內容 -> 實作 abstract method of show in interface book6");
		book6 b = (String bookName, int price) -> "書名= " + bookName + "\t價格= " + price;			
		System.out.println(b.show("現代 Java", 100));
		book6 b2=(bookName,price)->"書名="+bookName+"\t價格="+price;
		System.out.println(b2.show("abc",-1000));
		System.out.println("2. 由多個 static method p1, p2 來實作 abstract method of show in interface book6");
		book6 b3 = cal::p1;		
		System.out.println(b3.show("James", -1000));
		book6 b4 = cal::p2;
		System.out.println(b4.show("JamesLiao", 1000));
	}
}

class cal{
	static String p1(String name, int price) {
		if(price > 0) {
			return "書名=" + name + "\t價格=" + price;
		} else {
			return "價格需>=0";
		}			
	}

	static String p2(String name,int price)
	{
		if(price>=2000)
		{
			return "書名="+name+"\t價格="+price*0.9;
		}
		else if(price>=1000)
		{
			return "書名="+name+"\t價格="+price*0.95;
			
		}
		else if(price>=0)
		{
			return "書名="+name+"\t價格="+price;
		}
		else
		{
			return "價格需>=0";
		}
	}
}
