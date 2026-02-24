// Declare uma variável idade, representando a idade de uma pessoa e use uma estrutura if/else para determinar se ela
// é maior de idade (18 anos ou mais) ou não, e imprima a mensagem correspondente.
//“Maior”, quando o usuário for maior de idade ou “Menor”, caso contrário;

package Questoes;
public class Q1 {
    public static void main (String[] args) {
        int idade = 19;
        if (idade >= 18) {
            System.out.println("Maior");
        } else {
            System.out.println("Menor");
        }
    }
}