public class Supermercado {
    private String nombre;
    private String categoria;
    private int precio;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public Supermercado(String nombre, String categoria, int precio) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
    }
}
