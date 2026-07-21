public class Main {
    public static void main(String[] args) {
        Pedido miOrden = new Pedido();

        // 1. Un cliente pide un Expreso Mediano con Leche y doble Moca
        Cafe cafe1 = new Expreso(Tamano.MEDIANO);
        cafe1 = new Leche(cafe1);
        cafe1 = new Moca(cafe1);
        cafe1 = new Moca(cafe1);

        miOrden.agregarBebida(cafe1);

        // 2. Otro cliente pide un Descafeinado Grande solo con Leche
        Cafe cafe2 = new Descafeinado(Tamano.GRANDE);
        cafe2 = new Leche(cafe2);

        miOrden.agregarBebida(cafe2);

        miOrden.imprimirTicket();
    }

}
