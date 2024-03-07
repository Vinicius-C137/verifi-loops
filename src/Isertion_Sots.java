import java.util.*;

public class Isertion_Sots {
    public static void main(String args[]) {
        int x[] = new int[5];
        int i, j, eleito;

        Scanner entrada = new Scanner(System.in);

        // carregando os números no vetor
        for (i = 0; i <= 4; i++) {
            System.out.println("Digite o " + (i + 1) + "numero: ");
            x[i] = entrada.nextInt();
        }
        // ordenando de forma crescente
        // laço com a quantidade de elementos do vetor -i
        for (i = 1; i <= 4; i++) {
            eleito = x[i];
            j = i - 1;

            while (j >= 0 && x[j] > eleito) {
    
                x[j + 1] = x[j];
                j = j - 1;
            }
            x[j+1] = eleito;
        }
        //mostrando o vetor ordenado
        for(i=0;i<=4;i++){
            System.out.println((i+1)+"°numero: "+ x[i]);
        }
    }

}
