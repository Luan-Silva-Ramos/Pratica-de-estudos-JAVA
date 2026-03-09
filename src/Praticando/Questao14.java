package Praticando;

import java.util.Scanner;
public class Questao14 {
    public static void main(String[] args) {
        Scanner scPalavra = new Scanner(System.in);
        System.out.println("Digite uma palavra: ");
        String palavra = scPalavra.nextLine();

        String palavraInvertida = new StringBuilder(palavra).reverse().toString();

        System.out.println("String sendo invertida: " + palavraInvertida);

        scPalavra.close();
    }
}
