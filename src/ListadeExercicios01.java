import java.util.Scanner;

public class ListadeExercicios01 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("QuestÃ£o: ");
        int q = sc.nextInt();

        switch (q) {
            case 1 -> questao1();
            case 2 -> questao2();
            case 3 -> questao3();
            case 4 -> questao4();
            case 5 -> questao5();
            case 6 -> questao6();
            case 7 -> questao7();
            case 8 -> questao8();
            case 9 -> questao9();
            case 10 -> questao10();
            case 11 -> questao11();
            case 12 -> questao12();
            case 13 -> questao13();
            case 14 -> questao14();
            case 15 -> questao15();
            case 16 -> questao16();
            default -> System.out.println("QuestÃ£o invÃ¡lida");
        }
    }

    // QuestÃµes
    // Desenvolva cada questÃ£o dentro dos mÃ©todos a seguir
    static void questao1() {
        int idade = 18;
        if (idade >= 18) {
            System.out.println("Maior");
        } else {
            System.out.println("Menor");
        }
    }

    static void questao2() {
        int numero = 10;
        if (numero % 2 == 0) {
            System.out.println("Par " + numero);
        } else {
            System.out.println("impar " + numero);
        }
    }

    static void questao3() {
        int x = 10;
        int y = 8;

        if (x > y) {
            System.out.println("x é o maior");
        }
        if (y > x) {
            System.out.println("y é o maior");
        } else {
            System.out.println("os números são iguais");
        }
    }

    static void questao4() {
        int graus = 20;
        if (graus < 20) {
            System.out.println(graus + "graus Celsius " + "Está frio");
        } else {
            System.out.println(graus + "graus Celsius " + "Está quente");
        }
    }

    static void questao5() {
        double nota = 6.8;
        if (nota >= 6.8) {
            System.out.println(nota + "Aprovado");
        } else {
            System.out.println(nota + "Reprovado");
        }
    }

    static void questao6() {
        double consumo = 75.0;
        if (consumo < 100.0) {
            System.out.println(consumo * 0.5 + "valor a ser pago");
        } else {
            System.out.println(consumo * 0.7 + "Valor a pagar");
        }
    }

    static void questao7() {
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
        }
    }

    static void questao8() {
        int soma = 0;
        int num = 1;
        while (num <= 100) {
            if (num % 2 == 0) {
                soma += num;
            }
            num++;
        }
        System.out.println(soma);
    }

    static void questao9() {
        int num = 2;
        System.out.println("Tabuda de "+ num);
        for (int mul = 2; mul <= 10; mul++) {
            System.out.println(num + "x" + mul + "=" + (num * mul));
        }
    }

    static void questao10() {
        int nume = 6;
        boolean prim = true;
        if (nume <= 1) {
            prim = false;
        } else {
            for (int i = 2; i<= nume / 2; i++) {
                if (nume % i == 0) {
                    prim = false;
                    break;
                }
            }
        }
        if (prim) {
            System.out.println(nume + " é primo");
        } else {
            System.out.println(nume + " não é primo");
        }
    }

    static void questao11() {
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

    static void questao12() {
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

    static void questao13() {
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

    static void questao14() {
        double [] notas = {5.0, 8.4, 3.7, 4.8, 7.0};
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        double media = soma / notas.length;

        System.out.println(media);
    }

    static void questao15() {
        String [] frutas = {"Abacate", "Banana", "Damasco", "Maça", "Caju"};
        for (int i = 0; i < frutas.length; i++) {
            System.out.println(frutas[i]);
        }
    }

    static void questao16() {
        String [] frutas = {"Abacate", "Banana", "Damasco", "Maça", "Caju"};

        for(String fruta : frutas) {
            if (fruta.toUpperCase().startsWith("M"))
                System.out.println(fruta);
        }
    }
}