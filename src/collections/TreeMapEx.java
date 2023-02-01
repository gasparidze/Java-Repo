package collections;

import java.util.TreeMap;

public class TreeMapEx {
    public static void main(String[] args) {
        TreeMap<Double, String> map = new TreeMap<>();
        map.put(3.4, "Sergey");
        map.put(3.8, "Max");
        map.put(4.2, "Arthur");
        map.put(4.4, "Rob");
        map.put(4.6, "Nestey");

        System.out.println(map.descendingMap()); // {4.6=Nestey, 4.4=Rob, 4.2=Arthur, 3.8=Max, 3.4=Sergey}
        System.out.println(map.descendingKeySet()); // [4.6, 4.4, 4.2, 3.8, 3.4]
        System.out.println(map.tailMap(4.2)); // {4.2=Arthur, 4.4=Rob, 4.6=Nestey}
        System.out.println(map.tailMap(3.8, false)); // {4.2=Arthur, 4.4=Rob, 4.6=Nestey}
        System.out.println(map.tailMap(3.8, true)); // {3.8=Max, 4.2=Arthur, 4.4=Rob, 4.6=Nestey}
        System.out.println(map.headMap(4.2)); // {3.4=Sergey, 3.8=Max}
        System.out.println(map.headMap(4.2, true)); // {3.4=Sergey, 3.8=Max, 4.2=Arthur}
        System.out.println(map.firstEntry()); // 3.4=Sergey
        System.out.println(map.lastEntry()); // 4.6=Nestey
    }
}
