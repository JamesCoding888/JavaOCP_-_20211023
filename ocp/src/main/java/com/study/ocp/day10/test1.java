package com.study.ocp.day10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);		
		int[] x=new int[3];
		System.out.println("請輸入索引碼");
		int n=sc.nextInt(); // 須被放置在 try 裡面才會被 InputMismatchException 抓到
		
		try
		{
			x[n]=100;//new ArrayIndexOutOfBoundsException()

			for(int i=1;i<=10;i++)
			{
				System.out.println("i="+i+"\thello");
			}
		}
		catch(ArrayIndexOutOfBoundsException e)//ArrayIndexOutOfBoundsException e=new ArrayIndexOutOfBoundsException()
		{
			System.out.println("索引碼為0~2");
			e.printStackTrace();

		}
		catch(InputMismatchException e)
		{
			System.out.println("索引碼須為整數");
			e.printStackTrace();
		}
		
	}

}
