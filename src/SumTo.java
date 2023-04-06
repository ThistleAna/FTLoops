// 1. import Scanner
import java.util.Scanner;
public class SumTo {
    public static void main(String[] args) {
        // 2. create scanner object
        Scanner reader = new Scanner(System.in);
        // 3. ask user to enter a number to sum to
        System.out.println("Enter a number to sum to: ");
        // 4. retain user input as a variable called answer
        int answer = reader.nextInt();
        // 5. use while loop to display number 1 to answer
        int i=1; // while counter initialisation
        int sumNumber = 0;
        while (i<= answer){
            System.out.print(i + " ");
            sumNumber = sumNumber + i;
            i++;
        }
        System.out.println("\nSum of numbers = " + sumNumber);
    }
}
