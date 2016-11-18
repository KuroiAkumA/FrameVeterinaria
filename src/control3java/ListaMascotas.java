/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control3java;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author omar-jp
 */
public class ListaMascotas {
    private ArrayList<Mascota> lista;
    
    public ListaMascotas() {
    }
    
      public ListaMascotas(ArrayList<Mascota> lista) {
        this.lista = lista;
    }

    public ArrayList<Mascota> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Mascota> lista) {
        this.lista = lista;
    }
      
    /*Metodo para agregar mascota*/  
    public void agregar(Mascota mascota){
        boolean identico = false;
        for(Mascota x : lista){
                if(x.getCodigo().equals(mascota.getCodigo())){
                    identico=true;
                    break;
                }                    
            }
            if(!identico)
                lista.add(mascota);
            else
                JOptionPane.showMessageDialog(null,"El Codigo ya existe!");
    }
    
}
