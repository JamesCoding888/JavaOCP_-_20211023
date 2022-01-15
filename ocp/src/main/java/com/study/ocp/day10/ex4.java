package com.study.ocp.day10;

import com.study.ocp.day10.school3.month;

/*
java6 以前
*/
class school3
{
	enum month
	{
		一月,二月,三月
	}

	enum week
	{
		星期一,星期二
	}

	enum address
	{
		台北,
	}
}

class ex4
{
	public static void main(String[] args) {
		
		school3.month[] m=school3.month.values();
		school3.week[] w=school3.week.values();
		school3.address[] a=school3.address.values();

		System.out.println(m[0]+"\t"+w[0]+"\t"+a[0]);			
	}
}