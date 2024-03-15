package Collection;

import java.util.HashMap;
import java.util.Iterator;

public class hasHmap1 {
    public static void main(String[] args) {
        // Does not maintain order
        //key-value pair
        //can store n number of null values but only one null key
        // Hashmap is not synchronised

        HashMap<String, String> map1 = new HashMap<>();
        map1.put("India", "India");
        map1.put("US", "DC");
        map1.put("Australia", "Canberra");
        System.out.println(map1);

        //iterator

        System.out.println("-------- x --------");

        Iterator<String> it = map1.keySet().iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }


        System.out.println("-------- x --------");


    }
}
