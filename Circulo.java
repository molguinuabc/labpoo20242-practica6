public class Circulo extends Circle {
    public Circulo(int x, int y, int radius) {
        super(x, y, radius);
    }

    @Override
    public void draw() {
        System.out.println("Dibujando círculo.");
    }
}
