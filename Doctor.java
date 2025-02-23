public class Doctor extends Personas{
    private String especialidad;
    private int añosExperiencia;
    private boolean atiendeUrgencias;

    public Doctor(String nombre, int edad, String genero, String especialidad, int añosExperiencia, boolean atiendeUrgencias) {
        super(nombre, edad, genero);
        this.especialidad = especialidad;
        this.añosExperiencia = añosExperiencia;
        this.atiendeUrgencias = atiendeUrgencias;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getAñosExperiencia() {
        return añosExperiencia;
    }

    public void setAñosExperiencia(int añosExperiencia) {
        this.añosExperiencia = añosExperiencia;
    }

    public boolean isAtiendeUrgencias() {
        return atiendeUrgencias;
    }

    public void setAtiendeUrgencias(boolean atiendeUrgencias) {
        this.atiendeUrgencias = atiendeUrgencias;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "especialidad='" + especialidad + '\'' +
                ", añosExperiencia=" + añosExperiencia +
                ", atiendeUrgencias=" + atiendeUrgencias +
                '}';
    }
}

