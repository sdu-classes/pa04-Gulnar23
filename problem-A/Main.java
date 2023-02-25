class Main {
    public static void main(String[] args) {
        Movaable m1 = new MovablePoint(3, 4,5, 7);
        System.out.println(m1);
        m1.moveLeft();
        Movaable m2 = new MovableCircle(8,3,5,7, 9);
        System.out.println(m2);
        m2.moveLeft();
    }
}
