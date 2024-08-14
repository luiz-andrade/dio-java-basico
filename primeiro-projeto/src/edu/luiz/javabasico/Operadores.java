package edu.luiz.javabasico;

import java.util.Date;

public class Operadores {
    public static void main(String[] args) {
        String nome = "Luiz Melo";
        boolean doadorSange = false;
        Date dataNascimento = new Date();

        int module = 18 % 3;

        //operadores unários
        int numero = 5;
        System.err.println(--numero);

        // negação de variaveis
        // numero --;

        //inverter variavel boolean
        boolean variavelBool = true;

        //operadores ternarios
        String a = "sim";
        String b = new String("sim");
        String resultadoB = b == a ? "verdadeiro" : "falso";

        System.out.println(resultadoB);
        //para validar texto é recomendado utilizar o .equals
        System.out.println(a.equals(b));
    }
}
