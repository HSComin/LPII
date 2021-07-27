package LPII.Atividade8;

public class testefunc {

    public static void main(String[] args) {

        funcionario f1 = new funcionario();
        f1.setNome("Henrique");
        f1.setDepartamento("A1");
        f1.setRg("1589632548");
        f1.setSalario(5000);

        data d1 = new data();
        d1.dia = 27;
        d1.mes = 01;
        d1.ano = 21;
        f1.setDataentrada(d1);

        funcionario f2 = new funcionario();
        f2.setNome("Carlos");
        f2.setDepartamento("A2");
        f2.setRg("4789456423");
        f2.setSalario(3500);

        data d2 = new data();
        d2.dia = 15;
        d2.mes = 05;
        d2.ano = 21;
        f1.setDataentrada(d2);

//        if (f1 == f2){
//            System.out.println("Iguais");
//        }else{
//            System.out.println("Diferentes");
//        }

        f1.mostrar();
        f1.recebeaumento(20);
        f1.mostrar();
    }
}