package Lista02.Q6;

public class Circulomain {
    public static void main(String[] args) {
        Circulo c1 = new Circulo(5.0);


        c1.exibirDados();

        c1.raio = c1.raio * 2;

        c1.exibirDados();

        Circulo c2 = new Circulo(3.0);

        if (c2.contemOutro(c1)) {
            System.out.println("Circulo(a): " + c1.raio + "contêm o de raio  " + c2.raio );
        } else {
            System.out.println("Circulo(a): " + c2.raio + " contem o de raio " + c1.raio);
        }

    }
}
