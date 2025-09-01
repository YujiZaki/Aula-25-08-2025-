
import java.util.Scanner;

public class mediaaritimetica {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    int n1,n2,n3,n4,media;

    System.out.println("Digite o primeiro número:");
    n1 = scanner.nextInt();
    System.out.println("Digite o segundo número:");
    n2 = scanner.nextInt();
    System.out.println("Digite o terceiro número:");
    n3 = scanner.nextInt();
    System.out.println("Digite o quarto número:");
    n4 = scanner.nextInt();

    media = (n1 + n2 + n3 + n4) / 4;

        System.out.println("A média aritmética é: " + media);
    }
    
}
