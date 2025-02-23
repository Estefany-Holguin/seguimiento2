public class Juguetes {
    private String nombre;
    private String material;
    private int edadRecomendada;

    public Juguetes(String nombre, String material, int edadRecomendada) {
        this.nombre = nombre;
        this.material = material;
        this.edadRecomendada = edadRecomendada;
    }

    @Override
    public String toString() {
        return "Juguetes{" +
                "nombre='" + nombre + '\'' +
                ", material='" + material + '\'' +
                ", edadRecomendada=" + edadRecomendada +
                '}';
    }
}


