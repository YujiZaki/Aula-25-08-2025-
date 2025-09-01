public class potenciaesoma {
    public static void main(String[] args) {
        int base1, base2, expoente1, expoente2;
        double resultado;
        base1 = 2;
        expoente1 = 3;
        base2 = 5;
        expoente2 = 6;
        resultado = Math.pow(base1, expoente1) + Math.pow(base2, expoente2);
        System.out.println("O resultado da soma das potências é: " + resultado);
    }
}
