package apquartaalgoritmos;

import java.util.Scanner;

/**
 *
 * @author 182200144 Criar algoritmo, que guarde as informações de 15 alunos:
 * nome, nota1, nota2, nota3, média
 */
public class Exec1 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        
        int nAlunos, nNotas;
        
        System.out.println("Informe número de alunos: ");
        nAlunos = ler.nextInt();
        System.out.println("Informe número de notas");
        nNotas = ler.nextInt(); // --> número de colunas
        
        //Criar matriz de notas
        float[][] notas = new float[nAlunos][(nNotas + 1)]; // --> 3 colunas de notas + 1 de média
        //Criar vetor para nomes de alunos
        String[] alunos = new String[nAlunos];

        System.out.println(".: Notas de Alunos :.");
        //Este for vai percorrer as linhas da matriz
        for (int i = 0; i < nAlunos; i++) { // for sempre como int - DIGITA FOR E DA UM TAB
            System.out.println("Nome Aluno " + (i + 1) + ":");
            alunos[i] = ler.next();
            System.out.println("Notas: ");
            // Este for vai percorrer as colunas da matriz
            for (int j = 0; j < nNotas; j++) {
                System.out.println("Nota:" + (j + 1) + ": ");
                notas[i][j] = ler.nextFloat();
                notas[i][(nNotas)] += notas[i][j]; // Soma das notas
            }
            
            //Média
            notas[i][(nNotas)] = notas[i][(nNotas)] / nNotas;
        }
        //ALT + SHIFT + F - Arruma o código (Identação)
        // \n = quabra linha System
        System.out.println("\n.: Impressão :.\n");
        for (int i = 0; i < nAlunos; i++) {
            System.out.println("Aluno " + (i + 1) + ": " + alunos[i]);
            for (int j = 0; j < (nNotas); j++) { // (nNotas + 1) --> pois quer percorrer apenas as notas e não a média
                System.out.println("- Nota " + (j + 1) + ": " + notas[i][j]);
            }
            System.out.printf("- Média: " + "%.2f",notas[i][nNotas]);
            System.out.println("");
            System.out.println("---");

        }

    }

}
