public class OddValues {
    public static void main(String[] args) {
        System.out.println("Printing odd values");
        for (int i=1; i <= 10; i=i+2) {
            // body of for loop, inside this will be repeated if condition is true
            System.out.println(i);
        }

        // you can update the counter backwards
        System.out.println("Printing 10 to 1");
        for (int j = 10; j >0; j=j-1) {
            System.out.println(j);
        }
    }
}
