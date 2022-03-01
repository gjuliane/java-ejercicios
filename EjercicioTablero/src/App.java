import java.util.Scanner;

import Ejercicio1.Tablero;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        Scanner entrada = new Scanner(System.in);
        Tablero t1;
        int x, y;
        int opcion, incremento = 0;

        System.out.println("Digite la coordenada inicial de X: ");
        x = entrada.nextInt();
        System.out.println("Digite la coordenada inicial de Y: ");
        y = entrada.nextInt();

        // Posición inicial del objeto
        t1 = new Tablero(x,y);

        do {
            System.out.println("\n\t.:MENU:.");
            System.out.println("1. Mover hacia ARRIBA");
            System.out.println("2. Mover hacia ABAJO");
            System.out.println("3. Mover hacia DERECHA");
            System.out.println("4. Mover hacia IZQUIERDA");
            System.out.println("5. SALIR");
            System.out.println("Digite la opción: ");
            opcion = entrada.nextInt();

            if (opcion != 5) {
                System.out.println("Digite la cantidad de espacios a mover: ");
                incremento = entrada.nextInt();
            }
            switch (opcion) {
                case 1: t1.moverArriba(incremento); break;
                case 2: t1.moverAbajo(incremento); break;
                case 3: t1.moverDerecha(incremento); break;
                case 4: t1.moverIzquierda(incremento); break;
                case 5: break;
                default: System.out.println("Error, se equivocó de opción de menú"); break;
            }
            System.out.println("\nPosición Actual (X,Y): "+t1.getX()+", "+t1.getY());
        } while (opcion != 5);
    }
}
