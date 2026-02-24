package Questoes;
// Crie um array de inteiros pré-definido. Declare uma variável contendo um número
// e verifique se esse número está presente no array.

public class Q13 {
    void main() {
        int [] inteiros = {1,2,23,134,867};
        int numx = 24;
        boolean find = false;
        for (int num : inteiros) {
            if (num == numx){
                find = true;
                break;
            }
        }
        if (find) {
            System.out.println("O número " + numx + " está presente no array");
        } else {
            System.out.println("O número " + numx + " não está presente no array");
        }
    }
}
