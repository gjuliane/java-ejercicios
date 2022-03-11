import java.util.Scanner;

import CustomExceptions.DivisionByZero;
import Operations.Operations;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        Float a, b;
        Operations op = new Operations();
        
        // Menú
        System.out.println("Operaciones aritméticas...");
        System.out.println(
            "\nIntruduzca dos números"+
            "\nSe realizaran suma, resta, multiplicacion y división."
        );

        // Entrada
        System.out.print("Intruduzca el primer número: ");
        a = scan.nextFloat();
        System.out.print("Intruduzca el segundo número: ");
        b = scan.nextFloat();
        scan.close();

        op.setA(a);
        op.setB(b);

        try {

            System.out.println(
                "\nLa suma de "+op.getA() +" + "+op.getB()+ " es: "+ op.add() +
                "\nLa resta de "+op.getA() +" - "+op.getB()+ " es: "+ op.sub() +
                "\nLa multiplicacion de "+op.getA() +" x "+op.getB()+ " es: "+ op.mult() +
                "\nLa division de "+op.getA() +" / "+op.getB()+ " es: "+ op.div()
            );
        } catch(DivisionByZero e){
            System.out.println("Mensaje: " + e.getMessage());
        } finally {
            System.out.println("La aplicación ha terminado.");
        }

    }
}
