package LPII.Atividade1;

public class Exercicio7 {
    #include <stdio.h>
    #define v 10

    int main(){

        int vet[v], cont, num;

        printf("Voce vai digitar 10 numeros inteiros\n\n");

        for(cont=0; cont<v; cont++){
            printf("Digite o %d numero\n", cont+1);
            scanf("%d", &vet[cont]);
        }
        printf("\nDigite um numero para conferencia\n");
        scanf("%d", &num);

        printf("\n\n");
        for(cont=0; cont<v; cont++)
            if(num==vet[cont])
                printf("O valor %d esta no vetor %d\n",vet[cont], cont+1);
            else if(num!=vet[cont])
                printf("O valor %d nao esta no vetor\n", vet[cont]);

        return 0;
    }

}
