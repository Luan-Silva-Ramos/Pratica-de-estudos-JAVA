package Lista02.Q7;

public class Relogio {
    int horas;
    int minutos;
    int segundos;

    public Relogio(int horas, int minutos, int segundos) {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    public void tick() {
        segundos = segundos + 1;
        if (segundos == 60) {
            segundos = 0;
            minutos = minutos + 1;
            if (minutos == 60) {
                minutos = 0;
                horas = horas + 1;
                if (horas == 24) {
                    horas = 0;
                    //minutos = 0;
                    //segundos = 0;
                }
            }
        }
    }
    public void adicionarSegundos(int segundos) {
        for (int i =0; i < segundos; i++) {
            tick();
        }

    }
    public String exibirHorario() {

        return String.format("%02d:%02d:%02d", horas, minutos, segundos);



    }


    public boolean isMaiorQue(Relogio outro) {
        int testeRel1 = (this.horas * 3600) + (this.minutos * 60) + this.segundos;
        int testeOutro = (outro.horas * 3600) + (outro.minutos * 60) + outro.segundos;

        return testeRel1 > testeOutro;
    }

}
