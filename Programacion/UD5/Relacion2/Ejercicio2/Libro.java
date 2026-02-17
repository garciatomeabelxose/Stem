package Programacion.UD5.Relacion2.Ejercicio2;

public class Libro {
    private int id;
    private String titulo;
    private String autor;
    private String sinopsis;
    private boolean disponible;

    Libro(int id, String titulo, String autor, String sinopsis, boolean disponible) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.sinopsis = sinopsis;
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return "\n || ID:" + id + "|| Título:" + titulo + "|| Autor:" + autor + "|| Sinopsis:" + sinopsis + "|| Disponible:" + disponible;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public boolean getDisponible() {
        return disponible;
    }
    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public String getSinopsis(){
        return sinopsis;
    }
    public  void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

}
