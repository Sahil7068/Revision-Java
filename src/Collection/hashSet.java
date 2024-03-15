package Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class hashSet {
    public static void main(String[] args) {
        Set<String> ss = new HashSet<>();
        ss.add("sahil");
        ss.add("sahil");
        ss.add("raza");
        System.out.println(ss);

        Iterator<String> it =ss.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        for(String e: ss){
            System.out.println(e);

        }
    }
}
