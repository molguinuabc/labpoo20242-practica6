import java.awt.Color;
import java.awt.Graphics;

import javafx.scene.shape.Polygon;

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
    public void draw(Graphics g, int x, int y) {
        // Dibuja un rectángulo como base de la carta
        g.drawRect(x, y, 50, 80); // tamaño aproximado de una carta
        // Dibuja el valor de la carta en la esquina superior izquierda
        g.drawString(valorToString(), x + 5, y + 15);
        
        // Dibuja el palo en la esquina inferior central
        drawSymbol(g, x + 15, y + 60); // Ajustar la posición para que quede centrado
    }

    // Dibuja el símbolo correspondiente al palo
    private void drawSymbol(Graphics g, int x, int y) {
        switch (palo.toLowerCase()) {
            case "corazones":
                g.setColor(Color.RED);
                g.fillOval(x, y, 20, 20);  // Primer círculo
                g.fillOval(x + 10, y, 20, 20); // Segundo círculo
                g.fillPolygon(new int[]{x, x + 30, x + 15}, new int[]{y + 20, y + 20, y + 40}, 3); // Triángulo
                break;
    
            case "diamantes":
                g.setColor(Color.RED);
                g.fillPolygon(new int[]{x, x + 25, x + 50, x + 25}, new int[]{y + 40, y, y + 40, y + 20}, 4); // Rombo
                break;
    
            case "tréboles":
                g.setColor(Color.BLACK);
                // Dibuja los círculos
                g.fillOval(x, y, 15, 15);  // Primer círculo
                g.fillOval(x + 15, y, 15, 15); // Segundo círculo
                g.fillOval(x + 7, y + 10, 15, 15); // Tercer círculo (cambiado a 7)
                // Dibuja el triángulo
                g.fillPolygon(new int[]{x + 7, x + 22, x + 15}, new int[]{y + 25, y + 25, y + 40}, 3); // Triángulo
                break;
    
            case "picas":
                g.setColor(Color.BLACK);
                // Dibuja las dos partes superiores
                g.fillOval(x, y, 15, 15);  // Parte superior izquierda
                g.fillOval(x + 15, y, 15, 15); // Parte superior derecha
                // Dibuja el triángulo
                g.fillPolygon(new int[]{x, x + 30, x + 15}, new int[]{y + 15, y + 15, y + 30}, 3); // Triángulo
                // Dibuja el palo
                g.fillRect(x + 13, y + 30, 5, 10); // Palo
                break;
        }
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
