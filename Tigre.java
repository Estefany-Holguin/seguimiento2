public class Tigre extends Animales {
    private String TipoAlimentacion;

    public Tigre(String tipo, int NumeroPatas, String color, String tipoAlimentacion) {
        super(tipo, NumeroPatas, color);
        TipoAlimentacion = tipoAlimentacion;
    }

    public String getTipoAlimentacion() {
        return TipoAlimentacion;
    }

    public void setTipoAlimentacion(String tipoAlimentacion) {
        TipoAlimentacion = tipoAlimentacion;
    }
    public void imprimir() {
        System.out.println(getTipo() + " " + getNumeroPatas() + " " + getColor() + " " + getTipoAlimentacion());
    }
}
