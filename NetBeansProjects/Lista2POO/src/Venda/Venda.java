/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Venda;

import Negocio.Cliente;
import java.util.Date;
import java.util.LinkedList;

/**
 *
 * @author Usuario
 */
public class Venda {
    private Cliente cliente;
    private float valorTotal;
    private Date data;
    private boolean status;
    private LinkedList<ItemVenda> listaItens;
    
    public void cancelarVenda(){
        
    }
    
    public boolean adicionarItem(ItemVenda item){
        return true;
    }
    
    public boolean removerItem(ItemVenda item){
        return true;
    }
}
