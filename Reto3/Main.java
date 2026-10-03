import java.util.function.DoubleBinaryOperator;

enum Operador {
    SUMA("+", (x, y) -> x + y),
    RESTA("-", (x, y) -> x - y),
    MULTIPLICACION("×", (x, y) -> x * y),
    DIVISION("÷", (x, y) -> {
        if (y == 0) throw new ArithmeticException("división por cero");
        return x / y;
    }),
    POTENCIA("^", Math::pow),
    MODULO("%", (x, y) -> x % y);

    private final String simbolo;
    private final DoubleBinaryOperator operacion;

    Operador(String simbolo, DoubleBinaryOperator operacion) {
        this.simbolo = simbolo;
        this.operacion = operacion;
    }

    public String simbolo() { return simbolo; }
    public double aplicar(double a, double b) { return operacion.applyAsDouble(a, b); }
}

public class Main {
    public static void main(String[] args) {
        double a = 12, b = 4;
        for (Operador op : Operador.values()) {
            System.out.printf("%.0f %s %.0f = %.1f%n", a, op.simbolo(), b, op.aplicar(a, b));
        }
        try {
            Operador.DIVISION.aplicar(1, 0);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
