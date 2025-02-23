public class MainPersonas {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("Estefany Holguin", 18, "Femenino", "Ing.software", 2, 4.1);
        System.out.println(estudiante.toString());
        Doctor doctor = new Doctor("Pepito Perez", 30, "Masculino", "Optometria", 5, false);
        System.out.println(doctor.toString());
    }
}
