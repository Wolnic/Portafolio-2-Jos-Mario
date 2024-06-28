/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.practico.no.pkg2;

/**
 *
 * @author josem
 */
public class EjercicioPracticoNO2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        cancion miCancion = new cancion("1", "Secreto de amor", "Joan Sebastian", 434, 2000);
        //Get y set
        System.out.println("ID: " + miCancion.getId());
        System.out.println("Titulo: " + miCancion.getTitulo());
        System.out.println("Autor: " + miCancion.getAutor());
        System.out.println("Duracion: " + miCancion.getDuracion());
        System.out.println("Anio de Creacion: " + miCancion.getAñodeCreacion());
        miCancion.setTitulo("Je ne vole");
        System.out.println("Nuevo Titulo: " + miCancion.getTitulo());

    }
    
}
