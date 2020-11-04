package projeto;

public class Pessoa {

    private String nome;
    private String CPF;
    private String RG;
    private String telefone;

    public Pessoa() {
    }

    public Pessoa(String nome, String CPF, String RG, String telefone) {
        this.setNome(nome);
        this.setCPF(CPF);
        this.setRG(RG);
        this.setTelefone(telefone);
    }

    public Pessoa(String nome, String CPF, String RG) {
        this.setNome(nome);
        this.setCPF(CPF);
        this.setRG(RG);
    }

    public Pessoa(String telefone) {
        this.setTelefone(telefone);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getNome() {
        return this.nome;
    }

    public String getCPF() {
        return this.CPF;
    }

    public String getRG() {
        return this.RG;
    }

    public String getTelefone() {
        return this.telefone;
    }
}
