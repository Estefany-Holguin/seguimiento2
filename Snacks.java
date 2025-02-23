public class Snacks extends Supermercado {
    private String tiposnack;
    private int cantidad;

    public Snacks(String nombre, String categoria, int precio, String tiposnack, int cantidad) {
        super(nombre, categoria, precio);
        this.tiposnack = tiposnack;
        this.cantidad = cantidad;
    }

    public String getTiposnack() {
        return tiposnack;
    }

    public void setTiposnack(String tiposnack) {
        this.tiposnack = tiposnack;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public void mostrar() {
        System.out.println(getNombre() + " " + getCategoria() + " " + getPrecio() + " " + getTiposnack() + " " + getCantidad());
    }

    @Override
    public String toString() {
        return "Snacks{" +
                "tiposnack='" + tiposnack + '\'' +
                ", cantidad=" + cantidad +
                '}';
    }
}
