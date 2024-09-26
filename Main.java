import javax.swing.*;
import java.awt.*;

public class Main extends JPanel {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Prueba de Carta");
        Main panel = new Main();
        frame.add(panel);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Carta carta1 = new Carta("corazones", 1);
        carta1.draw(g, 50, 50); // Dibuja una carta de corazones
        Carta carta2 = new Carta("diamantes", 10);
        carta2.draw(g, 150, 50); // Dibuja una carta de diamantes
        Carta carta3 = new Carta("tréboles", 11);
        carta3.draw(g, 250, 50); // Dibuja una carta de tréboles
        Carta carta4 = new Carta("picas", 13);
        carta4.draw(g, 350, 50); // Dibuja una carta de picas
    }
}
