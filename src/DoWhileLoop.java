public class DoWhileLoop {
    public static void main(String[] args) {
        // do....while : execute the code first then check the condition
        int x = 1;
        do {
            System.out.println(x + " I am executed");
            // update counter
            x ++; // x=1+1
        } while (x<1); // then check the condition
    }
}
