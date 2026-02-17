package Programacion.UD5.Relacion2.Ejercicio2;

import java.util.ArrayList;

public class Biblioteca {

    ArrayList<Libro> listado;

    Biblioteca() {
        this.listado = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        if (!listado.contains(libro)) {
            this.listado.add(libro);
        }
    }

    public String mostrarTodosLibros() {
        String lista = "";
        for (Libro libro : listado) {
            lista += "\n" + libro.getTitulo();
        }
        return lista;
    }

    public String mostrarTodosLibrosCompletos() {
        String lista = "";
        for (Libro libro : listado) {
            lista += " || " + libro;
        }
        return lista;
    }

    // Devuelve el libro si lo encuentra o null en el otro caso
    public Libro buscarLibro(String titulo) {
        Libro libroEncontrado = null;
        for (Libro libro : listado) {
            if (libro.getTitulo().equals(titulo)) {
                libroEncontrado = libro;
            }
        }
        return libroEncontrado;

    }

    public boolean prestar(Libro libro) {
        boolean prestamoDisponible = libro.getDisponible();
        if (prestamoDisponible) {
            libro.setDisponible(false);
        }
        return prestamoDisponible;
    }
    public boolean devolver(Libro libro) {
        boolean prestamoDisponible = libro.getDisponible();
        if (!prestamoDisponible) {
            libro.setDisponible(true);
        }
        return prestamoDisponible;
    }
}