
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
      
    System.out.println("Digite seu nome");
    String nome = scanner.next();

    System.out.println("Digite seu sobrenome");
    String sobrenome = scanner.next();

    System.out.println("Por favor, digite o número da Agência");
    String agencia = scanner.next();
        
    System.out.println("Por favor, digite o número de usuário");
    int numero = scanner.nextInt();
      
      double saldo = 237.48;
      String saldoString = String.valueOf(237.48);
      
      
         System.out.println("Olá, " + nome + " " + sobrenome + " !!! obrigado por criar uma conta em nosso banco, sua agência é: " + agencia + " conta: " + numero + " e seu saldo R$" + saldoString + " já está disponível para saque." );
      

        
    }

}
