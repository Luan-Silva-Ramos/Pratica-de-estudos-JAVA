package Questoes;
// Declare uma variável contendo um número inteiro e escreva um programa para verificar se ele é primo.

public class Q10 {
    void main() {
        int nume = 2;
        boolean prim = true;
        if (nume <= 1) {
            prim = false;
        } else {
            for (int i = 2; i<= nume / 2; i++) {
                if (nume % i == 0) {
                    prim = false;
                    break;
                }
            }
        }
        if (prim) {
            System.out.println(nume + " é primo");
        } else {
            System.out.println(nume + " não é primo");
        }
    }
}
