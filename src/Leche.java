public class Leche extends DecoradorComplemento{
    public Leche(Cafe bebida) {
        super(bebida);
    }

    @Override
    public String getDescripcion() {
        return bebida.getDescripcion() + ", Leche";
    }

    @Override
    public double costo() {
        double costoExtra = 0.20;
        if (bebida.getTamano() == Tamano.GRANDE) {
            costoExtra = 0.40;
        }
        return bebida.costo() + costoExtra;
    }
}
