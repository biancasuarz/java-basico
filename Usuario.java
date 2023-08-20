import java.util.Locale;
import java.util.Scanner;

    public class Usuario {

        public static void main(String[] args) {

            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);

            int agencia;
            String conta;
            String nomeDoCliente;
            double saldo = 237.48;

            System.out.println("Por favor, digite o número da agência: ");
            agencia = sc.nextInt();

            System.out.println("Por favor, digite agora o número da sua conta: ");
            conta = sc.next();

            System.out.println("Digite agora seu nome completo: ");
            nomeDoCliente = sc.next();

            System.out.println("Olá "
                                + nomeDoCliente + ",obrigada por criar uma conta em nosso banco. Sua agencia é "
                                + agencia + ", sua conta é "
                                + conta + " e seu saldo é de "
                                + saldo );

            sc.close();
        }
    }

