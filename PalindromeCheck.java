import java.util.*;
public class PalindromeCheck {
	public static void main(String[] args) {
		
System.out.println("Palindrome Check-->");
System.out.print("Enter a string:");
Scanner sc=new Scanner(System.in);
String s=sc.next();
StringBuffer temp=new StringBuffer(s);
temp.reverse();
String str2;
str2=new String(temp);
if(s.equals(str2))
	System.out.println("The given string " + s + " is a palindrome.");
else
	System.out.println("The given string " + s + " is not a palindrome.");
	}


}
