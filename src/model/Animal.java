package model;

public abstract class Animal {
    int i;
    public void eat(){
        System.out.println("model.Animal is eating");
    }

    public abstract void makeSound();

    public abstract void walking();
}

/*
* Примеры анонимных классов
* */
class TestClass{
    public static void main(String[] args) {
        /*здесь за кулисами создается класс, который наследуется от класса Animal и который переопределяет метод eat
        и реализует остальные методы, в переменной animal лежит не объект класса Animal (даже если бы это был не абстрактный,
        а простой класс), а объект-наследник класса Animal. Тоже самое делают, создавая отдельные классы, которые
        переопределяли бы 1 метод, что нецелесообразно, гораздо легче сделать анонимный класс.
        * */
        Animal animal = new Animal() {
            @Override
            public void makeSound() {
                System.out.println("sound");
            }

            @Override
            public void walking() {
                System.out.println("walking");
            }

            public void eat(){
                System.out.println("eating");
            }
        };
        animal.makeSound();
        animal.walking();
        animal.eat();

        /*
        * т.к. мы не можем создавать объекты интерфейсов, то здесь за кулисами просто создается класс, который реализует
        * методы AnimalBehaviour. Это, возможно, единственный раз, когда мы можем применить new к интерфейсу.
        * */
        AnimalBehaviour animalBehaviour = new AnimalBehaviour() {
            @Override
            public void sleep() {
                System.out.println("sleeping");
            }

            @Override
            public void exercise() {
                System.out.println("exercising");
            }
        };
        animalBehaviour.defaultBehaviour();
        animalBehaviour.sleep();
        animalBehaviour.exercise();
    }
}