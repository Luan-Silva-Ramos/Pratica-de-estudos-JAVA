package Lista02.Q5;

public class ContaCorrente {
    String titular;
    double saldo;
    int numeroConta;

    public ContaCorrente(String titular, double saldo, int numeroConta) {
        this.titular = titular;
        this.saldo = saldo;
        this.numeroConta = numeroConta;
    }


    public void depositar(double valor) {
        if (valor >= 0) {
            this.saldo += valor;
        } else {
            System.out.println("Erro ao depositar");
        }
    }
    public void sacar(double valor) {
        if (valor >= 0 && this.saldo >= valor) {
            this.saldo -= valor;
        } else {
            System.out.println("Erro ao sacar");
        }
    }
    public void transferir(ContaCorrente destino, double valor) {
            this.sacar(valor);
            destino.depositar(valor);

            System.out.println("Transferencia de R$ " + valor + " realizada com sucesso!");

    }
    public double getSaldo() {
        System.out.println("Titular: " + this.titular);
        System.out.println("Número da conta: " + this.numeroConta);
        System.out.println("Saldo Atual: R$ " + this.saldo);
        return this.saldo;
    }
}
