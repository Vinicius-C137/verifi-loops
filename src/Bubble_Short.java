import java.util.*;

public class Bubble_Short {
    public static void main(String args[]){
        int x[] = new int [5];
        int n, i, aux;
        Scanner entrada = new Scanner(System.in);
        //carregando os numeros

        for(i=0;i<=4;i++){
            System.out.println("Digite o" + (i+1) + "°numero");
            x[i] = entrada.nextInt();


        }
        //ordenando de forma crescente
       //laço com quantidade de elementos do vetor 
       for(n=1;n<=5;n++){
           //laço que percorre da primeira a 
           //penultima linha.
        for (i=0;i<=3;i++){
            if (x[i] > x[i+1]){
                aux = x[i];
                x[i] = x[i+1];
                x[i+1] = aux;
            }
        }
       }
       //mostrando o vetor ordenado
       for (i=0;i<=4;i++){
        System.out.println((i+1)+"°numero:" + x[i]);
       }
    }  
}

