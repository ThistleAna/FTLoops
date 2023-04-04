public class ExampleWhileLoop {
    public static void main(String[] args) {
        // initialise the counter
        int counter = 20;
        while (counter > 0) { // check the condition
            System.out.println("Put away the plate no " + counter);
            // update counter
            counter--;
        }

        // this is outside the while loop
        System.out.println("No more plates!");

    }
}
