/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.patronProxy;

import ec.edu.ups.modelo.AbstractBanco;

/**
 *
 * @author ariel
 */
public class BancoProxy {
    
    AbstractBanco banco;

    public BancoProxy(AbstractBanco banco) {
        this.banco = banco;
    }
    
    public void mostrarSaldo() {
        banco.mostrarDineroActual();
    }
    
    public void depositar(double deposito) {
        banco.depositarDinero(deposito);
    }
    
    public void retirar(double retiro) {
        banco.retirarDinero(retiro);
    }
    
}
