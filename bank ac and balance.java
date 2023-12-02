import java.util.*;
import java.lang.*;
import java.io.*;
class Bank
{
	public double n,p;
	public float roi,t;
	public String b;
	Scanner sc=new Scanner(System.in);
	Scanner s=new Scanner(System.in);
	public void getdetails()
	{	
		try
		{
			System.out.print("Enter amount:10000 ");
			n=sc.nextDouble();
			System.out.print("Enter bank:SBI bank_roi");
			b=s.nextLine();
			b=b.trim();
			System.out.print("Enter time period:5 ");
			t=s.nextFloat();
		}
		catch(Exception e)
		{
			System.out.println(e);
			System.out.println("Invalid");
			System.exit(0);
		}
	}
}
class cal extends Bank
{
	public void calc()
	{	
		if(b.equalsIgnoreCase("SBI"))
		{
			roi=8.4f;
			p=(n*roi*t)/100;
		}
		else if(b.equalsIgnoreCase("ICIC"))
		{
			roi=9.7f;
			p=(n*roi*t)/100;
		}
		else if(b.equalsIgnoreCase("AXIS"))
		{
			roi=7.3f;
			p=(n*roi*t)/100;
		}
		else
		{
			System.out.println("Invalid bank");
			System.exit(0);
		}
	}
}
class display extends cal
{
	public void dis()
	{	
		System.out.println("Rate of interest = "+roi);
		System.out.println("Bank = "+b);
		System.out.printf("Interest amount= %.2f",p);
	}
}
public class bank_roi
{
	public static void main(String[] args)
	{
		display d=new display();
		d.getdetails();
		d.calc();
		d.dis();
	}
}