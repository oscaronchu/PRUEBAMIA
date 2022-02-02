/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejrepasoprogramacion;

/**
 *
 * @author dam
 */
public class Trabajador {

    private String nombre;
    private String cargo;
    private float sueldo;

    public Trabajador() {
       this.sueldo = -1;
    }

    public void actualizar(String nombre, String cargo, float sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.cargo = cargo;
    }

    public float getSueldo() {
        return sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCargo() {
        return cargo;
    }
    
}
