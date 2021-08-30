package LPII.Atividade10.Ex3;

public class quadrado extends formabi{
    public quadrado (char caracter) {
        super(caracter);
    }
    public void desenhar(){
        System.out.printf("""
                %c%c%c%c
                %c%c%c%c
                %c%c%c%c""",caracter,caracter,caracter,caracter,caracter,caracter,caracter,caracter,caracter,caracter,caracter,caracter);
    }
}
