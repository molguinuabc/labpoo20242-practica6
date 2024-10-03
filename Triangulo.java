import com.apple.laf.AquaButtonBorder.Toggle;

public class Triangulo extends Toggle {
    private int x, y, size;

    public Triangulo(int x, int y, int size) {
        super(); // Si la clase Triangle tiene un constructor que acepta estos parámetros
        this.x = x;
        this.y = y;
        this.size = size;
    }

    public void draw() {
        // Lógica para dibujar un triángulo
        System.out.println("Dibujando triángulo en: (" + x + ", " + y + ")");
    }
}
