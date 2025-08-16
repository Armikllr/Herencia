/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Armando O
 */
public class Herencoa_1 {
    public static void main (String[] args) {
        // Aquí solo va la lógica principal, no se declaran clases completas
        Persona persona = new Persona();
        persona.setNombre("Jesús");
        persona.setCiudad("Guadalajara");
        persona.setFechaNacimiento("16/03/1998");

        persona.datos();
    }
}

// Clase Persona definida fuera del main
class Persona {
    private String nombre;
    private String ciudad;
    private String fechaNacimiento;

    // Métodos setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    // Método para mostrar datos
    public void datos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Ciudad: " + ciudad);
        System.out.println("Fecha de nacimiento: " + fechaNacimiento);
    }
}

