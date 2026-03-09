package Praticando;

import java.util.Locale;
import java.util.Scanner;
public class Questao15 {
    public static void main(String[] args) {
        Scanner scfrase = new Scanner(System.in);
        System.out.println("Digite a frase: ");
        String frase = scfrase.nextLine();

        char letra = 'a';
        int contador = 0;

        String adptMinusculo = frase.toLowerCase();;

        for (int i = 0; i < adptMinusculo.length(); i++) {
            if (adptMinusculo.charAt(i) == letra) {
                contador++;
            }
        }
        System.out.println("A letra '" + letra + "' aparece: " + contador);

        scfrase.close();
    }
}
