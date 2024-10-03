public class Diamante {
    private int x, y;

    public Diamante(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void draw() {
        System.out.println("Dibujando diamante en: (" + x + ", " + y + ")");
    }
}
