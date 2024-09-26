import java.awt.Graphics;
import javax.swing.JPanel;

public class Visualizador extends JPanel {

    private Carta carta;
    private Posicion posicion;

    // Constructor para inicializar con una carta y una posición
    public Visualizador(Carta carta, Posicion posicion) {
        this.carta = carta;
        this.posicion = posicion;
    }

    // Sobrescribir paintComponent para dibujar la carta
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);  // Llamar al método de la superclase para dibujar componentes básicos
        if (carta != null && posicion != null) {
            carta.draw(g, posicion.getX(), posicion.getY());  // Suponiendo que Carta tiene un método draw
        }
    }

    public static void carta(Carta carta1, Posicion posicion2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'carta'");
    }
}
