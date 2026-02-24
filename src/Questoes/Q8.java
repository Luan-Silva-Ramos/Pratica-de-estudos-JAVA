package Questoes;
// Crie um programa que use um laço while para somar todos os números pares de 1 a 100.

public class Q8 {
    void main() {
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
