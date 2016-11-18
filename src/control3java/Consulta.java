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
public class Consulta implements Calculable {
    
    private Mascota mascota;
    private int valorChequeo;
    private int valorRemedios;
    private int valorProcedimiento;

    public Consulta() {
    }

    public Consulta(Mascota mascota, int valorChequeo, int valorRemedios, int valorProcedimiento) {
        this.mascota = mascota;
        this.valorChequeo = valorChequeo;
        this.valorRemedios = valorRemedios;
        this.valorProcedimiento = valorProcedimiento;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    public int getValorChequeo() {
        return valorChequeo;
    }

    public void setValorChequeo(int valorChequeo) {
        this.valorChequeo = valorChequeo;
    }

    public int getValorRemedios() {
        return valorRemedios;
    }

    public void setValorRemedios(int valorRemedios) {
        this.valorRemedios = valorRemedios;
    }

    public int getValorProcedimiento() {
        return valorProcedimiento;
    }

    public void setValorProcedimiento(int valorProcedimiento) {
        this.valorProcedimiento = valorProcedimiento;
    }
    
    /*Metodo que calcula el total conciderando el iva*/
    public int obtenerTotal(){
        int total;
        total=(int) ((valorChequeo+valorProcedimiento+valorRemedios)*iva);
        return total;
    }
    /*Metodo evaluar que calcula el costo del chequeo*/
    public int evaluar(){
        int chequeo;
        chequeo = getValorChequeo();
        return chequeo;
    }
}
