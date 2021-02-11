package lesson6;

public class Main {

    public static void main(String[] args) {
        Animal dog = new Dog("Bobik", 300, 12,2);
        System.out.println(dog.swim());
        System.out.println(dog.run());
        System.out.println(dog.jump());
        System.out.println();
        Animal cat = new Cat("Murzik", 100, 5,  2);
        System.out.println(cat.swim());
        System.out.println(cat.run());
        System.out.println(cat.jump());
    }
}
