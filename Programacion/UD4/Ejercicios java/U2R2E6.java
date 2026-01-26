import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class U2R2E6 {

    public static void imprimirMensaje(ArrayList<String> arrayMensaje, int posicion, ArrayList<String> arrayInformacion) {


        System.out.println(arrayMensaje.get(posicion)+arrayInformacion);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Arrays
        ArrayList<String> tareas = new ArrayList<>(Arrays.asList("tarea1", "tarea2", "tarea3"));
        ArrayList<Boolean> completadas = new ArrayList<>(Arrays.asList(false, true, false));
        ArrayList<String> pendientes = new ArrayList<>(Arrays.asList());
        ArrayList<String> hechas = new ArrayList<>(Arrays.asList());
        ArrayList<String> ArrayVacio = new ArrayList<>(Arrays.asList(""));

        // Arrays de Mensajes

        // Para el valor 0 tengo un mensajes si lo introducido es un número distinto de
        // (1-5), en la posicion 1 (mensaje si lo introducido no es un int), 2 (tarea no
        // encontrada)
        final ArrayList<String> MENSAJESDEERROR = new ArrayList<>(
                Arrays.asList("Introduce un número entre: (1-5)", "ERROR Introduce un número.", "No encontrada"));

        // Para la posición 0 (Menú de opciones), 1 (Mensaje de tarea nueva), 2 (Mensaje
        // de nombre de la tarea), 3 (Mensaje de tareas pendientes), 4(Mensaje de tareas
        // completadas)
        final ArrayList<String> MENSAJESDEMENU = new ArrayList<>(
                Arrays.asList(" \n" + "1. Añadir tarea.\n" + "2. Marcar completada.\n" + "3. Ver pendientes.\n" + "4. Ver completadas.\n" + "5. Salir.",
                        "Nueva tarea:", "Nombre de la tarea:", "pendientes: " , "Completadas:"));

        // Variables

        int opcion;

        // Opción 1
        String nuevaTarea;

        // Opción 2
        String tareaBuscar;
        boolean tareaEncontrada = false;

        do {
            imprimirMensaje(MENSAJESDEMENU, 0,ArrayVacio);

            try {
                opcion = Integer.parseInt(scanner.nextLine());

                if (opcion <= 0 || opcion > 5) {

                    imprimirMensaje(MENSAJESDEERROR, 1,ArrayVacio);
                    opcion = 0;
                }
            } catch (Exception e) {

                imprimirMensaje(MENSAJESDEERROR, 1,ArrayVacio);
                opcion = 0;
            }
            if (opcion == 1) {
                imprimirMensaje(MENSAJESDEMENU, 1,ArrayVacio);
                nuevaTarea = scanner.nextLine();
                tareas.add(nuevaTarea);
                completadas.add(false);

            }

            if (opcion == 2) {
                imprimirMensaje(MENSAJESDEMENU, 2,ArrayVacio);

                tareaBuscar = scanner.nextLine();
                for (int i = 0; i < tareas.size() && !tareaEncontrada; i++) {
                    if (tareas.get(i).equals(tareaBuscar)) {
                        tareaEncontrada = true;
                        completadas.set(i, true);
                    }
                }
                if (!tareaEncontrada)
                    imprimirMensaje(MENSAJESDEERROR, 2,ArrayVacio);

            }

            if (opcion == 3) {

                for (int i = 0; i < completadas.size(); i++) {
                    if (!completadas.get(i))
                        pendientes.add(tareas.get(i));
                }

                imprimirMensaje(MENSAJESDEMENU, 3,pendientes);

            }

            if (opcion == 4) {
                for (int i = 0; i < completadas.size(); i++) {
                    if (completadas.get(i))
                        hechas.add(tareas.get(i));
                }

                imprimirMensaje(MENSAJESDEMENU, 4,hechas);

            }

        } while (opcion != 5);

    }

}
