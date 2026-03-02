package Praticando;

import java.util.Scanner;
public class Questao13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma letra: ");
        char letra = sc.next().charAt(0);

        switch (letra) {
            case 'a' : case 'e' : case 'i' : case 'o' : case 'u' :
            case 'A' : case 'E' : case 'I' : case 'O' : case 'U' :
                System.out.println(letra + " É uma Vogal!");
                break;
            default:
            System.out.println(letra + " Não é uma Vogal!");
        }
    }
}
