class Barbie extends Juguetes {
    private String colorCabello;
    private String marca;
    private boolean cambiaRopa;

    public Barbie(String nombre, String material, int edadRecomendada, String colorCabello, String marca, boolean cambiaRopa) {
        super(nombre, material, edadRecomendada);
        this.colorCabello = colorCabello;
        this.marca = marca;
        this.cambiaRopa = cambiaRopa;
    }

    public String getColorCabello() {
        return colorCabello;
    }

    public void setColorCabello(String colorCabello) {
        this.colorCabello = colorCabello;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean isCambiaRopa() {
        return cambiaRopa;
    }

    public void setCambiaRopa(boolean cambiaRopa) {
        this.cambiaRopa = cambiaRopa;
    }

    @Override
    public String toString() {
        return "Barbie{" +
                "colorCabello='" + colorCabello + '\'' +
                ", marca='" + marca + '\'' +
                ", cambiaRopa=" + cambiaRopa +
                '}';
    }
}

