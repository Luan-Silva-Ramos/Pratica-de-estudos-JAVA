import Lista02.Q3.Temperatura;
import Lista02.Q4.Estudante;
import Lista02.Q5.ContaCorrente;
import Lista02.Q6.Circulo;
import Lista02.Q7.Relogio;

public class ResolucaoLista02 {
    public static void main(String[] args) {

         //Questao01();
         //Questao03();
         //Questao04();
         //Questao05();
         //Questao06();
         Questao07();
    }
    // Solução das Questões

        public static void Questao01() {
            System.out.println("Rodando Questao01");

                byte max = Byte.MAX_VALUE;
                short min = Short.MIN_VALUE;
                int max2 = Integer.MAX_VALUE;

                // Pegando os valores e somando mais um (+1)

                byte sm = (byte) (max + 1);
                short sm2 = (short) (min + 1);
                int sm3 = (int) (max2 + 1);

                // Mostrando a saida

                System.out.println(sm);
                System.out.println(sm2);
                System.out.println(sm3);

                // A saida, após valores somados, se tornam negativas,
                // pois não conseguem ser representadas após somadas +1
                // que quebram seu tamanho original.

                long valor = 300L;

                byte valorbyte = (byte) valor; // Forçando o long em byte

                System.out.println(valorbyte);

                // O valor de um long é 64 bits, e um byte apenas 8 bits.
                // Nessa conversão (casting), há o descarte de todos os
                // bits superiores mantendo apenas os 8 bits menos
                // significativos

        }

        public static void Questao02() {
        }

        public static void Questao03() {
            System.out.println("Rodando Questao03");
                Temperatura registro = new Temperatura(30, "F");

                // Conversão nas três escalas e mostrando o resultado

                // Conversão para Celsius

                Temperatura casoCelsius = registro.toCelsius();
                System.out.println("Conversão da Temperatura para Cesius: ");
                casoCelsius.printComEscala();

                //Conversão para Fahrenheit

                Temperatura casoFahrenheit = registro.toFahrenheit();
                System.out.println("Conversão da Temperatura para Fahrenheit: ");
                casoFahrenheit.printComEscala();

                //Conversão para Kelvin

                Temperatura casoKelvin = registro.toKelvin();
                System.out.println("Conversão da Temperatura para Kelvin: ");
                casoKelvin.printComEscala();

        }

        public static void Questao04() {
            System.out.println("Rodando Questao04");
                Estudante dados = new Estudante ("John",5555, 70.0,40.0,50.6,80.4);

                //Testando método .getMedia()

                System.out.println("Média do aluno(a): " + dados.getMedia());

                //Testando método .setNotas()

                dados.setNotas(10.0, 20.0, 60.0);

                //Testando método .getNota()

                System.out.println("Nota selecionada: " + dados.getNota(1));

                //Testando método .exDados
                //Criei esse método para exibir todos os dados do construtor, reunindo todos em uma
                // unica chamada

                System.out.println("Dados do aluno(a): " + dados.exDados());

                //Testando o método .getSituacao()

                System.out.println("Situação do aluno(a): " + dados.getSituacao());

                //Testando método .exBoletim()
                // Criei esse método para reunir todas as informações processadas onde foi
                // usado metodos de  obter media, notas e situação, juntado todos esse dados
                // em um unico método.

                System.out.println("Boletim do aluno(a): " + dados.exBoletim());


        }

        public static void Questao05() {
            System.out.println("Rodando Questao05");

                // Criação das duas contas

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
        public static void Questao06() {
            System.out.println("Rodando Questao06");

                // Criação do circulo

                Circulo c1 = new Circulo(5.0);

            // exibindo os Dados do circulo

                c1.exibirDados();

            // dobrando o valor do circulo

                c1.raio = c1.raio * 2;

                c1.exibirDados();
            // Criação do segundo circulo

                Circulo c2 = new Circulo(3.0);

                c2.exibirDados();

            // Usado o método .contemOutro()

                if (c2.contemOutro(c1)) {
                    System.out.println("Circulo(a): " + c1.raio + "contêm o de raio  " + c2.raio );
                } else {
                    System.out.println("Circulo(a): " + c2.raio + " contem o de raio " + c1.raio);
                }

        }
        public static void Questao07() {
            System.out.println("Rodando Questao07");
                Relogio clockA = new Relogio(23, 59, 57);

                for (int i = 0; i < 5; i++) {
                    clockA.tick();

                    System.out.println("Horário atualzado: " + clockA.exibirHorario());
                }
                Relogio clockB = new Relogio(00, 00, 30);

                clockA.isMaiorQue(clockB);


        }
}
