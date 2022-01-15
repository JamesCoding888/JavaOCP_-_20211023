package com.study.ocp.day10;

enum book
{
	java7(10,500),java8(20,600),web(30,700);//()--->new book()

	private int amount;
	private int price;
	private book(int amount,int price)
	{
		this.amount=amount;
		this.price=price;
	}

	public int getAmount()
	{
		return amount;
	}

	public int getPrice()
	{
		return price;
	}

	public void setAmount(int amount)
	{
		this.amount=amount;
	}





}
/*
book java7=new book(10,500);
book java8=new book(20,600);
book web=new book(30,700);
*/


class ex5
{
	public static void main(String[] args) {
		book[] b=book.values();

		System.out.println(b[0]+"\t"+b[0].getAmount()+"\t"+b[0].getPrice());
		b[0].setAmount(100);

		System.out.println(b[0]+"\t"+b[0].getAmount()+"\t"+b[0].getPrice());


	}
}
