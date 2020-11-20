/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.patronProxy;

import ec.edu.ups.modelo.AbstractBanco;
import ec.edu.ups.modelo.BancoPichincha;
import java.util.Scanner;

/**
 *
 * @author ariel
 */
public class BancoProxy extends AbstractBanco {

    Scanner leer = new Scanner(System.in);

    AbstractBanco banco;

    public BancoProxy() {
        this.banco = new BancoPichincha();
    }

    public boolean validar() {
        System.out.print("Ingrese la contraseña:  -> ");
        var contraseña = leer.next();
        return contraseña.equals("12345");
    }

    @Override
    public void mostrarDineroActual() {
        if (validar()) {
            banco.mostrarDineroActual();
        } else {
            System.out.println("Contraseña incorrecta");
        }
    }

    @Override
    public void depositarDinero(double deposito) {
        banco.depositarDinero(deposito);
    }

    @Override
    public void retirarDinero(double retiro) {
        if (banco.getSaldo() >= retiro) {
            banco.retirarDinero(retiro);
        } else {
            System.out.println("------SALDO INSUFICIENTE------");
        }
    }
}
