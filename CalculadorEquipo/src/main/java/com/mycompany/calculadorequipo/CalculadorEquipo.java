/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.calculadorequipo;

/**
 *
 * @author damt110
 */
public class CalculadorEquipo {

    public static void main(String[] args) {
        System.out.println("=== Calculadora Básica ===");
        System.out.println("Versión 1.0");
        // Ejemplo de uso de suma y resta
        System.out.println("\nEjemplos de operaciones:");
        System.out.println("5 + 3 = " + sumar(5, 3));
        System.out.println("10 - 4 = " + restar(10, 4));
    }

    // Función para sumar dos números
    public static double sumar(double num1, double num2) {
        return num1 + num2;
    }

    // Función para restar dos números
    public static double restar(double num1, double num2) {
        return num1 - num2;
    }
}
