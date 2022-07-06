package apquartaalgoritmos;

import java.util.Scanner;

/**
 * @author 182200144 
 * Escreva um algoritmo que solicite ao usuário a entrada de 5 números, e que exiba o somatório desses números na tela.
 * Após exibir a soma, o programa deve mostrar também os números que o usuário digitou, um por linha.
 */

public class Exec2 {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        int valores[] = new int[5]; // 1. Declarar o vetor
        int count = 0, soma = 0;// variavél contador e soma
        
        System.out.println(".: Entrar com 5 números Inteiros :.");
        
        do {
            System.out.println("Informe valor " + (count + 1) + ": "); // Informe o valor 1 (0 + 1 = 1)
            valores[count] = ler.nextInt();
            soma += valores [count];
            count += 1; // Auto incrementar uma variável
        }while (count < 5);
        System.out.println("A soma dos valores é de: " + soma);
        System.out.println("Valores informados:");
        for (int i = 0; i < 5; i++) {
        System.out.println("valor " + (i + 1) + ": " + valores[i]);
    }
        
    }
    
}
