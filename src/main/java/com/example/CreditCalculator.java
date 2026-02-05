package com.example;

import java.util.Scanner;

public class CreditCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el monto del crédito: ");
        double amount = scanner.nextDouble();

        System.out.print("Ingrese la tasa de interés (en %): ");
        double interestRate = scanner.nextDouble();

        System.out.print("Ingrese el número de meses: ");
        int months = scanner.nextInt();

        double monthlyInterest = interestRate / 100 / 12;
        double monthlyPayment = (amount * monthlyInterest) / (1 - Math.pow(1 + monthlyInterest, -months));

        System.out.printf("El pago mensual es: %.2f\n", monthlyPayment);

        scanner.close();
    }
}