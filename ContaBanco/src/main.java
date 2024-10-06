import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, digite o seu nome:");
        String nome = sc.next();
        sc.nextLine();
        System.out.println("Por favor, digite o número da Agência:");
        String agencia = sc.next();
        sc.nextLine();
        System.out.println("Por favor, digite o número:");
        int num = sc.nextInt();
        System.out.println("Por favor, digite o seu saldo:");
        double saldo = sc.nextDouble();

        ContaTerminal CT = new ContaTerminal(num, agencia, nome, saldo);

        System.out.println(CT);

        sc.close();
    }
}
