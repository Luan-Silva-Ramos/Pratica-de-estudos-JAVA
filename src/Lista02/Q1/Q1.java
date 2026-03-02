package Lista02.Q1;

public class Q1 {
    public static void main(String[] args) {
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

        System.out.println(overFlowByte);
        System.out.println(underFlowByte);

        System.out.println(underFlowShort);
        System.out.println(overFlowShort);

        System.out.println(overFlowInt);
        System.out.println(underFlowInt);

        // A saida, após valores somados, se tornam negativas,
        // pois não conseguem ser representadas após somadas +1
        // que quebram o seu tamanho original.

        long valor = 300L;

        byte valorbyte = (byte) valor; // Forçando o long em byte

        System.out.println(valorbyte);

        // O valor de um long é 64 bits, e um byte apenas 8 bits.
        // Nessa conversão (casting), há o descarte de todos os
        // bits superiores mantendo apenas os 8 bits menos
        // significativos

    }
}
