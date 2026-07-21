public abstract class DecoradorComplemento extends Cafe {
    protected Cafe bebida;

    public DecoradorComplemento(Cafe bebida) {
        this.bebida = bebida;
    }

    public abstract String getDescripcion();

    public Tamano getTamano() {
        return bebida.getTamano();
    }
}