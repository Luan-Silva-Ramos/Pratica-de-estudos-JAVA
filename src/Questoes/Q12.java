package Questoes;
// Declare uma variável contendo uma frase e conte quantas vezes a
// letra ‘a’ (minúscula ou maiúscula) aparece na frase.

public class Q12 {
    void main() {
        String frase = "Um dia na faculdade";
        char letraAlvo = 'a';
        int contador = 0;

        frase = frase.toLowerCase();
        letraAlvo = Character.toLowerCase(letraAlvo);
        for (int x = 0; x < frase.length(); x++) {
            if (frase.charAt(x) == letraAlvo) {
                contador ++;
            }
        }
        System.out.println("A letra a ou A, aparece " + contador + " vezes");
    }
}
