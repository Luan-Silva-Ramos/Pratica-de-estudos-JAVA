package Exemplos;

import java.util.Scanner;

public class TestedeScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();

        System.out.println("Ola " + nome + ", você tem " + idade + " anos.");

        sc.close();
    }    
}
