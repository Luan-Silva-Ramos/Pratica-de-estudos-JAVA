// Leia a nota de um aluno (de 0 a 10).
// Se a nota for 6 ou mais, mostre “Aprovado”.
// Senão, mostre “Reprovado”.

package Praticando;

import java.util.Scanner;

public class Questao07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual a nota do aluno? ");
        double nota = sc.nextDouble();

        if (nota >= 6) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }
}
