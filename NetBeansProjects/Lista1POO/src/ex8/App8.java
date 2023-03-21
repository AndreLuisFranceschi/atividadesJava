/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex8;

/**
 *
 * @author Usuario
 */
public class App8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Lampada l = new Lampada();
        
        System.out.println(l.toString());
        
        l.ligar();
        
        System.out.println(l.toString());
        
        l.desligar();
        
        System.out.println(l.toString());
        
        l.customizar(8);
        
        System.out.println(l.toString());
    }
    
}
