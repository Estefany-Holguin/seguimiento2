public class Animales {
    private String tipo;
    private int NumeroPatas;
    private String Color;

    public Animales(String tipo, int NumeroPatas, String color) {
        this.tipo = tipo;
        NumeroPatas = NumeroPatas;
        Color = color;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNumeroPatas() {
        return NumeroPatas;
    }

    public void setNumeroPatas(int numeroPatas) {
        NumeroPatas = numeroPatas;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }
}

