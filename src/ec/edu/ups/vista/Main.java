/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.patronProxy.BancoProxy;

/**
 *
 * @author ariel
 */
public class Main {
    
    public static void main(String[] args) {
        
        BancoProxy bancoProxy = new BancoProxy();
        bancoProxy.mostrarDineroActual();
        bancoProxy.depositarDinero(500.26);
        bancoProxy.retirarDinero(463.12);
        
    }
    
}
