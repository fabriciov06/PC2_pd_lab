enum Tamano {
    CHICO, MEDIANO, GRANDE
}

public abstract class Cafe {
    protected String descripcion = "Bebida desconocida";
    protected Tamano tamano;

    public String getDescripcion() {
        return descripcion;
    }

    public Tamano getTamano() {
        return tamano;
    }

    public void setTamano(Tamano tamano) {
        this.tamano = tamano;
    }

    public abstract double costo();

}
