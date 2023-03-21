/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contabanco;

/**
 *
 * @author Usuario
 */
public class ContaBanco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Conta c1 = new Conta();
        c1.setNumConta(1111);
        c1.setDono("Jubileu");
        c1.abrirConta("cc");
        
        Conta c2 = new Conta();
        c2.setNumConta(2222);
        c2.setDono("Creuza");
        c2.abrirConta("cp");
        
        c1.depositar(300);
        c2.depositar(500);
        c2.sacar(100);
        
        c1.estadoAtual();
        c2.estadoAtual();
    }
    
}
