
import java.util.Scanner;

public class triaretcomraiz {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        int A,B;
        double H;

        System.out.println("Digite o valor do cateto A:");
        A = scanner.nextInt();
        System.out.println("Digite o valor do cateto B:");
        B = scanner.nextInt();

        H = Math.sqrt((A * A) + (B * B));
        System.out.println("O valor da hipotenusa é: "+H);

        scanner.close();

    }
    
}
