public class ThreeDigitCodes {
    public static void main(String[] args) {
        // nested loop: a loop inside another loop
        // create variable to count the loop
        int counter = 0;
        for(int i = 1; i <= 4; i++) {
            for(int j = 1; j <= 4; j++) {
                for(int k = 1; k <= 4; k++) {
                // Statements to eliminate duplicates
                    if (i != j && i != k && j!=k)
                    {
                        System.out.println(i + " " + j + " " +k);
                        counter = counter + 1; // add one to counter each time we have a loop
                    }
                }
            }
        } // end of outer loop

        // outside the loop
        System.out.println("How many unique numbers? " + counter);

    }
}
