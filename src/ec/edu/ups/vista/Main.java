/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.patronProxy.BancoProxy;
import ec.edu.ups.modelo.BancoPacifico;
import ec.edu.ups.modelo.BancoPichincha;

/**
 *
 * @author ariel
 */
public class Main {
    
    public static void main(String[] args) {
        
        BancoProxy bancoProxy = new BancoProxy(new BancoPacifico());
        bancoProxy.depositar(250.6);
        bancoProxy.mostrarSaldo();
        bancoProxy.retirar(100);
        
        BancoProxy bancoProxy2 = new BancoProxy(new BancoPichincha());
        bancoProxy2.depositar(2.6);
        bancoProxy2.mostrarSaldo();
        bancoProxy2.retirar(0.3);
        
    }
    
}
