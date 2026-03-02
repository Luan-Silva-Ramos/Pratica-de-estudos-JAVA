package Lista02.Q3;

public class Principal {
    public static void main(String[] args) {
        Temperatura registro = new Temperatura(30, "C");

        // Conversão nas três escalas e mostrando o resultado


        // Conversão para Celsius
        Temperatura casoCelsius = registro.toCelsius();
        System.out.println("Conversão da Temperatura para Cesius: ");
        casoCelsius.printComEscala();

        //Conversão para Fahrenheit
        Temperatura casoFahrenheit = registro.toFahrenheit();
        System.out.println("Conversão da Temperatura para Fahrenheit: ");
        casoFahrenheit.printComEscala();

        //COnversão para Kelvin
        Temperatura casoKelvin = registro.toKelvin();
        System.out.println("Conversão da Temperatura para Kelvin: ");
        casoKelvin.printComEscala();
    }
}
