package Programacion.UD5.Relacion2.Ejercicio1;

public class Ejercicio1 {
    public static void main(String[] args) {
        Estudiante alfredo = new Estudiante("Alfredo", 22, "STEM001");
        Estudiante cristobal = new Estudiante("Cristobal Soria", 23, "STEM002");
        Estudiante tomas = new Estudiante("Tomas Roncero", 20, "STEM003");
        String estudianteABuscar;
        System.out.println(alfredo);
        alfredo.setNombre("Alfredo Duro");
        System.out.println(alfredo.getNombre());
        alfredo.setEdad(18);
        System.out.println(alfredo.getEdad());
        Universidad ugr = new Universidad();
        Universidad uma = new Universidad();
        ugr.agregarEstudiante(alfredo);
        ugr.agregarEstudiante(tomas);
        uma.agregarEstudiante(cristobal);
        System.out.println(ugr.mostrarTodosEstudiantes());
        System.out.println(uma.mostrarTodosEstudiantes());
        System.out.println(ugr.mostrarTodosEstudiantesCompletos());
        System.out.println(uma.mostrarTodosEstudiantesCompletos());
        estudianteABuscar="STEM002";
        System.out.println(uma.buscarEstudiante(estudianteABuscar));

        




    }
}
