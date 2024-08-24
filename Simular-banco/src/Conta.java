import java.util.Locale;
import java.util.Scanner;

public class Conta {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Ola Seja bem vindo ao MPbanco");

        String nome;
        String sobrenome;
        String agencia;
        String conta;
        Double saldo;

        System.out.println("Favor digite seu nome: ");
        nome = sc.nextLine();
        System.out.println("Seu sobrenome: ");
        sobrenome = sc.nextLine();
        System.out.println("Digite o numero da sua agência: ");
        agencia = sc.nextLine();
        System.out.println("Digite o numero da sua conta: ");
        conta = sc.nextLine();
        System.out.println("Digite o valor do seu saldo: ");
        saldo = sc.nextDouble();

        System.out.println("Obrigado por se cadastrar em nosso banco.");

        System.out.println("Seu nome é : " + nome + " " + sobrenome);
        System.out.println("Sua agência é : " + agencia);
        System.out.println("Seu numero de conta é : " + conta);
        System.out.println("Voce possui saldo total de : " + saldo + " " + "liberado para saque.");

        sc.close();
    }
}
