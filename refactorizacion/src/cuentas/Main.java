/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuentas;

/**
 *
 * @author Oliver Perez 1ºDAM
 */
public class Main {
    
    public static void operativa_cuenta(CCuenta cuenta, float cantidad) {
        double saldoActual = cuenta.getSaldo();
        System.out.println("El saldo actual es " + saldoActual);

        try {
            cuenta.retirar(cantidad);
            System.out.println("Retiro exitoso");
        } catch (Exception e) {
            System.out.println("Fallo al retirar");
        }

        try {
            cuenta.ingresar(cantidad);
            System.out.println("Ingreso en cuenta exitoso");
        } catch (Exception e) {
            System.out.println("Fallo al ingresar");
        }

        saldoActual = cuenta.getSaldo();
        System.out.println("El saldo actual es " + saldoActual);
    }
    
    
    
    
public static void main(String[] args) {
        CCuenta cuenta1 = new CCuenta("Antonio López", "1000-2365-85-1230456789", 2500, 0);
        float cantidad = 100; 
        operativa_cuenta(cuenta1, cantidad);
       
       
    }



    
    
}

