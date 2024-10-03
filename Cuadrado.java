public class Cuadrado extends Square {
    public Cuadrado(int x, int y, int size) {
        super(x, y, size);
    }

    @Override
    public void draw() {
        System.out.println("Dibujando cuadrado.");
    }
}
