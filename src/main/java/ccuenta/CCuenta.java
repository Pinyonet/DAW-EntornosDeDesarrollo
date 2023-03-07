/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ccuenta;

/**
 *
 * @author hecto
 */
public class CCuenta {

    /**
     * Nombre del titular de la cuenta.
     */
    private String nombre;

    /**
     * Número de cuenta bancaria.
     */
    private String cuenta;

    /**
     * Saldo actual de la cuenta.
     */
    private double saldo;

    /**
     * Tipo de interes aplicado a la cuenta.
     */
    private double tipoInteres;

    /**
     * Constructor por defecto de la clase CCuenta.
     */
    public CCuenta() {
    }

    /**
     * Constructor de la clase CCuenta que recibe parametros.
     *
     * @param nom Nombre del titular de la cuenta.
     * @param cue Número de cuenta bancaria.
     * @param sal Saldo inicial de la cuenta.
     * @param tipo Tipo de interes aplicado a la cuenta.
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
        tipoInteres = tipo;
    }

    /**
     * Devuelve el saldo actual de la cuenta.
     *
     * @return Saldo actual de la cuenta.
     */
    public double estado() {
        return saldo;
    }

    /**
     * Realiza un ingreso en la cuenta.
     *
     * @param cantidad Cantidad a ingresar en la cuenta.
     * @throws Exception Si la cantidad es negativa.
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede ingresar una cantidad negativa");
        }
        saldo = saldo + cantidad;
    }

    /**
     * Realiza una retirada de dinero de la cuenta.
     *
     * @param cantidad Cantidad a retirar de la cuenta.
     * @throws Exception Si la cantidad es negativa o si no hay suficiente saldo
     * en la cuenta.
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0) {
            throw new Exception("No se puede retirar una cantidad negativa");
        }
        if (estado() < cantidad) {
            throw new Exception("No hay suficiente saldo en la cuenta");
        }
        saldo = saldo - cantidad;
    }

    /**
     *
     * Devuelve el nombre del titular de la cuenta.
     *
     * @return El nombre del titular de la cuenta.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * Modifica el nombre del titular de la cuenta.
     *
     * @param nombre El nuevo nombre del titular de la cuenta.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * Devuelve el numero de cuenta.
     *
     * @return El numero de cuenta.
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     *
     * Modifica el numero de cuenta.
     *
     * @param cuenta El nuevo numero de cuenta.
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     *
     * Devuelve el saldo actual de la cuenta.
     *
     * @return El saldo actual de la cuenta.
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     *
     * Modifica el saldo actual de la cuenta.
     *
     * @param saldo El nuevo saldo actual de la cuenta.
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     *
     * Devuelve el tipo de interes de la cuenta.
     *
     * @return El tipo de interes de la cuenta.
     */
    public double getTipoInteres() {
        return tipoInteres;
    }

    /**
     *
     * Modifica el tipo de interes de la cuenta.
     *
     * @param tipoInteres El nuevo tipo de interes de la cuenta.
     */
    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }
}