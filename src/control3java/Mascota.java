/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control3java;

import javax.swing.JOptionPane;

/**
 *
 * @author LC600
 */
public abstract class Mascota {
    
    private String codigo;
    private String nombre;
    private String direccion;
    private int edad;
    private String tipo;

    public Mascota() {
    }

    public Mascota(String codigo, String nombre, String direccion, int edad, String tipo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.direccion = direccion;
        this.edad = edad;
        this.tipo = tipo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTipo(String tipo) {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    /*Metodo que valida que el nombre no este en blanco*/
    public void validarNombre(){
        if(getNombre().equalsIgnoreCase(null))
            JOptionPane.showMessageDialog(null, "TIENE QUE LLENAR EL CAMPO NOMBRE");
    }
    /*Metodo que valida que la edad no sea menor que 0*/
    public int validarEdad(int x){
        edad = x;
        if(x >=0)
            return x;
        else
            JOptionPane.showMessageDialog(null, "EDAD INVALIDA SE AGREGO 0 POR DEFECTO");
        return 0;
    }
    /*Metodo abstracto para retornar los atributos*/
    public abstract void mostrarDatos();
    
}
