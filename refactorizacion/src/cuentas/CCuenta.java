/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuentas;

/**
 *
 * @author Oliver Perez 1ºDAM
 */
public class CCuenta {
    
  
 
    
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;

    public CCuenta() {}
    
    
    /**
     * 
     * @param nombre
     * @param cuenta
     * @param saldo
     * @param tipoInteres 
     */

    public CCuenta(String nombre, String cuenta, double saldo, double tipoInteres) {
        this.nombre = nombre;
        this.cuenta = cuenta;
        this.saldo = saldo;
        this.tipoInteres = tipoInteres;
    }

    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getTipoInteres() {
        return tipoInteres;
    }

    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }

    
    /**
     * 
     * @param cantidad
     * @throws Exception no es posible una cantidad negativa
     * Metodo para ingresar dinero en la cuenta 
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0)
            throw new Exception("No se puede ingresar una cantidad negativa");

        saldo += cantidad;
    }

    
    /**
     * 
     * @param cantidad
     * @throws Exception no es posible cantidad negativa y no hay saldo
     * Metodo para retirar dinero de la cuenta
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0)
            throw new Exception("No se puede retirar una cantidad negativa");

        if (saldo < cantidad)
            throw new Exception("No hay suficiente saldo");

        saldo -= cantidad;
        
        
    }
   
}