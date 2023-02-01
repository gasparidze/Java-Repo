import model.Cat;
import model.Dog;

import java.io.*;
import java.util.*;

public class FileExample {
    private static final String PATH = "C:\\Users\\A804126\\Desktop\\test.txt";
    private static final String PATH_RESULT = "C:\\Users\\A804126\\Desktop\\result.txt";


    public static void main(String[] args) throws IOException {
        Map<Integer, String> map = new HashMap<>();
        Cat cat = new Cat("Test model.Cat");
        Dog dog = new Dog();
        Class<Cat> catClass = Cat.class;
        LinkedList<String> test = new LinkedList<>();

        Set<String> testSet = new HashSet<>();
        testSet.add("hello");
        testSet.add("Hello");
        testSet.add("mynameis");
//        Iterator<String> it = testSet.iterator();
//        for(String str : testSet){
//            testSet.add(new String("wqd"));
//        }

//        System.out.println(testSet);
        List<Integer> testString = new ArrayList<>();
        testString.add(1);
        testString.add(2);
        testString.add(3);
        for(Integer str : testString){
            str = 4;

            System.out.println(str);
        }

        System.out.println(testString);
    }
}