package structural.flyweight;

class ConcreteFlyweight implements Flyweight {
    private int color;

    public ConcreteFlyweight(int color) {
        this.color = color;
    }

    @Override
    public void draw(int x, int y, int color) {
        System.out.println("Drawing a flyweight with color " + color + " at x=" + x + ", y=" + y);
    }
}
