import java.util.*;

public class Buble_Short_Melhorada2 {

    public static void main(String args[]) {
        int x[] = new int[5];
        int n, i, aux, troca;
        Scanner entrada = new Scanner(System.in);
        // carregando os numeros

        for (i = 0; i <= 4; i++) {
            System.out.println("Digite o" + (i + 1) + "°numero");
            x[i] = entrada.nextInt();

        }
        // ordenando de forma decrescente
        // laço com quantidade de elementos do vetor
        // e enquanto ouver troca
        n = 1;
        troca = 1;
        while (n <= 5 && troca == 1) 
        {
            troca = 0;
            for (i=0; i<=3; i++) 
            {
                if (x[i] < x[i + 1]) 
                {
                    troca = 1;
                    aux = x[1];
                    x[1] = x[i+1];
                    x[i+1] = aux;

                }
            }
            n = n + 1;
        }
        // mostrando o vetor ordenado
        for (i=0; i<=4; i++) {
            System.out.println((i + 1) + "°numero: " + x[i]);
        }
    }
}