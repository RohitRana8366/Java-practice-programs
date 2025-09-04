
public class FibonacciSeries {
      public static void main(String args[]) {
    	
    	  
    	  System.out.println("First 10 Fibonacci numbers:");

    	  int a,b,temp,n;
    	  a=0;
    	  b=1;
    	  for(n=1;n<=10;n++) {
    	  	System.out.print(a +"  "); 
    	  	temp =a+b;
    	  	a=b;
    	  	b=temp;
    	  }
    	  	}

    	  
}
