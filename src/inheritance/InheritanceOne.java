package inheritance;

/**
 * @author : Gathsara
 * created : 2/12/2026 -- 7:19 PM
 **/

public class InheritanceOne {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.walk();
        bird.fly();
        bird.sing();
    }
}


class Animal {
    void walk() {
        System.out.println("I am walking");
    }
}

class Bird extends Animal {
    void fly() {
        System.out.println("I am flying");
    }

    public void sing() {
        System.out.println("I am singing");
    }
}