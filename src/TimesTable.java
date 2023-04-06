// 1. import Scanner
import java.util.Scanner;

public class TimesTable {
    public static void main(String[] args) {
        // 2. create object scanner
        Scanner reader = new Scanner(System.in);
        // 3. print "Enter a number to display the times table:"
        System.out.println("Enter a number to display the times table:");
        // 4. retain user input using .nextInt()
        int answer = reader.nextInt();

        // create for loop to print times table 1*Answer to 12Answer
        for (int i=1; i<=12; i++){
            System.out.println(answer + " x " + i + " = " +  (i * answer));
        }

    }
}
