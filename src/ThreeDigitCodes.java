public class ThreeDigitCodes {
    public static void main(String[] args) {
        // nested loop: a loop inside another loop

        for(int i = 1; i <= 4; i++) {
            for(int j = 1; j <= 4; j++) {
                for(int k = 1; k <= 4; k++) {
                    System.out.println(i + " " + j + " " +k);
                // Statements to eliminate duplicates
                }
            }
        }

    }
}
