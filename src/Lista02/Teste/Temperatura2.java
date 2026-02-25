package Lista02.Teste;

public class Temperatura2 {
    double valor;
    String escala;

    // Criando Construtor

    public Temperatura2(double valor, String escala) {
        if (!escala.equals("K") && !escala.equals("F") && !escala.equals("C")) {
        } System.out.println("Escala inválida");
        if (escala.equals("K") && valor < 0) {
            System.out.println("erro");
        }



    }
    public double toCelsius() {
        if (escala.equals("K")) {
            return valor - 273.15;
        } else if (escala.equals("F")) {
            return ((valor - 32) - 1.8);
        }
        return valor;
    }

    public double toFahrenheit() {
        if (escala.equals("K")){
            return (valor - 273.15) * 1.8 + 32;
        } else if (escala.equals("C")) {
            return (valor * 1.8) + 32;
        }
        return valor;
    }
    public double toKelvin() {
        if (escala.equals("C")) {
            return valor + 273.15;
        } else if (escala.equals("F")) {
            return (valor -32) / 1.8 + 278.15;
        }
        return valor;
    }
}
