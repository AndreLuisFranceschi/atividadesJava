/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciorepita;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n, tPar = 0, tImpar = 0, a100 = 0;
        float m, s = 0, t= 0;
        
        do{
            n = Integer.parseInt(JOptionPane.showInputDialog(null, 
                    "<html>Informe um número<br><em>[0 para interromper]</em>: </html>"));
            s += n;
            if(n!=0){
                t++;
                if(n%2==0){
                    tPar++;
                } else tImpar++;
                if(n>100) a100++;
            }
        }while(n!=0);
        
        m = (s/t);
        
        JOptionPane.showMessageDialog(null, "<html>Resultado final <hr>" +
                "<br>Total de valores: " + (int)t + 
                "<br>Somatório: " + (int)s + 
                "<br>Total de pares: " + tPar + 
                "<br>Total de ímpares: " + tImpar + 
                "<br>Acima de 100: " + a100 + 
                "<br>Média dos valores: " + m + "</html>");
    }
    
}