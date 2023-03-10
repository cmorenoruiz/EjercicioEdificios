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
public class EjercicioEdificios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona conserje = new Persona("Nacho");
        System.out.println(conserje.toString());
        Tienda panaderia = new Tienda();
        System.out.println(panaderia.toString());
        Piscina piscina = new Piscina(45);
        System.out.println(piscina.toString());
        piscina.vaciar();
        System.out.println(piscina.toString());
        System.out.println("Estoy llenando la piscina");
        piscina.llenar();
        System.out.println(piscina.toString());
    }

}
