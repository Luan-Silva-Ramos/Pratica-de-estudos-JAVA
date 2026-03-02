package Lista02.Q7;

public class Relogiomain {
    public static void main(String[] args) {
        Relogio clockA = new Relogio(23, 59, 57);

        for (int i = 0; i < 5; i++) {
            clockA.tick();

            System.out.println("Horário atualzado: " + clockA.exibirHorario());
        }

        Relogio clockB = new Relogio(12, 20, 30);

        clockA.isMaiorQue(clockB);
    }
}
