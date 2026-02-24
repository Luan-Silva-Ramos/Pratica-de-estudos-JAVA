// Leia o valor do consumo de energia (em kWh).
// Se for até 100, o preço é 0,50 por kWh.
// Se for maior que 100, o preço é 0,70 por kWh.
// Calcule e mostre o valor total.

package Praticando;

import java.util.Scanner;

public class Questao08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor: ");
        int valor = sc.nextInt();

        if (valor <= 100) {
            System.out.println("R$ " + valor * 0.5 + " reais de Valor a pagar");
        } else {
            System.out.println("R$ " + valor * 0.7 + " reais de Valor a pagar");
        }
    }
}
