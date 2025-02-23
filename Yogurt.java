public class Yogurt extends Supermercado{
    private String sabor;

    public Yogurt(String nombre, String categoria, int precio, String sabor) {
        super(nombre, categoria, precio);
        this.sabor = sabor;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }
    public void imprimir(){
        System.out.println(getNombre() + " " + getCategoria() + " " + getPrecio() + " " + getSabor());

    }

    @Override
    public String toString() {
        return "Yogurt{" +
                "sabor='" + sabor + '\'' +
                '}';
    }
}
