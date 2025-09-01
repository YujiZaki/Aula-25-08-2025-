
import java.util.Scanner;

public class vendedor {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int salariofixo,totalvendas;

            System.out.println("Digite o salário fixo do vendedor:");
            salariofixo = scanner.nextInt();
            System.out.println("Digite o total de vendas do vendedor:");
            totalvendas = scanner.nextInt();

        double comissao, salariototal;

        comissao = totalvendas * 0.15;
        salariototal = salariofixo + comissao;
        System.out.println("O salário total do vendedor é: " + salariototal);
    }

}
