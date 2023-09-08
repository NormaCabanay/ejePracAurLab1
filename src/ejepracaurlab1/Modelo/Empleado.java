/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejepracaurlab1.Modelo;

/**
 *
 * @author norma
 */
public class Empleado {
     private int dni;
    private String nombre,apellido;
    private double sueldo;
    private Empresa empresa;
    private Categoria puesto;

    public Empleado(int dni, String nombre, String apellido, double sueldo, Empresa empresa, Categoria puesto) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.sueldo = sueldo;
        this.empresa = empresa;
        this.puesto = puesto;
    }
    public Empleado() {
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Categoria getPuesto() {
        return puesto;
    }

    public void setPuesto(Categoria puesto) {
        this.puesto = puesto;
    }

    

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
    
}
