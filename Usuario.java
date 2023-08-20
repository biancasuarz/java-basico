import java.util.Locale;
import java.util.Scanner;

    public class Usuario {

        public static void main(String[] args) {

            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);

            System.out.println("Por favor, digite o número da agência: ");
            sc.nextInt();

            System.out.println("Por favor, digite agora o número da sua conta: ");
            sc.next();

            System.out.println("Digite agora seu nome completo: ");
            sc.next();

            sc.close();
        }
    }

