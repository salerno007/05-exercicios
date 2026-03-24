import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
            double valoraula, porcentageminss;
            int horastrabalhadas;
            double salariobruto, salarioliquido;
            double valordodesconto;

            //Entrada dos dados
        System.out.print("Valor das aulas-->: R$ ");
        valoraula = sc.nextDouble();
        System.out.print("Total de horas trabalhadas --> ");
            horastrabalhadas = sc.nextInt();
        System.out.print("Porcentagem de desconto do INSS --> ");
        porcentageminss = sc.nextDouble();

        // Processamento de dados
        salariobruto = horastrabalhadas * valoraula;

        valordodesconto = salariobruto * porcentageminss/100;

        salarioliquido = salariobruto - valordodesconto;

        //Saida de dados

        System.out.println("Salário liquido: R$ " + String.format("%.2f", salarioliquido ));

    }
}
