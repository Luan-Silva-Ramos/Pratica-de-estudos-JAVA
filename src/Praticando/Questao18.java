package Praticando;

import java.util.Arrays;
import java.util.Scanner;

public class Questao18 {
    public static void main(String[] args) {
        Scanner scSetFrutas = new Scanner(System.in);

        String [] frutas = new String[5];

        for (int i = 0; i < frutas.length; i++) {
            System.out.println("Digite a fruta " + (i + 1) + ": ");
            frutas[i] = scSetFrutas.nextLine();
        }

        System.out.println("Esssas são suas Frutas: " + Arrays.toString(frutas));

        for(String fruta : frutas) {
            if (fruta.toUpperCase().startsWith("M"))
                System.out.println("Apenas essa(s) frutas começam com a letra 'M' : " + fruta);
        }
       // System.out.println();
    }
}
