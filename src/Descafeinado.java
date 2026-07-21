public class Descafeinado extends Cafe {
    public Descafeinado(Tamano tamano) {
        this.descripcion = "Café Descafeinado";
        this.tamano = tamano;
    }

    @Override
    public double costo() {
        if (tamano == Tamano.CHICO) return 1.20;
        if (tamano == Tamano.MEDIANO) return 1.70;
        return 2.20;
    }
}
