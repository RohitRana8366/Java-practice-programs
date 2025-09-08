import java.util.*;
public class FactorialSeriesSum {
	public static void main(String[] args) {
         System.out.println("Sum of n Factorial Series (1/1!+1/2!+1/3!+...)-->");
         int i;

		float sum=0, fact=1;

		System.out.print("Enter the number of terms (N):");
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();

		for(i=1;i<=n;i++) {

		fact=fact*i;
		sum=sum+1/fact;
		}
		

		System.out.println("Sum of factorial series up to " +n+" terms:"+sum);
}
}