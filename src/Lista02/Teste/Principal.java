package Lista02.Teste;

public class Principal {
    public static void main(String[] args){
        Temperatura2 TempO = new Temperatura2(0,"K");

        double Cas1 = TempO.toCelsius();
        double Cas2 = TempO.toFahrenheit();
        double Cas3 = TempO.toKelvin();

        System.out.println(Cas1);
    }
}
