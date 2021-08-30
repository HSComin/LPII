package LPII.Atividade10.Ex3;

public class circulo extends formabi{
    public circulo (char caracter) {
        super(caracter);
    }
    public void desenhar(){
        System.out.printf("""
                  %c%c
                 %c%c%c%c
                  %c%c
                """,caracter,caracter,caracter,caracter,caracter,caracter,caracter,caracter,caracter);
    }
}

