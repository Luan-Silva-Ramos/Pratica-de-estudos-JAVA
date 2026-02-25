package Lista02.Q3;

public class Temperatura {
    double valor;
    String escala;

    // Criação do construtor

    public Temperatura(double valor, String escala) {

        // Evitando confusão entre letras maiúsculas e minúsculas

        String escalaUpper = escala.toUpperCase();

        if (escalaUpper.equals("C") || escalaUpper.equals("F") || escalaUpper.equals("K")) {
            this.valor = valor;
            this.escala = escalaUpper;
        } else {
            // Caso não existir a letra correpondente, a escala passa ser inválida
            System.out.println("Escala inválida");
        }

        // Aqui está impedindo que Temeperatura em Kelvin seja negativa

        if (escalaUpper.equals("K") && valor < 0) {
            System.out.println("Erro");
        }
    }

    // Os métodos de conversão

    // Conversão para Celsius

    public Temperatura toCelsius() {
        double novoValor = valor;
        if (escala.equals("F")) {
            novoValor = (valor - 32) * 5 / 9;
        } else if (escala.equals("K")) {
            novoValor = valor - 273.15;
        }
        return new Temperatura(novoValor, escala);
    }

    // Conversão para Fahrenheit

    public Temperatura toFahrenheit() {
        double novoValor = valor;
        if (escala.equals("C")) {
            novoValor = (valor * 9 / 5) + 32;
        } else if (escala.equals("K")) {
            novoValor = (valor - 273.15) * 9 / 5 + 32;
        }
        return new Temperatura(novoValor,escala);
    }

    // Conversão para Kelvin

    public Temperatura toKelvin() {
        double novoValor = valor;
        if (escala.equals("C")) {
            novoValor = valor + 273.15;
        } else if (escala.equals("F")) {
            novoValor = (valor - 32) * 5 / 9 + 273.15;
        }
        return new Temperatura(novoValor,escala);
    }

    // Aqui com ajuda de uma pesquisa, criei uma função para facilitar o "print"
    // sem ter que fazer mudanças bruscas no codigo em si

    public void printComEscala() {

        System.out.println(valor + "°" + escala);
    }
}
