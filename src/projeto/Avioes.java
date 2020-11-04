package projeto;

public abstract class Avioes {

    protected String nome;
    protected int numeroDoVoo;
    protected int quantidadePassageiros;
    protected float pesoAtualMalas;
    protected Destino destino;
    protected String pontoDeSaida = "Belo Horizonte";
    protected Hora horaDeSaida;
    protected Hora horaEstimadaChegada;
    protected int quantidadeMaxPassageiros;
    protected float pesoMaxMalas;
    protected int codigoMalas[] = new int[266 * 10];

    public Avioes() {
    }

    public Avioes(String nome, int numeroDoVoo, Destino destino, Hora horaDeSaida, Hora horaEstimadaChegada) {
        this.setNome(nome);
        this.setNumeroDoVoo(numeroDoVoo);
        this.setDestino(destino);
        this.setHoraDeSaida(horaDeSaida);
        this.setHoraEstimadaChegada(horaEstimadaChegada);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNumeroDoVoo(int numeroDoVoo) {
        this.numeroDoVoo = numeroDoVoo;
    }

    public void setQuantidadePassageiros(int quantidadePassageiros) {
        this.quantidadePassageiros = quantidadePassageiros;
    }

    public void setPesoAtualMalas(float pesoAtualMalas) {
        this.pesoAtualMalas = pesoAtualMalas;
    }

    public void setDestino(Destino destino) {
        this.destino = destino;
    }

    public void setCodigoMalas(int[] codigoMalasC) {
        System.arraycopy(codigoMalasC, 0, codigoMalas, 0, codigoMalasC.length);
    }

    public int getCodigoMalas(int i) {
        return this.codigoMalas[i];
    }

    public void setHoraDeSaida(Hora horaDeSaida) {
        this.horaDeSaida = horaDeSaida;
    }

    public void setHoraEstimadaChegada(Hora horaEstimadaChegada) {
        this.horaEstimadaChegada = horaEstimadaChegada;
    }

    public String getNome() {
        return this.nome;
    }

    public int getNumeroDoVoo() {
        return this.numeroDoVoo;
    }

    public int getQuantidadePassageiros() {
        return this.quantidadePassageiros;
    }

    public float getPesoAtualMalas() {
        return this.pesoAtualMalas;
    }

    public String getDestino() {
        return this.destino.imprimeDestino();
    }

    public String getPontoDeSaida() {
        return this.pontoDeSaida;
    }

    public String getHoraDeSaida() {
        return this.horaDeSaida.imprimeHora();
    }

    public String getHoraEstimadaChegada() {
        return this.horaEstimadaChegada.imprimeHora();
    }

    public abstract boolean verificarMala(int[] codigoMalas);

    public abstract String imprimeDados();

    public abstract boolean verificaPeso();

    public abstract String imprimeRota();
}
