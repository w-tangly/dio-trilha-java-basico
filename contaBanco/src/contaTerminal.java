import java.util.Scanner;
public class contaTerminal {
    public static void main(String[] args) throws Exception {
        var con=System.console();
        System.out.println("Conta terminal banco\nInsira o seu nome:");
        Scanner sc=new Scanner(con .reader());
        String nome=sc.nextLine();
        System.out.println("Insira a sua agência bancária:");
        String agencia=sc.nextLine();
        System.out.println("Insira o número da sua conta bancária:");
        int n=sc.nextInt();
        System.out.println("Insira o seu saldo:");
        Double saldo=sc.nextDouble();
        System.out.println("Olá "+nome+", obrigado por criar uma conta em nosso banco, sua agencia é "+agencia+", conta "+n+" e seu saldo "+saldo+" já está disponível para saque");
        sc.close();
    }
}