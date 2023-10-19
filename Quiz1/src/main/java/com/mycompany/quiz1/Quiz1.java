/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.quiz1;


/**
 *
 * @author Cynthia Camacho
 */
import javax.swing.JOptionPane;

public class Quiz1 {
    public static void main(String[] args) {
        int cantidadUsuarios = 0;
        String cantidadUsuarios1 = JOptionPane.showInputDialog("Ingrese la cantidad de usuarios en la empresa:");
        cantidadUsuarios = Integer.parseInt(cantidadUsuarios1);

        double totalSalarios = 0;

        for (int i = 1; i <= cantidadUsuarios; i++) {
            String salario1 = JOptionPane.showInputDialog("Ingrese el salario del usuario " + i + ":");

            double salario = Double.parseDouble(salario1);

            double reduccion1 = salario * 0.0925;
            double descuento2 = salario * 0.0508;
            double salarioDescontado = salario - reduccion1 - descuento2;

            System.out.println("El salario con reducciones del usuario seria de" + i + ": " + salarioDescontado);
            totalSalarios += salarioDescontado;
        }

        System.out.println("El Total de los pagos a la CCSS es de: " + totalSalarios);
    }
}
