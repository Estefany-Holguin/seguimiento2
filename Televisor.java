public class Televisor extends Electrodomesticos{
    private int pulgadas;
    private boolean smartTV;
    private String color;

    public Televisor(String marca, int precio, String tipo, int pulgadas, boolean smartTV, String color) {
        super(marca, precio, tipo);
        this.pulgadas = pulgadas;
        this.smartTV = smartTV;
        this.color = color;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    public boolean isSmartTV() {
        return smartTV;
    }

    public void setSmartTV(boolean smartTV) {
        this.smartTV = smartTV;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    @Override
    public void mostrar() {
        super.imprimir();
        System.out.println("pulgadas: " + getPulgadas());
        System.out.println("smartTV: " + isSmartTV());
        System.out.println("color: " + getColor());

    }
}
