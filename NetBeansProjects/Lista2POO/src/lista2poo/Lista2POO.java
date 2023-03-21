/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista2poo;

import Negocio.Administrador;
import Negocio.Cliente;

/**
 *
 * @author Usuario
 */
public class Lista2POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cliente c1 = new Cliente();
        c1.setNome("Márcia");
        c1.setSobrenome("Zorzetto");
        c1.setCpf("02846389238");
        c1.setBandeiraCC("bandeira x");
        c1.setNumeroCC("1969");
        
        Administrador adm1 = new Administrador();
        adm1.setNome("Tobias");
        adm1.setSobrenome("Emanuel");
        adm1.setCpf("93027838437");
        adm1.setEmail("tobemanuel@email.com");
        
        
    }
    
}
