
import java.util.Scanner;

public class areaquadrado {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor do lado do quadrado:");
        int lado = scanner.nextInt();

        int area;

        area = lado * lado;
        System.out.println("A área do quadrado é: " + area);
    }

}
