// Peça a idade de uma pessoa e use uma estrutura if/else para
// determinar se ela é maior de idade (18 anos ou mais)
// ou não, e imprima a mensagem correspondente.
package Praticando;

import java.util.Scanner;


public class Questao03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual a sua idade? ");
        int idade = sc.nextInt();

        if (idade >= 18) {
            System.out.println("Ele(a) é de maior");

        } else {
            System.out.println("Ele(a) não é de maior");
        }
    }
}
