public class Pica {
    private int x, y;

    public Pica(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void draw() {
        System.out.println("Dibujando pica en: (" + x + ", " + y + ")");
    }
}
