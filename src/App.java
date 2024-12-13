import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        // Entrada do usuario.
        int numero; 
        String nome; 
        double saldo, limite, valorsaque;

        System.out.println("Informe os dados da conta: ");
        System.out.println("Numero: ");
        numero = teclado.nextInt();
        System.out.println("Saldo inicial: ");
        saldo = teclado.nextDouble();
        System.out.println("Limite de saque: ");
        limite = teclado.nextDouble();
        System.out.println("Informe o valor para saque: ");
        valorsaque = teclado.nextDouble();
        System.out.println("Novo saldo: ");
        System.out.println("Informe o valor para depósito: ");
        System.out.println("Novo saldo: ");

    }
}
