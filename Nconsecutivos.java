
import java.util.Scanner;

public class Nconsecutivos {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        int n1 = scanner.nextInt();

        System.out.println("Digite o segundo número:");
        int n2 = scanner.nextInt();

        int nc1 = n1 + 1;
        int nc2 = n2 + 1;

        System.out.println("O número consecutivo de " + n1 + " é: " + nc1);
        System.out.println("O número consecutivo de " + n2 + " é: " + nc2);

        scanner.close();

    }
}    
