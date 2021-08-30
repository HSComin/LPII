package LPII.Atividade10.Ex3;

public class execformas {
    public static void main(String[] args) {

        forma bidimensional = new forma();
        forma tridimensional = new forma();

        formatri cubo = new formatri();
        formatri esfera = new formatri();
        formatri tetraedro = new formatri();

        quadrado q = new quadrado('X');
        q.setArea(25);
        q.setVolume(125);
        cubo.imprimir();
        q.desenhar();
        System.out.println("\n");

        circulo c = new circulo('X');
        c.setArea(10);
        c.setVolume(1333);
        esfera.imprimir();
        c.desenhar();
        System.out.println("\n");

        triangulo t = new triangulo('X');
        t.setArea(25);
        t.setVolume(125);
        tetraedro.imprimir();
        t.desenhar();
        System.out.println("\n");
    }
}

//Volume e Área não estão funcionando//
