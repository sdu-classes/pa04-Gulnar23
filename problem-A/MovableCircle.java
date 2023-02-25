class MovableCircle implements Movaable{
    private MovablePoint center;
    int radius;



    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius){
        center = new MovablePoint( x, y, xSpeed, ySpeed);
        this.radius = radius;
    }
    public String toString(){
        return  "(" + center.x + ", " + center.y + "), speed = (" + center.xSpeed +"," + center.ySpeed+ ")";
    }

    @Override
    public void moveUp() {
        center.y-=center.ySpeed;
    }

    @Override
    public void moveDown() {
        center.y+=center.ySpeed;
    }

    @Override
    public void moveLeft() {
        center.x-=center.xSpeed;
    }

    @Override
    public void moveRight() {
        center.y+=center.xSpeed;
    }
}