public abstract class Electrodomesticos {
    private String Marca;
    private int precio;
    private String Tipo;

    public Electrodomesticos(String marca, int precio, String tipo) {
        Marca = marca;
        this.precio = precio;
        Tipo = tipo;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        Tipo = tipo;
    }
    public void imprimir() {
        System.out.println("Marca: " + Marca);
        System.out.println("Precio: " + precio);
        System.out.println("Tipo: " + Tipo);
    }

    public abstract void mostrar();
}
