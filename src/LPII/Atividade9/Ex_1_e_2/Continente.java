package LPII.Atividade9.Ex_1_e_2;

    import java.util.ArrayList;

    public class Continente {
        private String nome;
        public ArrayList<Pais> paises = new ArrayList<Pais>();

        public Continente(String america) {
        }

        public void setName(String name) {
            this.nome = name;
        }

        public void addPais(Pais p) {
            this.paises.add(p);
        }

        public float dimensaoContinente() {
            float soma = 0;
            for (Pais p : this.paises) {
                soma = (float) (soma + p.getDimensao());
            }
            return soma;
        }

        public int popContinente() {
            int soma = 0;
            for (Pais p : this.paises) {
                soma = soma = soma + p.getPop();
            }
            return soma;
        }

        public float densPop() {
            return (float) this.popContinente() / this.dimensaoContinente();
        }

        public Pais maiorPop() {
            Pais paisMaiorPop = this.paises.get(0);

            for (int i = 1; i < this.paises.size(); i++) {
                Pais p = this.paises.get(i);
                if (p.getPop() > paisMaiorPop.getPop()) {
                    paisMaiorPop = p;
                }
            }
            return paisMaiorPop;
        }


        public Pais menorPop() {
            Pais paisMenorPop = this.paises.get(0);

            for (int i = 1; i < this.paises.size(); i++) {
                Pais p = this.paises.get(i);
                if (p.getPop() < paisMenorPop.getPop()) {
                    paisMenorPop = p;
                }
            }
            return paisMenorPop;

        }

        public Pais maiorDim() {
            Pais paisMaiorDimensao = this.paises.get(0);

            for (int i = 1; i < this.paises.size(); i++) {
                Pais p = this.paises.get(i);
                if (p.getPop() > paisMaiorDimensao.getPop()) {
                    paisMaiorDimensao = p;
                }
            }
            return paisMaiorDimensao;
        }

        public Pais menorDim() {
            Pais paisMenorDimensao = this.paises.get(0);

            for (int i = 1; i < this.paises.size(); i++) {
                Pais p = this.paises.get(i);
                if (p.getPop() < paisMenorDimensao.getPop()) {
                    paisMenorDimensao = p;
                }
            }
            return paisMenorDimensao;
        }

        public float razao(){
            Pais paisMaior = this.maiorDim();
            Pais paisMenor = this.menorDim();

            return (float) (paisMaior.getDimensao() / paisMenor.getDimensao());
        }
    }

