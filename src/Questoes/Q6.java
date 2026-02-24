package Questoes;
// Declare uma variável contendo o valor do consumo de energia (em kWh).
// Se for até 100, o preço é 0,50 por kWh. Se for maior que 100, o preço é 0,70 por kWh.
// Calcule e mostre o valor total.

public class Q6 {
    void main() {
        double consumo = 120.0;
        if (consumo < 100.0) {
            System.out.println(consumo * 0.5 + " é o valor a ser pago!");
        } else {
            System.out.println(consumo * 0.7 + " é o valor a ser pago!");
        }
    }
}
