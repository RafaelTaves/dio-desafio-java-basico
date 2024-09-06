import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        int numero = 1021;
        String agencia;
        String nomeCliente;
        float saldo = 0.0f;

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.println("Informe o número de agência.");
        agencia = scanner.nextLine();

        System.out.println("Digite seu nome.");
        nomeCliente = scanner.nextLine();

        System.out.println("Informe o saldo.");
        saldo = scanner.nextFloat();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque", nomeCliente, agencia, numero, saldo);

        scanner.close();
    }
}