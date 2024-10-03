public class Main {
    public static void main(String[] args) {
        // Crear una carta de cada palo
        Carta carta1 = new Carta("3", new Trebol());
        Carta carta2 = new Carta("5", new Diamante());
        Carta carta3 = new Carta("K", new Pica());
        Carta carta4 = new Carta("A", new Corazon());

        // Crear posiciones
        Posicion pos1 = new Posicion(50, 50);
        Posicion pos2 = new Posicion(200, 50);
        Posicion pos3 = new Posicion(50, 200);
        Posicion pos4 = new Posicion(200, 200);

        // Visualizar cartas
        Visualizador.carta(carta1, pos1);
        Visualizador.carta(carta2, pos2);
        Visualizador.carta(carta3, pos3);
        Visualizador.carta(carta4, pos4);
    }
}
