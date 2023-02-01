package model;

public class Student implements Comparable<Student>{
    private Integer age;
    private Double averageScore;
    private Integer course;

    public Student(int age, double averageScore, int course) {
        this.age = age;
        this.averageScore = averageScore;
        this.course = course;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Double getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }

    public Integer getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public int compareTo(Student student) {
        return this.age.compareTo(student.getAge());
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", averageScore=" + averageScore +
                ", course=" + course +
                '}';
    }
}
