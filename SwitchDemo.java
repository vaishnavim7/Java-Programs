package Basics;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*---------------Week Day Names---------------*/
		//way 1
		System.out.println("enter num:");
		int ch = sc.nextInt();
		
		switch(ch) {
		case 1 : 
			System.out.println("mon");
			break;
		case 2 : 
			System.out.println("tue");
			break;
		case 3 : 
			System.out.println("wed");
			break;
		case 4 : 
			System.out.println("thus");
			break;
		case 5 : 
			System.out.println("fri");
			break;
		case 6 : 
			System.out.println("sat");
			break;
		case 7 : 
			System.out.println("sun");
			break;
		default : 
			System.out.println("enter valid num between 1 to 7");
		}
		
		/*---------------vowel or not---------------*/
		//way 2
		System.out.println("enter alphabet:");
		char c = sc.next().charAt(0);
		
		switch(c) {
		case 'a' : 
		case 'e' : 
		case 'i' : 
		case 'o' : 
		case 'u' :  
			System.out.println("Vowel Lower Case");
			break;
		case 'A' : 
		case 'E' : 
		case 'I' : 
		case 'O' : 
		case 'U' :  
			System.out.println("Vowel Upper Case");
			break;
		default : 
			System.out.println("enter valid alphabet");
		}
		
		/*---------------Calculator---------------*/
		//way 1
		System.out.println("enter operation:");
		char op  = sc.next().charAt(0);
		
		switch(op) {
		case '+' : 
			{
				System.out.println("enter two num : ");
				int n1 = sc.nextInt();
				int n2 = sc.nextInt();
				int r = n1 + n2;
				System.out.println("Sum : "+r);
				break;
			}
			
		case '-' : 
			{
				System.out.println("enter two num : ");
				int n1 = sc.nextInt();
				int n2 = sc.nextInt();
				int r = n1 - n2;
				System.out.println("Sub : "+r);
				break;
			}
		case '*' : 
			{
				System.out.println("enter two num : ");
				int n1 = sc.nextInt();
				int n2 = sc.nextInt();
				int r = n1 * n2;
				System.out.println("Mutli : "+r);
				break;
			}
		case '/' : 
			{
				System.out.println("enter two num : ");
				int n1 = sc.nextInt();
				int n2 = sc.nextInt();
				int r = n1 / n2;
				System.out.println("Div : "+r);
				break;
			}
		case '%' : 
			{
				System.out.println("enter two num : ");
				int n1 = sc.nextInt();
				int n2 = sc.nextInt();
				int r = n1 % n2;
				System.out.println("Modulo : "+r);
				break;
			}
		default : 
			System.out.println("enter valid operation");
		}
	}

}
