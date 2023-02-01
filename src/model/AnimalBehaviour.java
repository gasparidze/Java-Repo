package model;

public interface AnimalBehaviour {
    default void defaultBehaviour(){
        System.out.println("default Behaviour");
    }
    void sleep();
    void exercise();
}
