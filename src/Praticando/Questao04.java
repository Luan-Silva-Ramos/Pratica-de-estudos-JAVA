// Peça ao usuário um número inteiro e diga se ele é par ou ímpar

package Praticando;

import java.util.Scanner;

public class Questao04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        int valor = sc.nextInt();



        if (valor % 2 == 0) {
            System.out.println("O Valor correspondente é Par!");

        } else {
            System.out.println("O Valor correspondente é Ímpar!");

        }
    }
}
