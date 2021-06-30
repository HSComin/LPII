package LPII.Atividade1;

public class Exercicio2 {
    #include <stdio.h>

    int main(){

        int vet1[10], vet2[10], mult[10] ,cont;

        printf("Digite os 10 primeiros numeros\n \n");

        for(cont=0; cont<10; cont++){
            printf("Digite o %d numero do 1 vetor\n", cont+1);
            scanf("%d", &vet1[cont]);}

        for(cont=0; cont<10; cont++){
            printf("Digite o %d numero do 2 vetor\n", cont+1);
            scanf("%d", &vet2[cont]);}

        for(cont=0; cont<10; cont++){
            mult[cont]= (vet1[cont]*vet2[cont]);
            printf("\n A multiplicacao entre %d e %d = %d\n", vet1[cont], vet2[cont], mult[cont]);}

        return 0;
    }
}
