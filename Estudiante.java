public class Estudiante extends Personas{
    private String carrera;
    private int semestre;
    private double promedio;

    public Estudiante(String nombre, int edad, String genero, String carrera, int semestre, double promedio) {
        super(nombre, edad, genero);
        this.carrera = carrera;
        this.semestre = semestre;
        this.promedio = promedio;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "carrera='" + carrera + '\'' +
                ", semestre=" + semestre +
                ", promedio=" + promedio +
                '}';
    }
}

