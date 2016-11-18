/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control3java;

/**
 *
 * @author LC600
 */
public class Perro extends Mascota{
    
    private boolean vacunado;
    private String colorPelaje;

    public Perro() {
    }

    public Perro(boolean vacunado, String colorPelaje, String codigo, String nombre, String direccion, int edad, String tipo) {
        super(codigo, nombre, direccion, edad,tipo);
        this.vacunado = vacunado;
        this.colorPelaje = colorPelaje;
    }

    public boolean isVacunado() {
        return vacunado;
    }

    public void setVacunado(boolean vacunado) {
        this.vacunado = vacunado;
    }

    public String getColorPelaje() {
        return colorPelaje;
    }

    public void setColorPelaje(String colorPelaje) {
        this.colorPelaje = colorPelaje;
    }
    
    /*Metodo que valida el color del pelaje*/
    public void validarColor(String color){
        if(color.equalsIgnoreCase("negro"))
            colorPelaje = color;
        if(color.equalsIgnoreCase("cafe"))
            colorPelaje=color;
        if(color.equalsIgnoreCase("blanco"))
            colorPelaje=color;
        if(color.equalsIgnoreCase("gris"))
            colorPelaje=color;
    }
    /*Metodo abstracto que retorna los atributos de perro*/
    @Override
    public void mostrarDatos() {
        System.out.println(
                "Codigo :"+super.getCodigo()+
                "\nNombre :"+super.getNombre()+
                    "\nDireccion : "+super.getDireccion()+
                        "\nEdad : "+super.getEdad()+
                            "\nVacuna :"+vacunado+
                                "\nColor Pelaje : "+colorPelaje);
    }
    
    
}
