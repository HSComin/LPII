package LPII.Atividade1;

public class Exercicio6 {
    #include <stdio.h>
    #define v 10

    int main(){

        int vetorx[v], vetory[v], pu[20], pd[v], ps[v], pp[v], pi[v], cont, x, y;

        for(cont=0; cont<v; cont++){
            printf("Digite o %d numero do vetor X\n", cont+1);
            scanf("%d", &vetorx[cont]);
        }
        for(cont=0; cont<v; cont++){
            printf("Digite o %d numero do vetor Y\n", cont+1);
            scanf("%d", &vetory[cont]);
        }
        for(cont=0; cont<v; cont++) {
            pu[cont*2] = vetorx[cont];
        }
        for(cont=0; cont<v; cont++) {
            pu[cont*2+1] = vetory[cont];
        }
        printf("\n\na)Uniao de X e Y:\n");
        for(cont=0; cont<20; cont++) {
            printf("%d ", pu[cont]);
        }
        printf("\n\n");
        for(cont=0; cont<v; cont++){
            pd[cont]=vetorx[cont]-vetory[cont];
            printf("\tb) X - Y = %d\n", pd[cont]);
        }
        printf("\n\n");
        for(cont=0; cont<v; cont++){
            ps[cont]=vetorx[cont]+vetory[cont];
            printf("c) X + Y = %d\n", ps[cont]);
        }
        printf("\n\n");
        for(cont=0; cont<v; cont++){
            pp[cont]=vetorx[cont]*vetory[cont];
            printf("\td) X * Y = %d\n", pp[cont]);
        }

        printf("\n\n");
        printf("\ne)Interseccao de X e Y:\n");
        for(x=0; x<v; x++){
            for(y=0; y<v; y++){
                if(vetorx[x]==vetory[y]){
                    printf("%d ", vetorx[x] );
                }
            }
        }
        printf("\n\n");

        return 0;
    }
}
