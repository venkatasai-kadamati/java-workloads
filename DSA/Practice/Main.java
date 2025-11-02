package DSA.Practice;

// encapsulation -> binds both data + methods into one unit.
// data hiding -> hides the data variables through access mods
// abstractions -> gives limited and required information.
class Animal {
    String name = "common";

    // methods
    void sleep() {
        System.out.println("animals sleep");
    }
}

class Cat extends Animal {
    int legs = 4;

    void walk() {
        System.out.println("cat walks");
    }
}

class Eagle extends Animal {
    int wings = 2;

    void fly() {
        System.out.println("eagle fly's");
    }
}

public class Main {
    static void main() {
        Cat leo = new Cat();
        leo.sleep();
        leo.walk();
        System.out.println(leo.legs + " " + leo.name);
    }
}
