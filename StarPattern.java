
public class StarPattern {
	public static void main(String[] args) {
        System.out.println("Star Pattern:");
        int row, numberofStars;
        for(row = 1; row <= 10; row++) {
            for(numberofStars = 1; numberofStars <= row; numberofStars++) {
                System.out.print("* "); // 
            }
            System.out.println(); 
        }
    }
}
