/*
 * tipos de metodos
 * 
 * sin retorno sin paramettros
 * sin retorno con paramettros
 * con retorno sin paramettros
 * con retorno sin paramettros
 */

import javax.swing.JOptionPane;

public class metodos {

    public static void main(String[] args) {

        sumar();
    }

    //sin retorno sin paramettros

    public static void sumar() {
        System.out.println("ingresa al metodo");
        int a =Integer.parseInt(JOptionPane.showInputDialog("ingrese a"));
        int b =Integer.parseInt(JOptionPane.showInputDialog("ingrese b"));
        int suma = a+b;
        System.out.println("la suma es: " + suma);
    }
    
}
