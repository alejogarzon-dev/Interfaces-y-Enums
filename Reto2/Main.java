import java.util.*;

enum Palo { OROS, COPAS, ESPADAS, BASTOS }

enum Valor {
    AS(1), DOS(2), TRES(3), CUATRO(4), CINCO(5), SEIS(6),
    SIETE(7), OCHO(8), NUEVE(9), SOTA(10), CABALLO(11), REY(12);

    private final int numero;
    Valor(int numero) { this.numero = numero; }
    public int getNumero() { return numero; }
}

record Carta(Palo palo, Valor valor) {}

public class Main {
    public static void main(String[] args) {
        List<Carta> baraja = new ArrayList<>();
        for (Palo palo : Palo.values()) {
            for (Valor valor : Valor.values()) {
                baraja.add(new Carta(palo, valor));
            }
        }
        System.out.println("Cartas en la baraja: " + baraja.size());
        Collections.shuffle(baraja);
        System.out.println("Primeras 5 tras barajar:");
        baraja.stream().limit(5).forEach(System.out::println);
    }
}
