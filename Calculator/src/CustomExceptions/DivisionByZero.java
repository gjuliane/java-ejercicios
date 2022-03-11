package CustomExceptions;

public class DivisionByZero extends Exception {
    public DivisionByZero(){
        super("No se puede dividir entre cero");
    }
}
