/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio;

/**
 *
 * @author Usuario
 */
public class Cliente extends Pessoa{
    private String bandeiraCC;
    private String numeroCC;

    public String getBandeiraCC() {
        return bandeiraCC;
    }

    public void setBandeiraCC(String bandeiraCC) {
        this.bandeiraCC = bandeiraCC;
    }

    public String getNumeroCC() {
        return numeroCC;
    }

    public void setNumeroCC(String numeroCC) {
        this.numeroCC = numeroCC;
    }

    @Override
    public String toString() {
        return super.toString() + "Cliente{" + "bandeiraCC=" + bandeiraCC + ", numeroCC=" + numeroCC + '}';
    }

     
    
    
}
