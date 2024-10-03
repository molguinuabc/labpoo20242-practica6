import javax.swing.*;
import java.awt.*;

public class Visualizador extends JPanel {

    public static void carta(Carta c, Posicion p) {
        // Aquí se invoca el método paintComponent para dibujar la carta
        JFrame frame = new JFrame();
        Visualizador visualizador = new Visualizador();
        frame.add(visualizador);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        // Al agregar la carta, debemos establecer la posición
        visualizador.dibujarCarta(c, p);
    }

    public void dibujarCarta(Carta c, Posicion p) {
        // Lógica para dibujar la carta
        Graphics g = this.getGraphics();
        g.setColor(Color.WHITE);
        g.fillRect(p.getX(), p.getY(), 100, 150); // Rectángulo representando la carta
        g.setColor(Color.BLACK);
        g.drawRect(p.getX(), p.getY(), 100, 150);
        g.drawString(c.getValor(), p.getX() + 10, p.getY() + 20); // Valor de la carta
        // Dibuja el palo
        if (c.getPalo() instanceof Trebol) {
            g.setColor(Color.GREEN);
            g.fillOval(p.getX() + 40, p.getY() + 50, 20, 20);
        } else if (c.getPalo() instanceof Diamante) {
            g.setColor(Color.RED);
            g.fillPolygon(new int[]{p.getX() + 40, p.getX() + 60, p.getX() + 40}, 
                          new int[]{p.getY() + 70, p.getY() + 50, p.getY() + 30}, 3);
        } else if (c.getPalo() instanceof Pica) {
            g.setColor(Color.BLACK);
            g.
