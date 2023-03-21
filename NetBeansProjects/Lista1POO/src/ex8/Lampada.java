/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex8;

/**
 *
 * @author Usuario
 */
public class Lampada {
    private int luminosidade;
    private boolean ligada;

    public Lampada() {
        this.luminosidade = 0;
        this.ligada = false;
    } 
        
    public void ligar(){
        if (this.ligada == false) {
            this.luminosidade = 100;
            this.ligada = true;
        }
    }
    
    public void desligar(){
        if (ligada == true) {
            this.luminosidade = 0;
            this.ligada = false;
        }
    }
    
    public void customizar(int n){
        if (n >= 0 && n <= 100) {
            this.luminosidade = n;
            this.ligada = true;
        } else {
            System.out.println("Valor fora do intervalo '0-100'");
        }
    }

    public int getLuminosidade() {
        return luminosidade;
    }

    public void setLuminosidade(int luminosidade) {
        this.luminosidade = luminosidade;
    }

    public boolean getLigada() {
        return ligada;
    }

    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }

    @Override
    public String toString() {
        return "Lampada{" + "luminosidade=" + luminosidade + 
                ", ligada=" + ligada + '}';
    }
        
}
