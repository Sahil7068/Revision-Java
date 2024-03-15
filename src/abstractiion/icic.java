package abstractiion;

public class icic implements interface_bank {

    @Override
    public void debit() {
        System.out.println("debit");
    }

    @Override
    public void credir() {

        System.out.println("credit");

    }

    public void transfer(){
        System.out.println("Transfer done");
    }
}
