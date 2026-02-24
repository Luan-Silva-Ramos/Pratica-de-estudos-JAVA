package Questoes;
// Crie um array de double para armazenar 5 notas.
// Busque como preencher o array na inicialização e, em seguida, calcule e imprima a média das notas.

public class Q14 {
    void main() {
        double [] notas = {5.0, 8.4, 3.7, 4.8, 7.0};
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        double media = soma / notas.length;

        System.out.println(media);
    }
}
