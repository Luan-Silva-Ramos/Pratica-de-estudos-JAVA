// Crie um programa que use um laço while para somar
// todos os números pares de 1 a 100.

package Praticando;

public class Questao10 {
    public static void main(String[] args) {
        int soma = 0;
        int num = 1;

        while (num <= 100) {
            if (num % 2 == 0) {
                soma += num;
            }
            num++;
        }
        System.out.println(soma);
    }
}

