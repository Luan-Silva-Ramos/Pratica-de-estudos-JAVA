package Questoes;
// Declare uma variável contendo uma única letra.
// Use uma estrutura switch para verificar se a letra é uma vogal ou uma consoante.

public class Q11 {
    void main() {
        char letra = 'e';
        switch (letra) {
            case 'a': case 'e': case 'i': case 'o': case 'u':
            case 'A': case 'E': case 'I': case 'O': case 'U':
                System.out.println(letra + " é uma vogal.");
                break;
            default:
                System.out.println(letra + " é uma consoante");
                break;
        }
    }
}
