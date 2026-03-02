package Lista02.Q4;

import java.util.Arrays;

public class Estudante {
    String nome;
    int matricula;
    double[] notas;

    // Criação do Construtor com a exigência Varargrs
    public Estudante(String nome, int matricula, double... notas) {
        this.nome = nome;
        this.matricula = matricula;
        this.notas = notas;
    }
    // Criação do Método para saber a Média do aluno
    public double getMedia() {
        if (notas == null || notas.length == 0) return 0;

        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }
    // Criação do Método para adicionar notas
    public void setNotas(double... addNotas) {
        this.notas = addNotas;
    }

    // Puxar a nota de uma lista de acordo com a localização dentro de uma
    // lista ou array

    public double getNota(int indice) {
        if (indice >= 0 && indice < notas.length) {
            return notas[indice];
        }
        return -1;
    }

    // Método para saber a situação do aluno
    // usando outros métodos dentro, pegando a
    // média

    public String getSituacao() {
        double media = this.getMedia();

        if (media >= 70.0) {
            return "Aprovado";
        } else if (media >= 40.0) {
            return "Final";
        } else {
            return "Reprovado";
        }
    }

    // Criei esse metodo para facilitar obter apenas o nome

    public String getNome() {
        return this.nome;
    }


    // Essa pra facilitar a mostrar os dados primarios
    public String exDados() {
        return String.format("Aluno(a): %s | Número da matrícula: %d | Notas: %s",
                this.nome, this.matricula, Arrays.toString(this.notas));

    }

    // Método pra exibir os dados ja com nome, média e situação
    // usei "Boletim" para exibir

  public String exBoletim() {
        return String.format("Aluno(a): %s | Média: %.2f | Situação: %s%n",
                this.nome, getMedia(), getSituacao());
    }
}
