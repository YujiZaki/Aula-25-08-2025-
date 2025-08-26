
package aula_1;

import java.util.Scanner;

/*
1)obter nome do aluno
2)obter as 3 notas
3)calcular média
4)imprimir o nome do aluno e média
*/

public class Exemplo3 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        String nomeAluno;
        float nota1, nota2, nota3, média;
        
        System.out.println(" == > Bem vindo a minha calculadora simples < == ");
        System.out.println("--------------------------------------------------");
        
        System.out.println("Digite seu nome: ");
        nomeAluno = input.next();
        
        System.out.println("Digite a Nota 1: ");
        nota1 = input.nextFloat();
        
        System.out.println("Digite a Nota 2: ");
        nota2 = input.nextFloat();
        
        System.out.println("Digite a Nota 3: ");
        nota3 = input.nextFloat();
        
         System.out.println("Sua média: ");
        
        //processamento
        média = (nota1 + nota2 + nota3) / 3;
        System.out.println("Nome: "+ nomeAluno);
        System.out.println("Média: "+ média);
    }   
}
