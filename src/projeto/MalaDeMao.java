package projeto;

public class MalaDeMao implements Malas {

    public float altura; //55
    public float largura; //35
    public float comprimento; //25
    public float peso; //16
    public int codigo;

    public MalaDeMao() {
    }

    @Override
    public boolean aprovarMala() {
        if (altura > 55 || largura > 35 || comprimento > 25 || peso > 16) {
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
