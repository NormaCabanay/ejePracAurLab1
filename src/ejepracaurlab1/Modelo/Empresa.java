/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejepracaurlab1.Modelo;

import java.util.ArrayList;

/**
 *
 * @author norma
 */
public class Empresa {
    private String razonSocial;
    private int cuit;
    private ArrayList<Empleado> empleado;

    public Empresa() {
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public int getCuit() {
        return cuit;
    }

    public ArrayList<Empleado> getEmpleado() {
        return empleado;
    }
    public void agregarEmpleado(ArrayList<Empleado> empleados, Empleado empleado) {
        empleados.add(empleado);
    }
    public void mostrarEmpleado(){
         for (Empleado empleado : empleado) {
            System.out.println(empleado.getNombre() + " " + empleado.getApellido()+" "
                    + ""+empleado.getDni()+" "+ empleado.getCategoria()+" "
                            + ""+empleado.getSueldo()+" "+empleado.getEmpresa());
        }
    } 
}
