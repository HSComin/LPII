package LPII.Atividade10.Ex3;

public class triangulo extends formabi{
    public triangulo(char caracter) {
        super(caracter);
    }
    public void desenhar(){
        System.out.printf("""
                  %c
                 %c%c%c
                %c%c%c%c%c
                """,caracter,caracter,caracter,caracter,caracter,caracter,caracter,caracter,caracter);
    }
}
