// Leia a temperatura em graus Celsius e diga se está frio
// (menor que 20) ou quente (20 ou mais).

package Praticando;

import java.util.Scanner;

public class Questao06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual a temperatura atual? ");
        double temp = sc.nextDouble();

        if (temp < 20) {
            System.out.println("De acordo com a temperatura, está Frio!");
        } else {
            System.out.println("De acordo com a temperatura atual, está Quente!");
        }
    }
}
