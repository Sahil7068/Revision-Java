package ExceptionHand;

public class throwKeyword {

    public static void main(String[] args) {
        System.out.println("ABC");

        try{
            throw new Exception("sahil");

        }
        catch (Exception e){
            e.printStackTrace();


        }
        System.out.println("AyC");
    }
}
