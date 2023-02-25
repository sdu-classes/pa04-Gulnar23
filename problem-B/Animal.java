public  abstract class Animal {
    protected int legs;

    Animal(int legs){

        this.legs = legs;
    }
    abstract void eat();
    public void walk(){

        System.out.println("This animal has " + legs + " to walk");
    }
}
