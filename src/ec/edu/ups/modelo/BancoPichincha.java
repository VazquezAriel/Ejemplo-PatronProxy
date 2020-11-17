/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

/**
 *
 * @author ariel
 */
public class BancoPichincha extends AbstractBanco{
    
    @Override
    public void mostrarDineroActual() {
        System.out.println("-----Banco Pichincha-----\n");
        System.out.println("Tu saldo Actual es: " + getSaldo());
        System.out.println("--------------------------");
    }

    @Override
    public void depositarDinero(double deposito) {
        System.out.println("-----Banco Pichincha-----\n");
        System.out.println("El valor de tu deposito  es: " + deposito);
        setSaldo(getSaldo() + deposito);
        System.out.println("Tu saldo Actual es: " + getSaldo());
        System.out.println("--------------------------");
    }

    @Override
    public void retirarDinero(double retiro) {
        System.out.println("-----Banco Pichincha-----\n");
        System.out.println("El valor de tu retiro es: " + retiro);
        setSaldo(getSaldo() - retiro);
        System.out.println("Tu saldo Actual es: " + getSaldo());
        System.out.println("--------------------------");
    }
    
}
