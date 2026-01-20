/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.calculadorequipo;

import java.util.Scanner;

/**
 * Clase principal de la calculadora básica. Proporciona operaciones matemáticas
 * elementales: suma, resta, multiplicación y división.
 *
 * @author Desarrollador A, Desarrollador B, Desarrollador C
 * @version 1.0
 * @since 2024-11-21
 */
public class CalculadorEquipo {

    /**
     * Método principal que ejecuta el menú interactivo de la calculadora.
     * Permite al usuario seleccionar operaciones y realizar cálculos.
     *
     * @param args argumentos de línea de comandos (no utilizados)
     */
    public static void main(String[] args) {
        System.out.println("=== Calculadora Básica ===");
        System.out.println("Versión 1.0");
        // Ejemplo de uso de suma y resta
        System.out.println("\nEjemplos de operaciones:");
        System.out.println("5 + 3 = " + sumar(5, 3));
        System.out.println("10 - 4 = " + restar(10, 4));

        Scanner scanner = new Scanner(System.in);
        int opcion;
        double num1, num2, resultado;
        do {
            System.out.println("\n=== Calculadora Básica ===");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            if (opcion >= 1 && opcion <= 4) {
                System.out.print("Ingrese el primer número: ");
                num1 = scanner.nextDouble();
                System.out.print("Ingrese el segundo número: ");
                num2 = scanner.nextDouble();
                switch (opcion) {
                    case 1 ->
                        System.out.println("Resultado: " + num1 + " + "
                                + num2 + " = " + (num1 + num2));
                    case 2 ->
                        System.out.println("Resultado: " + num1 + " - "
                                + num2 + " = " + (num1 - num2));
                    case 3 ->
                        System.out.println("Resultado: " + num1 + " * "
                                + num2 + " = " + (num1 * num2));
                    case 4 -> {
                        if (num2 != 0) {
                            System.out.println("Resultado: " + num1 + " / " + num2
                                    + " = " + (num1 / num2));
                        } else if (num2 == 0) {
                            System.out.println("Error: No se puede dividir entre cero");
                        } else if (opcion == 0) {
                            System.out.println("¡Hasta pronto!");
                        } else {
                            System.out.println("Opción no válida");
                        }
                    }
                }}}
                while (opcion != 0); {
                    scanner.close();
                }
            
        }
        
    

    /**
     * Suma dos números decimales.
     *
     * @param num1 primer número a sumar
     * @param num2 segundo número a sumar
     * @return la suma de num1 y num2
     */
    // Función para sumar dos números
    public static double sumar(double num1, double num2) {
        return num1 + num2;
    }

    /**
     * Resta dos números decimales.
     *
     * @param num1 el minuendo (número al que se le resta)
     * @param num2 el sustraendo (número que se resta)
     * @return la diferencia entre num1 y num2 (num1 - num2)
     */
    // Función para dividir dos números
    public static double dividir(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Error: No se puede dividir entre cero");
            return 0;

        }

    }

    //1
    // Función para restar dos números
    public static double restar(double num1, double num2) {
        return num1 - num2;
    }
}
