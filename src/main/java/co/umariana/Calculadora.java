package co.umariana;

/**
 * Ejercicios de calentamiento.
 *
 * INSTRUCCIONES
 * -------------
 * 1. Cada método tiene un "TODO" y lanza UnsupportedOperationException.
 *    Reemplace esa línea por su implementación.
 * 2. NO modifique las pruebas (src/test). Ejecútelas con:   mvn test
 * 3. No cambie los nombres ni los parámetros de los métodos.
 */
public class Calculadora {

    public int sumar(int a, int b) {
        return a + b;
    }

    public int restar(int a, int b) {
        return a - b;
    }

    public int multiplicar(int a, int b) {
        return a * b;
    }

    public double dividir(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir entre cero");
        }
        return (double) a / b;
    }

    public boolean esPar(int n) {
        return n % 2 == 0;
    }
}
