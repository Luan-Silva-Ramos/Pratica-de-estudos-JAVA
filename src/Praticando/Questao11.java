// Peça ao usuário um número e imprima a tabuada
// desse número, de 1 a 10. Use um laço for.

package Praticando;

import java.util.Scanner;

public class Questao11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int dgtNum = sc.nextInt();

        for (int multi = 1; multi <= 10; multi++) {
            System.out.println(dgtNum + "x" + multi + "=" + (dgtNum * multi));
        }

    }
}
