import javax.swing.*;
import java.awt.*;

public class Visualizador extends JPanel {

    private Carta carta;
    private Posicion posicion;

    public Visualizador(Carta carta, Posicion posicion) {
        this.carta = carta;
        this.posicion = posicion;
    }

    // Método estático para dibujar la carta en la posición dada
    public static void carta(Carta c, Posicion p) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        
        // Crear el panel y añadirlo al frame
        Visualizador panel = new Visualizador(c, p);
        frame.add(panel);
        
        // Ajustar el tamaño del panel
        frame.setPreferredSize(new Dimension(400, 400));
        frame.pack(); // Ajustar el tamaño del marco para que se ajuste al contenido
        
        // Hacer el frame visible
        frame.setVisible(true);
    }

    // Sobrescribir paintComponent para dibujar la carta
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);  // Llamar al método de la superclase para dibujar componentes básicos
        if (carta != null && posicion != null) {
            carta.draw(g, posicion.getX(), posicion.getY());  // Dibuja la carta en la posición especificada
        }
    }
}
