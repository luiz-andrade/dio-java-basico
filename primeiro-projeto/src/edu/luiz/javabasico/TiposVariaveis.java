package edu.luiz.javabasico;

public class TiposVariaveis {

    public static void main(String[] args) {
        double salarioMinimo = 2500;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;//adicionado cast para não apresentar erro de compilação

        //Constante valor que não poderão mudar
        //Deve ser escrito em CAIXA ALTA e com "final"
        final double VALOR_DE_PI = 3.14;
    }
}
