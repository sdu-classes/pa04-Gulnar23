public class Cat extends Animal implements Pet {
    String name;
    public Cat(){
            this("");
        }
        public Cat(String name){
        super(4);
        this.name = name;
    }
    @Override
    void eat() {
        System.out.println("Cat is eating fish...");
    }
    @Override
    public String getName() {
        return this.name;
    }
    @Override
    public void play() {
        System.out.println("Meow with ball!");
    }
    public void walk(){
        System.out.println("Cat is walking with " + legs + " legs");
    }
}
