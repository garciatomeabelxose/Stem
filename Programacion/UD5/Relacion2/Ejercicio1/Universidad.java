package Programacion.UD5.Relacion2.Ejercicio1;

import java.util.ArrayList;

public class Universidad {

    ArrayList<Estudiante> alumnado;

    Universidad() {
        this.alumnado = new ArrayList<>();
    }
    public void agregarEstudiante(Estudiante estudiante) {
        this.alumnado.add(estudiante);
    }
    public String mostrarTodosEstudiantes() {
        String lista = "";
        for (Estudiante estudiante : alumnado) {
            lista += "\n"+estudiante.getNombre();
        }
        return lista;
    }
    public String mostrarTodosEstudiantesCompletos() {
        String lista = "";
        for (Estudiante estudiante : alumnado) {
            lista += " || "+estudiante;
        }
        return lista;
    }
    //Devuelve estudiante si lo encuentra sino null
    public Estudiante buscarEstudiante(String numeroDeMatricula){
        Estudiante estudianteEncontrado= null;
        for (Estudiante estudiante : alumnado) {
            if (numeroDeMatricula.equals(estudiante.getNumeroDeMatricula())){
                estudianteEncontrado = estudiante;
            }
        }
        return estudianteEncontrado;
    }
}
