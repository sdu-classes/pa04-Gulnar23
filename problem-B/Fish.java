public class Fish extends Animal  implements Pet {
    private String fishName;
    public Fish() {
        super(0);
    }
    @Override
    void eat() {
            System.out.println("Fish eats seaweed");
        }
        @Override
        public String getName() {
        return fishName;
    }
    @Override
    public void play() {
    }
    public void walk() {
        System.out.println("Fish has no legs");
    }
}
