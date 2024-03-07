import java.util.*;
public class Buble_Short_Melhorada {


    public static void main(String args[]){
        int x[] = new int [5];
        int j, i, aux;
        Scanner entrada = new Scanner(System.in);
        //carregando os numeros

        for(i=0;i<=4;i++){
            System.out.println("Digite o" + (i+1) + "°numero");
            x[i] = entrada.nextInt();


        }
        //ordenando de forma crescente
       //laço com quantidade de elementos do vetor 
       for(j=1;j<=5;j++){
           //laço que percorre da utima  a 
           //posição j do vetor linha.
        for (i=4;i>=j;i--){
            if (x[i] > x[i-1]){
                aux = x[i];
                x[i] = x[i-1];
                x[i-1] = aux;
            }
        }
       }
       //mostrando o vetor ordenado
       for (i=0;i<=4;i++){
        System.out.println((i+1)+"°numero:" + x[i]);
       }
    }  
}



