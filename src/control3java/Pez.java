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
public class Pez extends Mascota {
    
    private int numAletas;
    private String color;

    public Pez() {
    }

    public Pez(int numAletas, String color, String codigo, String nombre, String direccion, int edad, String tipo) {
        super(codigo, nombre, direccion, edad, tipo);
        this.numAletas = numAletas;
        this.color = color;
    }

    public int getNumAletas() {
        return numAletas;
    }

    public void setNumAletas(int numAletas) {
        this.numAletas = numAletas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    /*Metodo que valida la cantidad de aletas*/
    public int validarAletas(int numAleta){
        if(numAleta>=0 && numAleta<=10)
            return numAleta;
        else
            JOptionPane.showMessageDialog(null, "EL NUMERO DE ALETAS ES INVALIDO"
                    + "SE AGREGO 0 POR DEFECTO");
        return 0;
    }
    /*Metodo abstracto que retorna los atributos de pez*/
    @Override
    public void mostrarDatos() {
        System.out.println(
                "Codigo :"+super.getCodigo()+
                "\nNombre :"+super.getNombre()+
                    "\nDireccion : "+super.getDireccion()+
                        "\nEdad : "+super.getEdad()+
                            "\nNumero Aletas : "+numAletas+
                                "\nColor : "+color);
    }
}
