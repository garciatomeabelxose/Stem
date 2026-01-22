import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class U2R2E4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> libros = new ArrayList<>(Arrays.asList("El quijote", "La Biblia", "Manual de resistencia", "La criada"));
        int opcion = 0;
        ArrayList<Integer> cantidades = new ArrayList<>(Arrays.asList(5, 3, 1, 7));
        String libroNuevo;
        int cantidadLibroActualizado;
        String libroActualizado;
        int cantidadLibroNuevo;

        do {
           
            try {
                System.out.println(" \n"+ "1. Añadir un nuevo libro.\n" + //
                        "2. Actualizar cantidad.\n" + //
                        "3. Ver inventario.\n" + //
                        "4. Salir.\"");
                opcion = Integer.parseInt(input.nextLine());

                if (opcion <= 0 || opcion > 4) {
                    System.out.println("Introduce un número entre: (1-4)");
                    opcion = 0;
                }
            } catch (Exception e) {
                System.out.println("ERROR Introduce un número.");
                opcion = 0;
            }
            if (opcion == 1) {
                System.out.println("Introduzca el nombre del libro:");
                libroNuevo = input.nextLine();
                input.nextLine();
                System.out.println("Cantidad disponible:");
                cantidadLibroNuevo = Integer.parseInt(input.nextLine());
                libros.add(libroNuevo);
                cantidades.add(cantidadLibroNuevo);
                opcion = 0;
            } else if (opcion == 2) {

                System.out.println("Nombre del libro a actualizar:");
                libroActualizado = input.nextLine();
                System.out.println("Cantidad a actualizar:");
                cantidadLibroActualizado = Integer.parseInt(input.nextLine());

                boolean encontrado = false;

                for (int i = 0; i < libros.size() && !encontrado; i++) {
                    if (libros.get(i).equals(libroActualizado)) {
                        encontrado = true;
                        cantidades.set(i, cantidadLibroActualizado);
                    }
                }

                if (!encontrado) {
                    System.out.println("Libro no encontrado");
                }
                opcion = 0;
            } else if (opcion == 3) {

                System.out.println("Inventario:");
                for (int i = 0; i < libros.size(); i++) {
                    System.out.println(libros.get(i) + " - " + cantidades.get(i) + " unidades");
                }
                opcion = 0;
            }
            
        } while (opcion == 0);

        input.close();
    }
}