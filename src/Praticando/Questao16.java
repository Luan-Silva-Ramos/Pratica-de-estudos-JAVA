package Praticando;

import java.util.Arrays;
import java.util.Scanner;
public class Questao16 {
    public static void main(String[] args) {
        Scanner scNumCheck = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int numCheck = scNumCheck.nextInt();

        int [] numeros = {1,2,3,4,5};

        boolean check = false;

        for(int elemento : numeros) {
            if(elemento == numCheck) {
                check = true;
                break;
            }
        }
/*
        boolean check = Arrays.asList(numeros).contains(scNumCheck);
        System.out.println(check);

 */
        System.out.println(check);
    }
}
