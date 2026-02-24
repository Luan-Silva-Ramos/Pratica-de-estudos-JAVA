package Questoes;
// Declare uma variável contendo um número e imprima a tabuada desse número, de 1 a 10. Use um laço for.

public class Q9 {
    void main() {
        int num = 2;
        System.out.println("Tabuda de "+ num);
        for (int mul = 2; mul <= 10; mul++) {
            System.out.println(num + "x" + mul + "=" + (num * mul));
        }
    }
}
