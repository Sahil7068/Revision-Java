package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class arrayListIteration {
    public static void main(String[] args) {
        ArrayList<String> sr = new ArrayList<>();
        sr.add("Sahil");
        sr.add("Raza");

        for (int i =0; i<sr.size(); i++){
            System.out.println(sr.get(i));
        }

        //forEach
        for(String s : sr){
            System.out.println(s);
        }

        //iterator - it's an interface which is used to iterate the values from the collection

        Iterator <String> it = sr.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }


        Iterator<String> ft = sr.iterator();
        while (ft.hasNext()){
            System.out.println(ft.next());
        }

    }
}
