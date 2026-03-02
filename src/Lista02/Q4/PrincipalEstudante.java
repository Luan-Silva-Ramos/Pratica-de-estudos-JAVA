package Lista02.Q4;

import java.sql.SQLOutput;

public class PrincipalEstudante {
    public void main(String[] args) {

        Estudante dados = new Estudante ("John",5555, 70.0,40.0,50.6,80.4);

        dados.exDados();
        dados.exBoletim();

        //System.out.println();

    }
}
