/**
 * Operaciones aritméticas de dos números
 */
package Operations;

import CustomExceptions.DivisionByZero;

public class Operations {
    float a;
    float b;

    /**
     * @param a
     * @param b
     */
    public Operations(float a, float b) {
        this.a = a;
        this.b = b;
    }

    /**
     * 
     */
    public Operations() {
    }

    /**
     * @return the a
     */
    public float getA() {
        return a;
    }

    /**
     * @param a the a to set
     */
    public void setA(float a) {
        this.a = a;
    }

    /**
     * @return the b
     */
    public float getB() {
        return b;
    }

    /**
     * @param b the b to set
     */
    public void setB(float b) {
        this.b = b;
    }

    public float add() {
        return a + b;
    }

    public float sub() {
        return a - b;
    }

    public float mult() {
        return a + b;
    }
    
    public float div() throws DivisionByZero {
        if ( b == 0 ) {
            throw new DivisionByZero();
        }
        return a / b;
    }
    
}
