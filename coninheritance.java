class Animal {
    Animal() {
        System.out.println("Animal constructor called");
    }
}

class Dog extends Animal {
    Dog() {
        super(); // calls Animal constructor
        System.out.println("Dog constructor called");
    }
}

public class coninheritance {
    public static void main(String[] args) {
        Dog d = new Dog(); // Triggers both constructors
    }
}
