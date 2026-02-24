package Exemplos;

public class Questao03 {
  public static void main(String[] args) {
    // Guarde a idade de uma pessoa em um int e use uma estrutura if/else para
    // determinar se ela é maior de idade (18 anos ou mais) ou não, e imprima a
    // mensagem correspondente.

    
    int idade = 13;

    if (idade >= 18) {
        System.out.println("maior de idade! " + idade);
    } else {
        System.out.println("menor de idade! " + idade);
    }
  }
}
