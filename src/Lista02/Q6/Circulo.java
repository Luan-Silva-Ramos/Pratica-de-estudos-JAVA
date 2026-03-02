package Lista02.Q6;

public class Circulo {
    public double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double calcularArea() {
        double area = Math.PI * raio * raio;
        //this.area = area;
        return area;
    }

    public double calcularCircunferencia() {
        double circ = 2 * Math.PI * raio;
        return circ;
    }

    public boolean contemOutro(Circulo outro) {
        if (this.raio > outro.raio) {
            return true;
        } else {
            return false;
        }
    }
    public Circulo maior(Circulo outro) {
        if (this.raio > outro.raio) {
            return this;
        } else {
            return outro;
        }
    }

    public void exibirDados() {
        String dados = String.format("Raio: %.2f  | Área: %.2f | Circunferência: %.2f" ,
                this.raio, this.calcularArea(), this.calcularCircunferencia());
        System.out.println(dados);
    }

}
