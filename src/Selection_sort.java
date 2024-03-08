import java.util.*;

public class Selection_sort {
    public static void main(String args[]) {
        int x[] = new int[5];
        int i, j, eleito, menor, pos;
        Scanner entrada = new Scanner(System.in);
        // carregando os numeros no vetor

        for (i = 0; i <= 4; i++) {
            System.out.println("Digite o" + (i + 1) + "°numero: ");
            x[i] = entrada.nextInt();

        }
        // ordenando de forma crescente
        // percorre da primeira posição a penultima
        // elegendo o numero para compração
        for (i = 0; i <= 3; i++) {

            eleito = x[i];
            // encontrando o menor numero a direita do eleito
            // posição do eleito = i
            // elegendo um nuemro para ser comparado
            menor = x[i + 1];
            pos = i + 1;
            // retorna o menor numero a direita e sua posição

            for (j = i + 2; j <= 4; j++) {
                if (x[j] < menor) {
                    menor = x[j];
                    pos = j;
                }
                // troca o nuemro eleito com o numero pos
                // sendo o pos o menor numero a direita do eleito
            }
            if (menor < eleito) {
                x[i] = pos;
                x[pos] = eleito;

            }
        }
        for (i = 0; i <= 4; i++) {
            System.out.println((i + 1) + "° numero: " + x[i]);
        }
    }
}
