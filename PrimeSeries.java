import java.util.*;
public class PrimeSeries {
	public static void main(String[] args) {
		 int n,i,j,p=1;
	     System.out.println("Prime Series-->");
	     System.out.print("Enter a number: ");
	     Scanner sc=new Scanner(System.in);
	     n=sc.nextInt();
	     System.out.println("Prime numbers up to " +n +" are:");
	     for(i=2;i<=n;i++)
	     {  p=1;
	    	 for(j=2;j<i;j++)
	    	 {
	    		 if(i%j==0)
	    		 {
	    			 p=0;
	    		 }
	    	 }
	     if(p==1)
	     {
	    	 System.out.print(j +"  ");		     }
	 
}
}
}
