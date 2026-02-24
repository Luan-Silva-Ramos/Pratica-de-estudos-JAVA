package Questoes;
// Considere o código desenvolvido na questão 15. Imprima apenas as frutas que começam com a letra ‘M’.

public class Q16 {
    void main() {
        String [] frutas = {"Abacate", "Banana", "Damasco", "Maça", "Caju"};

        for(String fruta : frutas) {
            if (fruta.toUpperCase().startsWith("M"))
                System.out.println(fruta);
        }
    }
}
