
import java.util.Scanner;

public class saláriocalc {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

         double numerodecadastro, salhora, horastrab;

            System.out.println("Digite o seu número de cadastro:");
            numerodecadastro = scanner.nextDouble();
            System.out.println("Digite o valor do seu salário por hora:");
            salhora = scanner.nextDouble();
            System.out.println("Digite o número de horas trabalhadas no mês:");
            horastrab = scanner.nextDouble();

            double salariomes = (salhora * horastrab) * 21;
            System.out.println("O número de cadastro é: " + numerodecadastro);
            System.out.println("O salário mensal é: " + salariomes);

            scanner.close();
            
    }
    
}
