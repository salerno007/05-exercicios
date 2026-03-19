import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
    double salarioMinimo;
            int quilowatt;
            double Valorkwatt, conta;

        System.out.print("Informe o valor do salário minimo R$ ");
        salarioMinimo = sc.nextDouble();
        System.out.print("informe a quantidade de quilowatt ");
        quilowatt = sc.nextInt();

        Valorkwatt = salarioMinimo/ 7 / 100;

        conta = quilowatt * Valorkwatt;

        System.out.print("Valor da conta R$" + conta);

        System.out.println("Valor do quilowatt R$ "+ Valorkwatt);

        System.out.println("Valor da conta com 10% de desconto " + conta * 0.90);

    }
}
