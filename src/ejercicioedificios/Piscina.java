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
public class Piscina {

    private Integer litrosDeAgua;
    private boolean isFull;

    public boolean isIsFull() {
        return isFull;
    }

    public void llenar() {
        this.isFull = true;
    }

    public void vaciar() {
        this.isFull = false;
    }

    public Piscina(Integer litrosDeAgua) {
        this.litrosDeAgua = litrosDeAgua;
    }

    public Integer getLitrosDeAgua() {
        return litrosDeAgua;
    }

    public void setLitrosDeAgua(Integer litrosDeAgua) {
        this.litrosDeAgua = litrosDeAgua;
    }

    @Override
    public String toString() {
        return "Piscina de " + litrosDeAgua + " litros, está llena: " + isFull + '}';
    }

}
