
import java.util.Scanner;

public class triangulocalc {
    public static void main(String[] args) {
        
        double A, B, C;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor do lado A:");
        A = scanner.nextDouble();

        System.out.println("Digite o valor do lado B:");
        B = scanner.nextDouble();

        System.out.println("Digite o valor do lado C:");
        C = scanner.nextDouble();

        double Pi = 3.14159;

        //a triangulo retangulo

        double areatriangulo;
        areatriangulo = (A * B) / 2;

        System.out.println("A área do triângulo retângulo é: " + areatriangulo);

        //b circulo

        double areacirculo;
        areacirculo = Pi * (C * C);

        System.out.println("A área do círculo é: " + areacirculo);

        //c areatrapezio

        double areatrapezio;
        areatrapezio = ((A + B) * C) / 2;

        System.out.println("A área do trapézio é: " + areatrapezio);

        //d areaquadrado

        double areaquadrado;
        areaquadrado = B * B;

        System.out.println("A área do quadrado é: " + areaquadrado);

        //e  arearetangulo

        double arearetangulo;
        arearetangulo = A * B;

        System.out.println("A área do retângulo é: " + arearetangulo);

        //f  perimetroretangulo

        double perimetroretangulo;
        perimetroretangulo = 2 * (A + B);

        System.out.println("O perímetro do retângulo é: " + perimetroretangulo);

    }
}
