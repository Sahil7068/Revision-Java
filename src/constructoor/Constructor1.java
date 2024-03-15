package constructoor;

public class Constructor1 {

    public Constructor1(){
        System.out.println("New constructor");
    }

    public Constructor1(int i){
        System.out.println("New constructor " + i);
    }


    public static void main(String[] args) {
        Constructor1 ob = new Constructor1();
        Constructor1 ob1 = new Constructor1(10);

    }
}
