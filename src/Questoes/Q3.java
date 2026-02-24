package Questoes;
//Declare duas variáveis contendo dois números e mostre qual deles é maior.
//Imprima a mensagem “x é o maior”, onde x é o maior número entre o dois, ou
// “os números são iguais”, caso sejam iguais.

public class Q3 {
     void main() {
        int x = 8;
        int y = 8;

        if (x > y) {
            System.out.println("x é o maior");
        } else {
            if (y > x) {
                System.out.println("y é o maior");
            } else
                System.out.println("os números são iguais");
        }
    }
}
