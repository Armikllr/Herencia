/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Armando O
 */
public class persona extends Alumno {
    private String nombre;
    private String hermanos;
    private String ciudad;
    private String fechaNacimiento;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getHermanos() {
        return hermanos;
    }

    public void setHermanos(String hermanos) {
        this.hermanos = hermanos;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public persona (){
        
    }
    public void datos(){
        System.out.println("Nombre: " + nombre);
        System.out.println("ciudad " + ciudad);
        System.out.println("Nacimiento "+ fechaNacimiento);
    }
    
    
}
