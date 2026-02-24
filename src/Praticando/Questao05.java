// Leia dois números e mostre qual deles é maior.

package Praticando;

import java.util.Scanner;

public class Questao05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor 1: ");
        int num1 = sc.nextInt();
        System.out.println("Digite o valor 2: ");
        int num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.println("O Valor 1 é maior");
        } else if (num2 > num1) {
            System.out.println("O Valor 2 é maior");
        } else {
            System.out.println("Ambos os Valores são Iguais!");
        }
    }
}
