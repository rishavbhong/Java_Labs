class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
        System.out.println("Animal Constructor called: " + name);
    }

    public void displayInfo() {
        System.out.println("Animal Name: " + name);
    }
}


class Dog extends Animal {
    private String breed;

    public Dog(String name, String breed) {
        super(name); // Call the superclass constructor
        this.breed = breed; 
        System.out.println("Dog Constructor called: " + breed);
    }

    public void showDetails() {
        super.displayInfo(); 
        System.out.println("Dog Breed: " + this.breed);
    }
}

class Cat {
    private String name;
    private int age;

    public Cat(String name) {
        this(name, 0); 
    }

    public Cat(String name, int age) {
        this.name = name; 
        this.age = age;
    }

    public void displayCatDetails() {
        System.out.println("Cat Name: " + name);
        System.out.println("Cat Age: " + age);
    }
}

public class SuperThisDemo {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy", "Golden Retriever");
        dog.showDetails();

        Cat cat = new Cat("Whiskers");
        cat.displayCatDetails();
    }
}
