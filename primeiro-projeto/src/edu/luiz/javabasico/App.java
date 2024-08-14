package edu.luiz.javabasico;

public class App {
    public static void main(String[] args) throws Exception {
        String primeiroNome = "Luiz";
        String segundoNome = "Melo";

        String nomeString = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeString);

    }

    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);

    }
}
