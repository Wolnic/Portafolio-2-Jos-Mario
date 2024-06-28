/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.practico.no.pkg2;

/**
 *
 * @author josem
 */
public class cancion {
    //atributos
    public String id;
    public String titulo; 
    public String autor; 
    public int duracion; 
    public int añodeCreacion;
     
    public cancion(String id, String titulo, String autor, int duracion, int añoDeCreacion){
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.duracion = duracion;
        this.añodeCreacion = añoDeCreacion;
    }
    //set y get

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getAñodeCreacion() {
        return añodeCreacion;
    }

    public void setAñodeCreacion(int añodeCreacion) {
        this.añodeCreacion = añodeCreacion;
    }

    String getAñoDeCreacion() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}

