import Lista02.Q3.Temperatura;
import Lista02.Q4.Estudante;
import Lista02.Q5.ContaCorrente;
import Lista02.Q6.Circulo;
import Lista02.Q7.Relogio;

public class ResolucaoLista02 {
    public static void main(String[] args) {

         //Questao01();
         Questao03();
         //Questao04();
         //Questao05();
         //Questao06();
         //Questao07();
    }
    // Solução das Questões

        public static void Questao01() {
            System.out.println("Rodando Questao01");

                byte maxByte = Byte.MAX_VALUE;
                byte minByte = Byte.MIN_VALUE;

                short maxShort = Short.MAX_VALUE;
                short minShort = Short.MIN_VALUE;

                int maxInt = Integer.MAX_VALUE;
                int minInt = Integer.MIN_VALUE;

                // Pegando os valores e somando mais um (+1)

                byte overFlowByte = (byte) (maxByte + 1);
                byte underFlowByte = (byte) (minByte - 1);

                short overFlowShort = (short) (maxShort + 1);
                short underFlowShort = (short) (minShort - 1);

                int overFlowInt = (int) (maxInt + 1);
                int underFlowInt = (int) (minInt - 1);

                // Mostrando a saida

                System.out.println(overFlowByte);
                System.out.println(underFlowShort);
                System.out.println(overFlowInt);

                /*  A saida, após valores somados, se tornam negativas,
                 pois não conseguem ser representadas após somadas +1
                 que quebram o seu tamanho original.

                 */

                long valor = 300L;

                byte valorbyte = (byte) valor; // Forçando o long em byte

                System.out.println(valorbyte);

                /* O valor de um long é 64 bits, e um byte apenas 8 bits.
                     Nessa conversão (casting), há o descarte de todos os
                 bits superiores mantendo apenas os 8 bits menos
                 significativos

                 */
        }

        public static void Questao02() {
        }

        public static void Questao03() {
            System.out.println("Rodando Questao03");
                Temperatura registro = new Temperatura(30, "F");

                // Conversão nas três escalas e mostrando o resultado

                // Conversão para Celsius

                Temperatura casoCelsius = registro.toCelsius(); // A criação desse método consta em pegar o valor
            // presente dentro do registro na classe Temperatura e comparando qual letra correspondente,
            // resultando na conversão de determinada temperatura para Celsius.

                System.out.println("Conversão da Temperatura para Celsius: ");
                casoCelsius.printComEscala(); // Aqui o "casoCelsius" criada acima para se ter uma chamada,
            // junto do método ".printComEscala()", que representa o valor e a escala
            //  informada no "Temperatura registro".

                //Conversão para Fahrenheit

                Temperatura casoFahrenheit = registro.toFahrenheit();// A criação desse método consta em pegar o valor
            // presente dentro do registro na classe Temperatura e comparando qual letra correspondente,
            // resultando na conversão de determinada temperatura para Fahrenheit.

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

                /*Testando método .getMedia()

                No qual, pega as notas dentro do construtor e as divide pelo valor do tamanho do array

                 */

                System.out.println("Média do aluno(a): " + dados.getMedia());

                /*Testando método .setNotas()

                 Esse método ele reseta todas as notas, assim podendo adiconar novas
             notas sem interferir no uso de outros métodos, facilitando o uso.

                 */

                dados.setNotas(10.0, 20.0, 60.0);

                /*Testando método .getNota()

                Usando o valor dentro do indices criado na classe estudante fazendo comparação com a quantidade
             de notas e se seu valor é igual o maior que zero.
             Servindo para rastrear determinada nota

                 */

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

                // Criação do círculo

                Circulo c1 = new Circulo(5.0);

            // exibindo os Dados do circulo

                c1.exibirDados();

            // dobrando o valor do raio

                c1.raio = c1.raio * 2;

                c1.exibirDados();

            // Criação do segundo círculo

                Circulo c2 = new Circulo(0.0);

                c2.exibirDados();

            /* Usado o método .contemOutro()
            retorna em Booleano se há a possibilidade de um círculo está presente em outro.
             */

            System.out.println(c1.contemOutro(c2));
            System.out.println(c2.contemOutro(c1));

            Circulo maior = c2.maior(c1); /* Usando o método ".maior()" para que retorne em Booleano o se a
            a comparação está correta, determinando se é true ou false
            */

            maior.exibirDados(); // Aqui, esse método vai exibir os dados do círculo maior.

                /*if (c1.contemOutro(c2)) {
                    System.out.println("Circulo(a): " + c1.raio + " contêm o de raio  " + c2.raio );
                } else {
                    System.out.println("Circulo(a): " + c2.raio + " contem o de raio " + c1.raio);
                }
                c1.maior(c2);

                 */


        }
        public static void Questao07() {
            System.out.println("Rodando Questao07");
                Relogio clockA = new Relogio(23, 59, 57);

                /* Aqui é passo e a mudança a cada segundo, resultando no horário modificado após
            a inserção dos segundos.
            */

                for (int i = 0; i < 5; i++) {
                    clockA.tick();

                    System.out.println("Horário atualizado: " + clockA.exibirHorario());
                }

                // Criação do segundo relógio para fazer a comparação

                Relogio clockB = new Relogio(14, 20, 30);

                clockA.isMaiorQue(clockB);

        }
}
