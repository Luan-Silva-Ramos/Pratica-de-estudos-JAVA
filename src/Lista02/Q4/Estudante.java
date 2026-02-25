package Lista02.Q4;

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
        return ("Aluno(a): " + this.nome + "Número da matrícula: " + this.matricula + "Notas: " + this.notas);

    }


    public void exBoletin() {
        System.out.println("Aluno(a): " + this.nome + " | Média do aluno(a): " + getMedia() + " | Situação atual do aluno(a): " + getSituacao());
    }
}
