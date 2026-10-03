import java.util.List;

sealed interface Figura permits Circulo, Rectangulo, Triangulo, Cuadrado {}

record Circulo(double radio) implements Figura {}
record Rectangulo(double base, double altura) implements Figura {}
record Triangulo(double base, double altura) implements Figura {}
record Cuadrado(double lado) implements Figura {}

public class Main {
    static double area(Figura f) {
        return switch (f) {
            case Circulo c -> Math.PI * c.radio() * c.radio();
            case Rectangulo(double b, double h) -> b * h;
            case Triangulo t -> t.base() * t.altura() / 2;
            case Cuadrado q -> q.lado() * q.lado();
        };
    }

    static double perimetro(Figura f) {
        return switch (f) {
            case Circulo c -> 2 * Math.PI * c.radio();
            case Rectangulo(double b, double h) -> 2 * (b + h);
            case Triangulo t -> t.base() + 2 * Math.sqrt(Math.pow(t.base() / 2, 2) + Math.pow(t.altura(), 2));
            case Cuadrado q -> 4 * q.lado();
        };
    }

    public static void main(String[] args) {
        List<Figura> figuras = List.of(
            new Circulo(5), new Rectangulo(4, 6), new Triangulo(10, 3), new Cuadrado(4));
        for (Figura f : figuras) {
            System.out.printf("%-34s área = %.2f  perímetro = %.2f%n", f, area(f), perimetro(f));
        }
    }
}
