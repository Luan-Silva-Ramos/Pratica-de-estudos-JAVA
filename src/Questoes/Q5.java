package Questoes;
// Declare uma variável contendo a nota de um aluno (de 0 a 10).
// Se a nota for 6.8 ou mais, mostre “Aprovado”. Senão, mostre “Reprovado”.

public class Q5 {
    void main() {
        double nota = 6.7;
        if (nota >= 6.8) {
            System.out.println(nota + " Aprovado!");
        } else {
            System.out.println(nota + " Reprovado!");
        }
    }
}
