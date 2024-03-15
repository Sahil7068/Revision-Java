package ExceptionHand;

public class throwskeyword {
    public static void main(String[] args) throws ArithmeticException {

        throwskeyword obj = new throwskeyword();
        obj.sum();

    }

    public void sum() throws ArithmeticException{
        div();
    }

    public void div() throws ArithmeticException{
        int i = 9/0;
    }
}

// We can't see reports
