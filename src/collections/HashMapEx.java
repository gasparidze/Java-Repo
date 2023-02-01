package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Arthur");
        map.put(2, "Rob");
        map.put(3, "kate");

        System.out.println(map.entrySet()); //[1=Arthur, 2=Rob, 3=kate]
        System.out.println(map.entrySet() instanceof Set<Map.Entry<Integer, String>>); //true

        for (Map.Entry<Integer, String> pair : map.entrySet()){
            pair.getKey();
            pair.getValue();
        }

        //returns: the previous value associated with key, or null if there was no mapping for key.
        System.out.println(map.remove(1)); // Arthur
        System.out.println(map.remove(2, "Rob")); // true

        System.out.println(map.replace(3, "Alisia")); //kate
        System.out.println(map); // {3=Alisia}

        //same but with lambda
        map.entrySet().forEach(pair -> {
            System.out.println(pair.getKey() + ":" + pair.getValue());
        });

        System.out.println(map instanceof HashMap); //true
        //map = null;
        //System.out.println(map instanceof HashMap); //false
        //System.out.println(map.getClass()); //NullPointerException

        //удаление элементов в цикле//
        Iterator<Map.Entry<Integer, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            iterator.next();
            iterator.remove();
        }
        System.out.println(map);
    }
}
