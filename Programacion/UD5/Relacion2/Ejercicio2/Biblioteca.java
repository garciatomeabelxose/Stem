package Programacion.UD5.Relacion2.Ejercicio2;

import java.util.ArrayList;
import java.util.Arrays;

public class Biblioteca {

    ArrayList<Libro> listado;

    Biblioteca() {
        this.listado = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        this.listado.add(libro);
    }
    public String mostrarTodosLibros() {
        String lista = "";
        for (Libro libro : listado) {
            lista += "\n"+libro.getTitulo();
        }
        return lista;
    }
     public String mostrarTodosLibrosCompletos() {
        String lista = "";
        for (Libro libro : listado) {
            lista += " || "+libro;
        }
        return lista;
    }
    public Libro prestarLibro(int idLibroAPrestar,Biblioteca listado,int id, boolean disponibilidad){
        
        Libro libroEncontrado = null;
        for (Libro libro : listado) {
            if(.equals(id)){
                libroEncontrado = libro.disponibilidad;
            }
        }
        return libroEncontrado;

        


    }
    

}
