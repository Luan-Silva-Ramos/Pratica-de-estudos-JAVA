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

    public double getMedia() {
        if (notas == null || notas.length == 0) return 0;

        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }

    public void setNotas(double... addNotas) {
        this.notas = addNotas;
    }

    public double getNota(int indice) {
        if (indice >= 0 && indice < notas.length) {
            return notas[indice];
        }
        return -1;
    }

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

    public String getNome() {
        return this.nome;
    }

    public String exDados() {
        return String.format("Aluno(a): %s | Número da matrícula: %d | Notas: %s",
                this.nome, this.matricula, Arrays.toString(this.notas));

    }


    public String exBoletim() {
        return String.format("Aluno(a): %s | Média: %.2f | Situação: %s%n",
                this.nome, getMedia(), getSituacao());
    }
}
