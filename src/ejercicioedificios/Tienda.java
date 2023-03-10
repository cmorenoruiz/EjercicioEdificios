/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioedificios;

/**
 *
 * @author usuario
 */
public class Tienda {
    private boolean isOpen;

    public Tienda() {
        this.isOpen=false;
    }

    @Override
    public String toString() {
        return "Tienda is " + isOpen;
    }
   
    
}
