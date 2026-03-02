package Praticando;

import java.util.Scanner;
public class Questao12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int dgtNum2 = sc.nextInt();
        boolean prim = true;

        if (dgtNum2 <= 1) {
            prim = false;
        } else {
            for (int i = 2; i<= dgtNum2 / 2; i++){
                if (dgtNum2 % i == 0) {
                    prim = false;
                    break;
                }
            }
        }
        if (prim) {
            System.out.println(dgtNum2 + " é primo");
        } else {
            System.out.println(dgtNum2 + " não é primo");
        }
    }
}

