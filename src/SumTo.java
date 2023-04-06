// 1. import Scanner

public class SumTo {
    public static void main(String[] args) {
        // 2. create scanner object

        // 3. ask user to enter a number to sum to

        // 4. retain user input as a variable called answer

        // 5. use while loop to display number 1 to answer
        int i=1; // while counter initialisation
        int sumNumber = 0;
        while (i<=10){
            System.out.print(i + " ");
            sumNumber = sumNumber + i;
            i++;
        }
        System.out.println("\nSum of numbers = " + sumNumber);
    }
}
