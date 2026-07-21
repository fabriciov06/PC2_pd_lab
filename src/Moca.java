public class Moca extends DecoradorComplemento{
    public Moca(Cafe bebida) {
        super(bebida);
    }

    @Override
    public String getDescripcion() {
        return bebida.getDescripcion() + ", Moca";
    }

    @Override
    public double costo() {
        double costoExtra = 0.30;
        if (bebida.getTamano() == Tamano.GRANDE) {
            costoExtra = 0.50;
        }
        return bebida.costo() + costoExtra;
    }
}
