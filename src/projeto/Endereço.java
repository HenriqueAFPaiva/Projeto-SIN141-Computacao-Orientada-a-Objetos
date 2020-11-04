package projeto;

public class Endereço {

    private String rua;
    private int numeroDaCasa;
    private String bairro;
    private int CEP;
    private String cidade;
    private String estado;
    private String país;

    public Endereço() {
    }

    public Endereço(String rua, int numeroDaCasa, String bairro, int CEP, String cidade, String estado, String país) {
        this.setRua(rua);
        this.setNumeroDaCasa(numeroDaCasa);
        this.setBairro(bairro);
        this.setCEP(CEP);
        this.setCidade(cidade);
        this.setEstado(estado);
        this.setPaís(país);
    }

    public Endereço(String rua, int numeroDaCasa, String bairro, int CEP) {
        this.setRua(rua);
        this.setNumeroDaCasa(numeroDaCasa);
        this.setBairro(bairro);
        this.setCEP(CEP);
    }

    public Endereço(String cidade, String estado, String país) {
        this.setCidade(cidade);
        this.setEstado(estado);
        this.setPaís(país);
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public void setNumeroDaCasa(int numeroDaCasa) {
        this.numeroDaCasa = numeroDaCasa;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setCEP(int CEP) {
        this.CEP = CEP;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setPaís(String país) {
        this.país = país;
    }

    public String getRua() {
        return this.rua;
    }

    public int getNumeroDaCasa() {
        return this.numeroDaCasa;
    }

    public String getBairro() {
        return this.bairro;
    }

    public int getCEP() {
        return this.CEP;
    }

    public String getCidade() {
        return this.cidade;
    }

    public String getEstado() {
        return this.estado;
    }

    public String getPaís() {
        return this.país;
    }
}
