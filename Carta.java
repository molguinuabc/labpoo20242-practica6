import java.awt.Graphics;

public class Carta {
    private String palo;  // Ej: Corazones, Diamantes, Tréboles, Picas
    private int valor;    // 1 a 13, donde 1 es As y 13 es Rey

    public Carta(String palo, int valor) {
        this.palo = palo;
        this.valor = valor;
    }

    public String getPalo() {
        return palo;
    }

    public int getValor() {
        return valor;
    }

    // Método para dibujar la carta en una posición x, y utilizando un objeto Graphics
    public Graphics draw(Graphics g, int x, int y) {
        // Dibuja un rectángulo como base de la carta
        g.drawRect(x, y, 50, 80); // tamaño aproximado de una carta
        // Dibuja el valor de la carta en la esquina superior izquierda
        g.drawString(valorToString(), x + 5, y + 15);
        // Dibuja el palo en la esquina inferior derecha
        g.drawString(palo, x + 5, y + 70);
        return g;
    }

    // Convierte el valor numérico en una representación visual
    private String valorToString() {
        switch (valor) {
            case 1:
                return "A";
            case 11:
                return "J";
            case 12:
                return "Q";
            case 13:
                return "K";
            default:
                return String.valueOf(valor);
        }
    }
}
