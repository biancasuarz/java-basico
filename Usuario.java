import java.util.Locale;
import java.util.Scanner;

    public class Usuario {

        public static void main(String[] args) {

            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);

            Programa programa = new Programa();

            programa.agencia();
            programa.agencia = sc.nextInt();

            programa.conta();
            programa.conta = sc.next();

            System.out.println("Digite agora seu nome completo: ");
            programa.nomeDoCliente = sc.next();



            System.out.println("Olá "
                                + programa.nomeDoCliente + ",obrigada por criar uma conta em nosso banco. Sua agencia é "
                                + programa.agencia + ", sua conta é "
                                + programa.conta + " e seu saldo é de "
                                + programa.saldo );

            sc.close();
        }
    }

