package LPII.Atividade1;

public class Exercicio8 {
    #include <stdio.h>
    #define v 15

    int main(){

        int vet[v], cont, num;

        printf("Digite 15 numeros inteiros\n\n");

        for(cont=0; cont<v; cont++){
            printf("Digite o %d numero\n", cont+1);
            scanf("%d", &vet[cont]);
        }
        for (cont=0; cont<v; cont++){
            if(vet[cont]<vet[cont+1]){
                num=vet[cont+1];
                vet[cont+1]=vet[cont];
                vet[cont]=num;
                cont = -1;
            }
        }

        printf("\n\nOrdem decrescente dos numeros:\n\n");
        for (cont=0; cont<v; cont++){
            printf("\n\t%d", vet[cont]);
        }

        return 0;
    }
}
