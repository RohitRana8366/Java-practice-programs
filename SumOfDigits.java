import java.util.*;
public class SumOfDigits {
	public static void main(String[] args) {
		
System.out.println("Sum of digits:");
int n ,res, sum=0;
Scanner sc=new Scanner(System.in);
System.out.print("Enter a number:");
n=sc.nextInt();
System.out.print("Sum of digits is:");
while(n>0) {
	res =n%10;
	n=n/10;
	sum=sum+res;
	
}
System.out.print(+sum);

	}

}
