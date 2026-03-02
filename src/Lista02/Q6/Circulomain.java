package Lista02.Q6;

public class Circulomain {
    public static void main(String[] args) {
        // Criação do círculo

        Circulo c1 = new Circulo(5.0);

        // exibindo os Dados do circulo

        c1.exibirDados();

        // dobrando o valor do raio

        c1.raio = c1.raio * 2;

        c1.exibirDados();

        // Criação do segundo círculo

        Circulo c2 = new Circulo(0.0);

        c2.exibirDados();

            /* Usado o método .contemOutro()
            retorna em Booleano se há a possibilidade de um círculo está presente em outro.
             */

        System.out.println(c1.contemOutro(c2));
        System.out.println(c2.contemOutro(c1));

        Circulo maior = c2.maior(c1); /* Usando o método ".maior()" para que retorne em Booleano o se a
            a comparação está correta, determinando se é true ou false
            */

        maior.exibirDados(); // Aqui, esse método vai exibir os dados do círculo maior.
    }
}
