@FunctionalInterface
interface Promocion {
    double descuento(double subtotal);

    static Promocion ninguna() { return subtotal -> 0; }
    static Promocion porcentaje(double pct) { return subtotal -> subtotal * pct / 100; }
    static Promocion fijaDesde(double minimo, double valor) {
        return subtotal -> subtotal >= minimo ? valor : 0;
    }

    default Promocion y(Promocion otra) {
        return subtotal -> Math.min(subtotal, descuento(subtotal) + otra.descuento(subtotal));
    }
}

public class Main {
    public static void main(String[] args) {
        Promocion promo = Promocion.porcentaje(10).y(Promocion.fijaDesde(20_000, 1_000));
        double subtotal1 = 25_000;
        double subtotal2 = 15_000;
        System.out.printf("Subtotal $%,.0f → descuento $%,.0f%n", subtotal1, promo.descuento(subtotal1));
        System.out.printf("Subtotal $%,.0f → descuento $%,.0f%n", subtotal2, promo.descuento(subtotal2));
    }
}
