
public void main(String[] args) {
    // 1. Cria a temperatura inicial (exemplo: 25 graus Celsius)
    Temperatura tempOriginal = new Temperatura(25.0, "C");

    // 2. Converte a MESMA temperatura para as três escalas
    // Cada método retorna uma "nova instância" (um novo objeto)
    Temperatura t1 = tempOriginal.toCelsius();
    Temperatura t2 = tempOriginal.toFahrenheit();
    Temperatura t3 = tempOriginal.toKelvin();

    // 3. Exibe os resultados usando o método solicitado
    System.out.println("Resultados das conversões:");
    t1.imprimeComEscala();
    t2.imprimeComEscala();
    t3.imprimeComEscala();}



public class Temperatura {
    double valor;
    String escala;

    public Temperatura(double valorInformado, String escalaInformada) {
        this.valor = valorInformado;
        this.escala = escalaInformada;

        char letra = escalaInformada.charAt(0);

        if (letra != 'C' && letra != 'F' && letra != 'K') {
            System.out.println("Escala inválida");
        }

        if (letra == 'K' && valorInformado < 0) {
            System.out.println("Erro: Kelvin não pode ser negativo");
        }

    }

    public Temperatura toCelsius() {
        double resultado = 0;
        char letra = escala.charAt(0); // Usando char para evitar o erro do ==

        if (letra == 'K') {
            resultado = valor - 273.15;
        } else if (letra == 'F') {
            resultado = (valor - 32) / 1.8;
        } else {
            // Se já for Celsius, o valor não muda
            resultado = valor;
        }

        // ESTA LINHA É A QUE ESTÁ FALTANDO:
        return new Temperatura(resultado, "C");
    }

    public Temperatura toFahrenheit() {

        double f = valor;
        char letra = escala.charAt(0);

        if (letra == 'C') {
            f = (valor * 1.8) + 32;
        } else if (letra == 'K') {
            f = (valor - 273.15) * 1.8 + 32;
        }
        return new Temperatura(f, "F");

    }

    public Temperatura toKelvin() {
        double k = valor;
        char letra = escala.charAt(0);

        if (letra == 'C') {
            k = valor + 273.15;
        } else if (letra == 'F') {
            k = (valor - 32) / 1.8 + 273.15;
        }

        return new Temperatura(k, "K");
    }
    public void imprimeComEscala() {
        System.out.println("Temperatura: " + valor + " " + escala);
    }
}