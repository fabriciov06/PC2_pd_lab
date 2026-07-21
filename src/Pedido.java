import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<Cafe> listaBebidas = new ArrayList<>();

    public void agregarBebida(Cafe cafe) {
        listaBebidas.add(cafe);
    }

    public double calcularTotal() {
        double total = 0;
        for (Cafe c : listaBebidas) {
            total += c.costo();
        }
        return total;
    }

    public void imprimirTicket() {
        System.out.println("=================================");
        System.out.println("        TICKET DE COMPRA         ");
        System.out.println("=================================");
        for (Cafe c : listaBebidas) {
            System.out.printf("- %s (%s): $%.2f%n",
                    c.getDescripcion(),
                    c.getTamano(),
                    c.costo());
        }
        System.out.println("---------------------------------");
        System.out.printf("TOTAL A PAGAR: $%.2f%n", calcularTotal());
        System.out.println("=================================");
    }
}
