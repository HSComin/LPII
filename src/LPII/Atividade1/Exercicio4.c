package LPII.Atividade1;

public class Exercicio4 {
    #include <stdio.h>
    #define v 20

    int main(){

        int vetor[v], cont, num;

        printf("Digite 20 numeros inteiros\n\n");

        for(cont=0; cont<v; cont++){
            printf("Digite o vetor %d\n", cont);
            scanf("%d", &vetor[cont]);
        }

        for(cont=0; cont<10; cont++){
            num=vetor[cont];
            vetor[cont]=vetor[v-cont];
            vetor[v-cont]=num;
        }

        for(cont=0; cont<v; cont++){
            printf("Novo Vetor de [%d] = %d\n",cont, vetor[cont+1]);
        }

        return 0;
    }
}
