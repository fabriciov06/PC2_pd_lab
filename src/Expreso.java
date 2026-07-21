public class Expreso extends Cafe{
    public Expreso(Tamano tamano) {
        this.descripcion = "Expreso";
        this.tamano = tamano;
    }

    @Override
    public double costo() {
        if (tamano == Tamano.CHICO) return 1.50;
        if (tamano == Tamano.MEDIANO) return 2.00;
        return 2.50;
    }
}

