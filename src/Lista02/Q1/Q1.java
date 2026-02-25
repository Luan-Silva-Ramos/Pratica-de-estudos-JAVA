package Lista02.Q1;

public class Q1 {
    public static void main(String[] args) {
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
}
