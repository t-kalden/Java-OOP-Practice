package AnimalClasses;

public class MainAnimal {
    public static void main(String[] args) {
        Animal animal = new Animal("Animal", 1, 1,5, 5);
        Dog dog = new Dog("Yorkie",8,20,2,4,1, 2,"Long Silky");

        dog.eat();
        dog.walk();
        dog.run();
    }
}
