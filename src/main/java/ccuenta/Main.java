/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ccuenta;

/**
 *
 * @author hecto
 */
public class Main {

    public static void main(String[] args) {
        CCuenta cuenta1;
        float cantidad = 250;

        cuenta1 = new CCuenta("Antonio López", "1000-2365-85-1230456789", 2500, 0);
        operativa_cuenta(cuenta1, cantidad);
    }

    public static void operativa_cuenta(CCuenta cuenta, float cantidad) {
        double saldoActual;

        saldoActual = cuenta.estado();
        System.out.println("El saldo actual es " + saldoActual);

        try {
            cuenta.retirar(cantidad);
            System.out.println("Se ha retirado " + cantidad + " euros de la cuenta");
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            cuenta.ingresar(cantidad);
            System.out.println("Se ha ingresado " + cantidad + " euros en la cuenta");
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}
