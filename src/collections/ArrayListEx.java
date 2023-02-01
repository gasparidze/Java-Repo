package collections;

import java.util.*;

public class ArrayListEx {

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList = initList(stringList);

        //REMOVE//
        //returns the Object - "Hello1"
        System.out.println(stringList.remove(0));

        //returns true
        System.out.println(stringList.remove("Hello2"));

        //SET//
        //Returns: the element previously at the specified position - "Hello5"
        stringList = initList(stringList);
        System.out.println(stringList.set(4, "Hello6"));

        //addALL//
        stringList = initList(stringList);
        Set<String> stringSet = new HashSet<>();
        stringSet.add("Hello6");
        List<String> stringLinkedList = new LinkedList<>();
        stringLinkedList.add("Hello7");
        stringList.addAll(stringSet);
        stringList.addAll(stringLinkedList);
        //everytning will be added in the end of collection but Map is not bec it's not extends from Collection
        System.out.println(stringList);

        //indexOf//
        stringList = initList(stringList);
        // returns 3 bec found
        System.out.println(stringList.indexOf("Hello4"));
        //returns -1 bec not found
        System.out.println(stringList.indexOf("Hello10"));
        //если есть дубликаты, то indexOf выдаст индекс первого найденного
        //lastIndexOf() - вернет индекс последнего

        //Arrays.asList//
        // returns: List<DateType>
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Hello1");
        String [] strings = {"Hello6", "Hello7", "Hello8"};
        arrayList = Arrays.asList(strings);
        //returns ["Hello6", "Hello7", "Hello8"]
        System.out.println(arrayList);
        //лист, инициализированный таким образом тесно связан с массивом, изменения в массиве влекут изменения в листе
        strings[0] = "Hello2";
        System.out.println(arrayList);

        //retainAll//
        stringList = initList(stringList);
        List<String> stringList2 = initSecondList();
        // returns: [Hello4, Hello5]
        stringList.retainAll(stringList2);
        //returns: [Hello2, Hello7, Hello8]
        System.out.println(stringList);

        //toArray//
        // преобразовываем List в массив определенного типа
        stringList = initList(stringList);
        String[] strings1 = stringList.toArray(new String[]{});
        //stringList.toArray() - вернут просто Object[]

        //List.of и List.copyOf//
        //с помощью этих методов можно по-быстрому создать лист, но они будут read only
        //также такие листы не могут содержать null, вылетит exception
        List<String> stringList1 = List.of("1", "2", "3");
        System.out.println(stringList1);
        //stringList1.add("4"); -  вылетит exception
        List<String> stringList3 = List.copyOf(stringList);
        System.out.println(stringList3);

        //класс Collections//
        List<Integer> integerList = new ArrayList<>();
        integerList.add(2);
        integerList.add(-5);
        integerList.add(-8);
        integerList.add(10);
        integerList.add(12);
        System.out.println(integerList);
        Collections.sort(integerList);
        System.out.println(integerList);
        System.out.println(Collections.binarySearch(integerList, 10));
    }

    static List<String> initList(List<String> list){
        list.clear();
        list.add("Hello1");
        list.add("Hello2");
        list.add("Hello3");
        list.add("Hello4");
        list.add("Hello5");

        return list;
    }

    static List<String> initSecondList(){
        List<String> secondList = new ArrayList<>();
        secondList.add("Hello4");
        secondList.add("Hello5");
        secondList.add("Hello6");
        secondList.add("Hello7");
        secondList.add("Hello8");

        return secondList;
    }
}
