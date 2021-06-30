package LPII.Atividade1;

public class Exercicio3 {
    #include <stdio.h>
#define v 11

    int main(){

        int vetor[v], cont, menor, pos;

        printf("Digite 10 numeros inteiros\n\n");

        for(cont=1; cont<v; cont++){
            printf("Digite o %d numero\n", cont);
            scanf("%d", &vetor[cont]);}

        menor = vetor[0];
        printf("\n\tNUMERO:\n");
        for(cont=1; cont<v; cont++){
            printf("\t%d\n", vetor[cont]);
            if(vetor[cont]<menor){
                menor = vetor[cont];
                pos = cont;}
        }
        printf("\n Menor elemento = %d\n", menor);
        printf(" Posicao do elemento = %d\n", pos);

        return 0;
    }
}
