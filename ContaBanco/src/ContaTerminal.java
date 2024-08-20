import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o número da conta");
        int numero = scanner.nextInt();

        System.out.println("Digite a agência");
        String agencia = scanner.next();

        System.out.println("Digite o nome do cliente");
        String nomeCliente = scanner.next();
        
        System.out.println("Digite o saldo");
        double saldo = scanner.nextDouble();

        System.out.println("Olá "+ nomeCliente + ", obrigado por criar uma conta com nosso banco, sua agência é " 
            + agencia + ", conta número " + numero + " e seu saldo R$ "+ saldo +" já está disponível para saque"
        );
    }
}
