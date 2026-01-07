/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.calculadorequipo;

import java.util.Scanner;

/**
 *
 * @author damt110
 */
public class CalculadorEquipo {

    public static void main(String[] args) {
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
                        } else {
                            System.out.println("Error: No se puede dividir entre cero");

    //1
    // Función para restar dos números
    public static double restar(double num1, double num2) {
        return num1 - num2;
                        }
                    }
                }
            } else if (opcion == 0) {
                System.out.println("¡Hasta pronto!");
            } else {
                System.out.println("Opción no válida");
            }
        } while (opcion != 0);
        scanner.close();
    }
}
