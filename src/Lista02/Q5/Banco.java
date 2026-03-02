package Lista02.Q5;

public class Banco {
    public void main(String[] args) {
        ContaCorrente conta1 = new ContaCorrente("Harry", 1500.50, 123456);
        ContaCorrente conta2 = new ContaCorrente("John", 499.50, 4567789);

        System.out.println("--- Situação da conta ---");

        conta1.getSaldo();

        System.out.println("-----");

        conta2.getSaldo();

        System.out.println("--- Depositar ---");

        conta1.depositar(499.50);
        conta2.depositar(499.50);

        System.out.println("--- Situação da conta atualizada---");

        conta1.getSaldo();
        System.out.println("-----");
        conta2.getSaldo();

        System.out.println("--- Teste de saque ---");
        conta1.sacar(500);
        conta2.sacar(500);

        System.out.println("--- Conta atualizada após saques---");

        conta1.getSaldo();
        System.out.println("-----");
        conta2.getSaldo();

        System.out.println("--- Teste de Transferencia ---");

        conta1.transferir(conta2,360);
        conta2.transferir(conta1,600);

        System.out.println("--- Conta atualizada após Transferencias---");

        conta1.getSaldo();
        System.out.println("-----");
        conta2.getSaldo();

        System.out.println("--- Teste de saque maior de Saldo ---");

        conta1.sacar(3000);
        System.out.println("-----");
        conta2.sacar(3000);

        System.out.println("--- FIM ---");
    }
}
