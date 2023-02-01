package scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class ScannerEx {
    public static void main(String[] args) {
        // работа со сканнером с консолью
        // так работаем со сканнером, когда нужно ввести в консоль что-то
//        Scanner scanner = new Scanner(System.in);
//        int i = scanner.nextInt();
//        System.out.println("Введенное число: " + i);
//        // считываем строку
//        String str = scanner.nextLine();
//        //считываем первую строку до первого пробела
//        String str1 = scanner.next();
//        // считываем вещественное число, причем вводим не с точкой, а с запятой
//        double value = scanner.nextDouble();
//        //также есть много остальных методов для других примитивных типов данных

        // работа не с консолью
//        Scanner scanner = new Scanner("Привет, Мир!\nПривет, друг!\nПривет, друзья!");
//        System.out.println(scanner.next());
//        System.out.println(scanner.nextLine());
//        System.out.println(scanner.nextLine());
//        System.out.println(scanner.nextLine() + "\n");
//        // но если вызвать nextLine еще, будет exception
//        // поэтому лучше делать в цикле while
//        while (scanner.hasNextLine()){
//            System.out.println(scanner.nextLine());
//        }

        // пример работы с файлом
        Scanner scanner = null;
        Set<String> stringSet = new TreeSet<>();
        try {
            scanner = new Scanner(new FileReader(new File("path")));
            scanner.useDelimiter("\\W");
            while (scanner.hasNext()){
                String word = scanner.next();
                stringSet.add(word);
            }
            for(String word : stringSet){
                System.out.println(word);
            }
        }catch (FileNotFoundException e){
            System.out.println("error" + e.getMessage());
        }finally {
            scanner.close();
        }
    }
}
