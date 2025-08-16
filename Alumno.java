/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Armando O
 */
public class Alumno {
    private String carrera;
    private String escuela;
    private String salon; 

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getEscuela() {
        return escuela;
    }

    public void setEscuela(String escuela) {
        this.escuela = escuela;
    }

    public String getSalon() {
        return salon;
    }

    public void setSalon(String salon) {
        this.salon = salon;
    }
    public Alumno () {
        
    }
    public void escolar () {
        System.out.println("Licenciatura:" + carrera);
        System.out.println("Colegio: "+ escuela);
        System.out.println("Salón:" + salon);
        
    }
    
}
