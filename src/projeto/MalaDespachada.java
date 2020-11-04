package projeto;

public class MalaDespachada implements Malas {

    public float altura;
    public float largura;
    public float comprimento;
    public float peso; //23
    public float tamanho = this.altura + this.largura + this.comprimento;
    public int tipo;
    public int codigo;

    public MalaDespachada() {
    }

    @Override
    public boolean aprovarMala() {
        if (tamanho > 158 || peso > 23) {
            return false;
        }
        return true;
    }

    @Override
    public boolean destinoMala() {
        if (this.aprovarMala() == true) {
            return true;
        }
        return false;
    }
}
