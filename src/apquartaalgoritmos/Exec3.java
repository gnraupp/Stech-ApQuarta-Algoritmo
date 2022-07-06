
package apquartaalgoritmos;

import java.util.Scanner;
/**
 * @author 182200144
 * Escreva um algoritmo que solicite ao usuário a entrada de 5 nomes, e que exiba a lista desses nomes na tela.
 * Após exibir essa lista, o programa deve mostrar também os nomes na ordem inversa em que o usuário os digitou, um por linha.
 */
public class Exec3 {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        String nomes[] = new String[5]; // 1. Declarar o vetor
        int count = 0;// Variavél contador
        
        System.out.println(".: Informe 5 nomes :.");
        
        do {
            System.out.println("Informe o " + (count + 1) + "° nome: "); 
            nomes[count] = ler.next();
            count++;
        }while (count < 5);
        System.out.println("\n.: Lista de Nomes :.");
        for (int i = 0; i < 5; i++) {
        System.out.println((i + 1) + "° nome: " + nomes[i]);
    }
        System.out.println("\n.: Lista de Nomes em ordem inversa :.");
        for (int i = 4; i >= 0; i--) {
        System.out.println((i + 1) + "° nome: " + nomes[i]);
        }
        
    }
    
    
}
