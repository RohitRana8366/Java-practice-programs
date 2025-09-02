import java.util.*;
public class BiggestOfThree {
       public static void main(String args[]) {
    	   int n1,n2,n3,big;
    	   Scanner sc=new Scanner(System.in);
    	   System.out.print("Enter First Number:");
    	   n1=sc.nextInt();
    	   System.out.print("Enter Second Number:");
    	   n2=sc.nextInt();
    	   System.out.print("Enter Third Number:");
    	   n3=sc.nextInt();
    	   if(n1>n2 && n1>n3)
    	   	big=n1;
    	   else if(n2>n1 && n2>n3)
    	   	big=n2;
    	   else
    	   	big=n3;
    	   
    	   System.out.println("Biggest number is: " + big);
    	   	}
       }

