package Lista02.Q4;

import java.sql.SQLOutput;

public class PrincipalEstudante {
    public void main(String[] args) {

        Estudante dados = new Estudante("John", 5555, 70.0, 40.0, 50.6, 80.4);

        /*Testando método .getMedia()

                No qual, pega as notas dentro do construtor e as divide pelo valor do tamanho do array

                 */

        System.out.println("Média do aluno(a): " + dados.getMedia());

                /*Testando método .setNotas()

                 Esse método ele reseta todas as notas, assim podendo adiconar novas
             notas sem interferir no uso de outros métodos, facilitando o uso.

                 */

        dados.setNotas(10.0, 20.0, 60.0);

                /*Testando método .getNota()

                Usando o valor dentro do indices criado na classe estudante fazendo comparação com a quantidade
             de notas e se seu valor é igual o maior que zero.
             Servindo para rastrear determinada nota

                 */

        System.out.println("Nota selecionada: " + dados.getNota(1));

        //Testando método .exDados
        //Criei esse método para exibir todos os dados do construtor, reunindo todos em uma
        // unica chamada

        System.out.println("Dados do aluno(a): " + dados.exDados());

        //Testando o método .getSituacao()

        System.out.println("Situação do aluno(a): " + dados.getSituacao());

        //Testando método .exBoletim()
        // Criei esse método para reunir todas as informações processadas onde foi
        // usado metodos de  obter media, notas e situação, juntado todos esse dados
        // em um unico método.

        System.out.println("Boletim do aluno(a): " + dados.exBoletim());

    }

}