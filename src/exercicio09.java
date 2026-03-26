import java.util.Scanner;

public class exercicio09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor;
        int unidade, dezena, centena;
        int valorinvertido;

        System.out.print("Informe o valor com 3 digitos (100 - 999) --> ");
        valor = sc.nextInt();

        unidade = valor % 10;
        dezena =  valor / 10 % 10;
        centena = valor / 100;

        valorinvertido = unidade + 100 + dezena + 10 + centena;

        System.out.println(unidade + "" + dezena + centena );
        System.out.println(valorinvertido);
    }

}
