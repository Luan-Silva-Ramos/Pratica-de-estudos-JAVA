package Praticando;

import java.util.Scanner;
public class Questao19 {
    public static void main(String[] args) {
        Scanner scNumero = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = scNumero.nextInt();

        int posCheck = -1;

        int [] numerosInt = {0,1,2,3,4,5,6,7,8,9};

        for (int i = 0; i < numerosInt.length; i++) {
            if (numerosInt[i] == numero) {
                posCheck = i;
                break;
            }
        }
        if (posCheck != -1) {
            System.out.println("O número " + numero + " foi encontrado na posição (índice): " + posCheck);
        } else {
            System.out.println("O número " + numero + " não existe neste array.");
        }

        scNumero.close();

    }
}
