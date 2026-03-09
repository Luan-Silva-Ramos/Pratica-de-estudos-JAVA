package Praticando;

import java.util.Arrays;
import java.util.Scanner;
public class Questao17 {
    public static void main(String[] args) {
        Scanner scSetNotas = new Scanner(System.in);
        //System.out.println("Digite suas notas: ");
        // double setNotas = scSetNotas.nextDouble();

        double [] notas = new double[5];

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Digite sua nota " + (i+1) + ": ");
            notas[i] = scSetNotas.nextDouble();

        }

        System.out.println("Suas notas: " + Arrays.toString(notas));

        double soma = 0;

        for (double nota : notas) {
            soma += nota;
        }

        double media = soma / notas.length;

        System.out.println("Essa é sua media: " + media);
    }
}
