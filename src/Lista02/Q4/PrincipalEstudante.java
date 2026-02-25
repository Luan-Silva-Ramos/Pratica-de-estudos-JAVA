package Lista02.Q4;

import java.sql.SQLOutput;

public class PrincipalEstudante {
    public void main(String[] args) {

        Estudante dados = new Estudante ("John",5555, 7.0,9.0,5.6,8.4);

        Estudante aluno = dados.getMedia();
        Estudante aluno = dados.getSituacao();

    }
}
