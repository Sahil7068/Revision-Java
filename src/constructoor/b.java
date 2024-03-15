package constructoor;

public class b extends a {

    public b(){
        super(5);
        System.out.println("I'm constructoor.b");
    }

    public static void main(String[] args) {
        b obj = new b();
    }
}
