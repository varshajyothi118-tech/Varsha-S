class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }

    void sleep() {
        System.out.println("Animal is sleeping");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

class Rabbit extends Animal {
    void jump() {
        System.out.println("Rabbit is jumping");
    }
}

public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.eat();       // inherited method
        dog.sleep();     // inherited method
        dog.bark();     // Dog's own method

        System.out.println();

        Rabbit rabbit = new Rabbit();
        rabbit.eat();    // inherited method
        rabbit.sleep();  // inherited method
        rabbit.jump();   // Rabbit's own method
    }
}
