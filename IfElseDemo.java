package Basics;

import java.util.Scanner;

public class IfElseDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1;
		int n2;
		int n3;
		int n4;
		int r;
		
		System.out.println("enter n1:");
		n1 = sc.nextInt();
		System.out.println("enter n2:");
		n2 = sc.nextInt();
		System.out.println("enter n3:");
		n3 = sc.nextInt();
		System.out.println("enter n4:");
		n4 = sc.nextInt();
	
		/*-------------------------------------------------*/
		//simple if
		if(n1 > n2)
		{
			System.out.println("simple if");
			System.out.println("n1 :"+n1);
		}
		if(n2 > n1)
		{
			System.out.println("simple if");
			System.out.println("n2 :"+n2);
		}
		
		/*-------------------------------------------------*/
		//if else
		if(n1 > n2)
		{
			System.out.println("if else");
			System.out.println("n1 :"+n1);
		}
		else
		{
			System.out.println("if else");
			System.out.println("n2 :"+n2);
		}
		
		/*-------------------------------------------------*/
		//if else if
		if(n1 > n2 && n1 > n3)
		{
			System.out.println("if else if");
			System.out.println("n1 :"+n1);
		}
		else if(n1 < n2 && n2 > n3)
		{
			System.out.println("if else if");
			System.out.println("n2 :"+n2);
		}
		else
		{
			System.out.println("if else if");
			System.out.println("n3 :"+n3);
		}
		
		/*-------------------------------------------------*/
		//nested if else
		if(n1 > n2)
		{
			if(n2 > n3) 
			{
				if(n3 > n4) 
				{
					System.out.println("nested if else");
					r = n1 + n2 + n3 + n4;
					System.out.println("r = n1 + n2 + n3 + n4 :"+r);
				}
				else {
					System.out.println("nested if else");
					r = n1 + n2 + n3;
					System.out.println("r = n1 + n2 + n3 :"+r);
				}
			}
			else {
				System.out.println("nested if else");
				r = n1 + n2;
				System.out.println("r = n1 + n2 :"+r);
			}
		}
		else {
			System.out.println("nested if else");
			r = n1;
			System.out.println("r = n1 :"+r);
		}
	}

}
