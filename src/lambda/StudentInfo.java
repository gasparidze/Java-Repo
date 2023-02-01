package lambda;

import model.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/*
    Эту логику можно реализовать в лоб с помощью создания отдельного класса, который бы реализовывал метод
    интерфейсы или лучше создать анонимный класс
    Самым же элегантным способ считаются лямбда выражения
    Лямбда выражения призваны убрать все эти ключевые слова public, boolean, overraid и т д и оставить только
    самое важное.
* */
public class StudentInfo {
    public static void main(String[] args) {
        Student st1 = new Student(23, 4.5, 2);
        Student st2 = new Student(22, 4.4, 1);
        Student st3 = new Student(24, 4.3, 4);
        Student st4 = new Student(21, 5.0, 3);
        List<Student> studentList = new ArrayList<>();
        studentList.add(st1);
        studentList.add(st2);
        studentList.add(st3);
        studentList.add(st4);

        StudentInfo studentInfo = new StudentInfo();
        studentInfo.filterSudents(studentList, student -> student.getAverageScore() < 4.5);
        System.out.println("\n");
        studentInfo.filterSudents(studentList, (Student student) -> {return student.getAge() > 22;});
        System.out.println("\n");
        studentInfo.filterSudents(studentList, student -> {return student.getCourse() > 3;});

        /* если Student не имплементирует Comparable, то можно задать компаратор с помощью анонимного класса
        или что еще легче - с помощью лямбда выражений
            System.out.println(studentList);
            Collections.sort(studentList, (Student stud1, Student stud2) -> {
                return stud1.getAge() - stud2.getAge();
            });
            System.out.println(studentList);
         */
    }
    public void filterSudents(List<Student> students, CheckStudent cs){
        for (Student student : students){
            if(cs.check(student)){
                System.out.println(student);
            }
        }
    }

    //аннатация показывает, что интерфейс функциоанльный
    //если раскоментить sum, то аннотация будет подчеркнута красным
    @FunctionalInterface
    interface CheckStudent {
        boolean check(Student student);
        // должен быть именно функциональный интерфейс
        // java: incompatible types: lambda.StudentInfo.CheckStudent is not a functional interface
        //int sum(int a, int b);
    }
}
