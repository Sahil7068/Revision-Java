package Collection;

import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<Object> ar = new ArrayList<>();
        ar.add(100);
        ar.add(100);
        ar.add(300);
        System.out.println(ar);
        System.out.println(ar.get(4));
    }
}
