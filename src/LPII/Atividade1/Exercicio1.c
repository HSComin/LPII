package LPII.Atividade1;

public class Exercicio1 {
    #include <stdio.h>
    #define v 20

    int main(){

        int cont, i=0, vetor[v];

        printf("Digite 20 numeros inteiros\n \n");

        for(cont=0; cont<20; cont++){
            printf("Digite o %d numero\n", cont+1);
            scanf("%d", &vetor[cont]);
        }

        printf("\n\tNUMEROS:\n");

        for(cont=0; cont<20; cont++){
            printf("\n\t%d", vetor[cont]);
        }

        for(cont=0; cont<20; cont++){
            if(vetor[cont]%2==0){
                i++;
            }
        }
        printf("\n \n Pares = %d\n", i);

        return 0;
    }
}
