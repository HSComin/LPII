package LPII.Atividade10.Ex3;

public class formabi extends forma {
    double dim1;
    double dim2;

    public char caracter;

    public formabi(char caracter) {
    }

    public double getDim1() {
        return dim1;
    }

    public void setDim1(double dim1) {
        this.dim1 = dim1;
    }

    public double getDim2() {
        return dim2;
    }

    public void setDim2(double dim2) {
        this.dim2 = dim2;
    }

    public void imprimir() {
        System.out.println("Classe =  " + getClass());
        System.out.println("Area =  " + getArea());
        System.out.println("Volume =  " +getVolume());
    }
}
