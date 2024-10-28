import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        String nome = " ";

        int conta = 0;

        String agencia = " ";

        double saldo = 0.0;

        System.out.println("Ola! insira o seu nome aqui: ");
        nome = scanner.nextLine();

        System.out.println("Agora insira o número da sua conta: ");
        conta = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Por favor, digite o número de sua agência: ");
        agencia = scanner.nextLine();

        System.out.println("Por ultimo, digite o seu saldo bancário: ");
        saldo = scanner.nextDouble();

        System.out.print("Olá "+ nome + ", obrigado por criar sua conta em nosso banco, sua agência é "+ agencia + ", conta "+ conta + 
                            " e seu saldo " + saldo + " está disponível para saque.");

        scanner.close();
        
    }
}
