// Crie um programa que declare duas variáveis int com
// valores diferentes. Calcule a soma, subtração, multiplicação e
// divisão, e imprima os resultados. Preste atenção na divisão entre
// inteiros e como ela se comporta em Java.
package Praticando;
public class Questao02 {
    public static void main(String[] args) {
        int v1 = 10;
        int v2 = 3;
        double v3 = 10.0;
        double v4 = 3.0;

        double soma = v1 + v4;
        double div = v3 / v2;
        int sub = v1 - v2;
        int mult = v1 * v2;
        System.out.println("O resultado da soma é: " + soma);
        System.out.println("O resultado da Divisão é: " + div);
        System.out.println("O resultado da Subtração é: " + sub);
        System.out.println("O resultado da Multiplicação é " + mult);
    }
}
