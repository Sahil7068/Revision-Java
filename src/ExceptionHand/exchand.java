package ExceptionHand;

public class exchand {
    public static void main(String[] args) {
        try {
            int i = 9 / 0; // code will throw exception
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());

        }
        System.out.println("ABC");


    }
};
