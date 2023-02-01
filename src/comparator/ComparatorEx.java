package comparator;

import model.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorEx {
    public static void main(String[] args) {
        Student st1 = new Student(23, 4.5, 2);
        Student st2 = new Student(21, 4.2, 3);
        Student st3 = new Student(24, 4.8, 4);
        Student st4 = new Student(20, 5.0, 1);
        List<Student> studentList = new ArrayList<>();
        studentList.add(st1);
        studentList.add(st2);
        studentList.add(st3);
        studentList.add(st4);

        System.out.println(studentList + "\n");
        /*
        1) если класс Student имплементируеь Comparable и в нем указано, как именно сравнивать объекты, то сравнение
        происходит по указанному правилу
        2) если вторым параметром указан компаратор, то будет производиться сравнение по логике компаратора, вне зависимости
        от того, имплементирован ли Comparable в классе Student или нет
         */
        Collections.sort(studentList);
        System.out.println("SortByAge(by default)= " + studentList + "\n");
        Collections.sort(studentList, new AverageScoreComparator());
        System.out.println("SortByAverageScore= " + studentList + "\n");
        Collections.sort(studentList, new CourseComparator());
        System.out.println("SortByCourse= " + studentList + "\n");

        //также, чтобы не писать целые классы под Компаратор, можно создать просто анонимный класс или указать
        //лямбда выражение
        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.getAge().compareTo(s2.getAge());
            }
        });
        System.out.println("SortByAgeLambda= " + studentList + "\n");
        Collections.sort(studentList, (s1, s2) -> s1.getAverageScore().compareTo(s2.getAverageScore()));
        System.out.println("SortByAverageScoreLambda= " + studentList + "\n");
    }
}
/*
* Например, если какой-то класс реализовал метод compareTo и необходимо задать какую-то дополнительную логику сравнения,
* то для этого можно использовать компаратор, ведь мы же не можем постоянно менять метод compareTo
*
* Например, где нам не обойтись без Компаратора - класс String, он реализует метод compareTo и мы не можем его никак менять,
* но можно написать свой компаратор, который будет сравнивать строки так, как нам нужно
* */
class AgeComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.getAge().compareTo(s2.getAge());
    }
}

class AverageScoreComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.getAverageScore().compareTo(s2.getAverageScore());
    }
}

class CourseComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.getCourse().compareTo(s2.getCourse());
    }
}


