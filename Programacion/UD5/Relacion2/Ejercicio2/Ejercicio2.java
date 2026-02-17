package Programacion.UD5.Relacion2.Ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Biblioteca bgr = new Biblioteca();
        Libro libroAleatorio;

        final int NUMEROMAXPALABRASTITULO = 5;
        final int NUMEROMINPALABRASTITULO = 1;
        final String menuopciones = "1.Agregar libros  " + "\n 2.Prestar un libro" + "\n3.Devolver un libro " + "\n4.Salir";
        final String MENSAJESDEERROR = "Introduce un número entre: (1-5)";

        int opcion;
        int numLibrosAAniadir=100;
        int idLibroAPrestar;
        String mensaje;

        for (int i = 0; i < numLibrosAAniadir; i++) {
                    libroAleatorio = new Libro(i + 1, Faker.lorem(Faker.entero(NUMEROMINPALABRASTITULO, NUMEROMAXPALABRASTITULO)), Faker.nombreCompleto(),
                            Faker.loremCorto(), Faker.booleano());
                    bgr.agregarLibro(libroAleatorio);
                }
                System.out.println(bgr.mostrarTodosLibrosCompletos());
        do {
            
            mostrarMensaje(menuopciones);
            opcion = Integer.parseInt(scanner.nextLine());
            try {
                if (opcion <= 0 || opcion > 5) {

                    mostrarMensaje(MENSAJESDEERROR);
                    opcion = 0;
                }
            } catch (Exception e) {

                mostrarMensaje(MENSAJESDEERROR);
                opcion = 0;
            }
            if (opcion == 1) {
                mostrarMensaje("¿Cuántos libros desea añadir?");
                numLibrosAAniadir = Integer.parseInt(scanner.nextLine());
                for (int i = 0; i < numLibrosAAniadir; i++) {
                    libroAleatorio = new Libro(i + 1, Faker.lorem(Faker.entero(NUMEROMINPALABRASTITULO, NUMEROMAXPALABRASTITULO)), Faker.nombreCompleto(),
                            Faker.loremCorto(), Faker.booleano());
                    bgr.agregarLibro(libroAleatorio);
                }
                System.out.println(bgr.mostrarTodosLibrosCompletos());
            }
            if (opcion == 2) {
                mostrarMensaje("Indique el número del libro que desea prestar");
                idLibroAPrestar = Integer.parseInt(scanner.nextLine())-1;
                
            
            }
            if (opcion == 3) {

            }

        } while (opcion == 0);
    }

    public static void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}
