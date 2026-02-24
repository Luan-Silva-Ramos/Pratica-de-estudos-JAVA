package Exemplos;

public class Questao02 {
    public static void main(String[] args) {
        // Crie um programa que declare duas variáveis int com valores diferentes.
        // Calcule a soma, subtração, multiplicação e divisão, e imprima os resultados.
        // Preste atenção na divisão entre inteiros e como ela se comporta em Java.

        // Para compilar: javac Questao02.java
        // Para rodar: java Questao02
        int valor1 = 10;
        int valor2 = 2;
    
        int soma = valor1 + valor2;
        int div = valor1 / valor2;
        int sub = valor1 - valor2;
        int mult = valor1 * valor2;
        System.out.println("A soma é: " + soma);
        System.out.println("A divisão é: " + div);
        System.out.println("A subtração é: " + sub);
        System.out.println("A multiplicação é: " + mult);

    }
}
