package lab9p1_gabrielosorto;

import java.util.Scanner;

public class Libros {

    Scanner sc = new Scanner(System.in);

    public Libros() {
    }
    String titulo;
    String autor;
    String genero;
    int edad;

    public Libros(String titulo, String autor, String genero, int edad) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.edad = edad;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

}
