import java.util.*;
public class SwapTwoNumbers {
	public static void main(String args[]) {
		
	System.out.println("Swapping--> ");
	int a,b,temp;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter first number:");
	a=sc.nextInt();
	System.out.print("Enter second number:");
	 b=sc.nextInt();
	 temp=a;
	 a=b;
	 b=temp;
	 System.out.println("After swapping the numbers:");
	 
	 System.out.println("First number: " +a);
	 
	 System.out.println("Second number: " +b);
		}

}
