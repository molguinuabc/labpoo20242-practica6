public class Main {
    public static void main(String[] args) {
        Square square = new Square();
        square.changeColor("blue");
        square.makeVisible();

            Triangle triangle = new Triangle();
            triangle.changeColor("red");
            triangle.makeVisible();

        Circle circle = new Circle();
        circle.changeColor("red");
        circle.makeVisible();
        Person person = new Person();
        person.changeColor("green");
        person.makeVisible();

        Circle2 Circle2 = new Circle2();
        circle.changeColor("blue");
        circle.makeVisible();

         // Supongamos que ya tienes una carta creada, por ejemplo:
         Carta carta1 = new Carta(null, 0 /* atributos de la carta */ );
                
         // Crear una posición
         Posicion posicion = new Posicion(20, 40);
 
         // Visualizar la carta en la posición dada
         Visualizador.carta(carta1, posicion);

        }
    }

        
    

