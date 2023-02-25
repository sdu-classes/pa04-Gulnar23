public class Main {
    public static void main(String[] args) {
        Fish d = new Fish();
        Cat c = new Cat("Fluffy");
        Animal a = new Fish();
        Animal e = new Spider();
        Pet p = new Cat();
        d.eat();
        d.walk();
        e.eat();
        a.eat();
        a.walk();
        c.walk();
        c.eat();
        c.play();
        p.play();
        System.out.println("The cat's name is " + c.getName());
    }
}