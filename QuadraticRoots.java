import java.util.*;

public class QuadraticRoots {
    public static void main(String[] args) {
        System.out.println("Quadratic Roots Calculation-->");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the coefficients of the quadratic equation (a, b, c):\n");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int d = b * b - 4 * a * c;  

        if (d == 0) {
            double r1 = -(double) b / (2.0 * a);
            System.out.println("The equation has real and equal roots.");
            System.out.println("Root: " + r1);
        } 
        else if (d > 0) {
            double t = Math.sqrt(d);
            double r1 = (-b + t) / (2.0 * a);
            double r2 = (-b - t) / (2.0 * a);
            System.out.println("The equation has real and distinct roots.");
            System.out.println("Root 1: " + r1 + "\nRoot 2: " + r2);
        } 
        else {
            System.out.println("The equation has imaginary roots (no real solutions).");
        }

        
    }
}



