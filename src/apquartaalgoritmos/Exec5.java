
package apquartaalgoritmos;

import java.util.Scanner;

/**
 * @author 182200144
 * Crie um programa que armazene 10 números digitados pelo usuário em dois vetores: um somente para números pares, e outro somente para números ímpares.
 * Após, exiba os valores dos dois vetores na tela, em sequência.
 * Obs.: As posições que não receberem valores exibirão o número zero. Não se preocupe com isso por enquanto.
 */
public class Exec5 {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        int valores[][] = new int[10][2];
        System.out.println(".: Informe os 10 números inteiros :.");
        for (int i = 0; i < 10; i++) {
            System.out.println("Entre com o " + (i + 1) + "° número: ");
            int valor = ler.nextInt();
            if(valor % 2 == 0) { // se o que sobrar de uma divisão por 2 for zero o número é par
            //par
            valores[i][0] = valor; // par
            valores[i][1] = 0; // impar
            } else {
            //impar
            valores[i][0] = 0; // par
            valores[i][1] = valor; // impar
            }       
        }
        System.out.println("\n.: Lista de valores :.");
        for (int i = 0; i < 10; i++) {
            System.out.printf("|%5d%3s%7d |\n",valores[i][0] , " | " , valores[i][1]); 
        }
        
        }
        

    }
    

