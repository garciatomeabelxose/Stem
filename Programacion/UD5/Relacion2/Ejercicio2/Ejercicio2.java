package Programacion.UD5.Relacion2.Ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Biblioteca bgr = new Biblioteca();
        Libro libroAleatorio;
        Libro libroAEncontrar;
        Libro libroNuevo;

        final int NUMEROMAXPALABRASTITULO = 5;
        final int NUMEROMINPALABRASTITULO = 1;
        final String menuopciones = "1.Añadir libro  " + "\n2.Prestar un libro" + "\n3.Devolver un libro " + "\n4.Salir";
        final String MENSAJESDEERROR = "Introduce un número entre: (1-4)";
        final int numLibrosAAniadir = 100;
        int opcion;
        int contadorLibros = 1;
        String tituloAIntroducir;
        String NombreCompletoAutor;
        String sinopsisAIntroducir;
        String tituloLibroABuscar;

        for (int i = 0; i < numLibrosAAniadir; i++) {
            libroAleatorio = new Libro(contadorLibros, Faker.lorem(Faker.entero(NUMEROMINPALABRASTITULO, NUMEROMAXPALABRASTITULO)), Faker.nombreCompleto(),
                    Faker.loremCorto(), Faker.booleano());
            bgr.agregarLibro(libroAleatorio);
            contadorLibros++;
        }
        do {
            System.out.println(bgr.mostrarTodosLibrosCompletos());
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

                mostrarMensaje("Indique el título del libro que desea introducir");
                tituloAIntroducir = scanner.nextLine();
                mostrarMensaje("Indique el nombre completo del autor que desea introducir");
                NombreCompletoAutor = scanner.nextLine();
                mostrarMensaje("Indique la sinopsis del libro que desea introducir");
                sinopsisAIntroducir = scanner.nextLine();
                libroNuevo = new Libro(contadorLibros, tituloAIntroducir, NombreCompletoAutor, sinopsisAIntroducir, true);
                bgr.agregarLibro(libroNuevo);
                contadorLibros++;
                opcion = 0;
            }
            if (opcion == 2) {
                mostrarMensaje("Indique el título del libro que desea introducir");
                tituloLibroABuscar = scanner.nextLine();
                if (tituloLibroABuscar.buscarLibro() != null) {
                    libroAEncontrar = tituloLibroABuscar.buscarLibro(tituloLibroABuscar);
                } else {
                    mostrarMensaje("Libro no encontrado");
                }
                opcion = 0;
            }
            if (opcion == 3) {
                opcion = 0;
            }

        } while (opcion == 0);
        scanner.close();
    }

    public static void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}
