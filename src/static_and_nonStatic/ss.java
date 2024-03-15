package static_and_nonStatic;

public class ss {

    String name = "sahil";
    static int i = 5;

    public void sum(){   // non-static methods
        int a = 5;
        int  b =6;
        int c= a+b;
        System.out.println(c);
    }

    public static void ss(){   //static method
        System.out.println("screenshots");
    }


    public static void main(String[] args) {
        ss();  // directly called
        System.out.println(i);

        ss obj = new ss();
        obj.sum();
        System.out.println(obj.name);

    }
}
