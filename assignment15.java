class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal: " + name;
    }
}

class Dog extends Animal {
    String breed;

    Dog(String name, String breed) {
        super(name);
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Dog: " + name + ", Breed: " + breed;
    }
}

class Rabbit extends Animal {
    String color;

    Rabbit(String name, String color) {
        super(name);
        this.color = color;
    }

    @Override
    public String toString() {
        return "Rabbit: " + name + ", Color: " + color;
    }
}

public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal("Animal");
        Dog dog = new Dog("Tommy", "Labrador");
        Rabbit rabbit = new Rabbit("Bunny", "White");

        // Objects can be printed directly
        System.out.println(animal);
        System.out.println(dog);
        System.out.println(rabbit);
    }
}
