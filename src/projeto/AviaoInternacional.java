package projeto;

public class AviaoInternacional extends Avioes {

    public String destinoPais;

    public AviaoInternacional() {
    }

    public AviaoInternacional(String nome, int numeroDoVoo, Destino destino, Hora horaDeSaida, Hora horaEstimadaChegada, int quantidadeMaxPassageiros, float pesoMaxMalas, String destinoPais) {
        super(nome, numeroDoVoo, destino, horaDeSaida, horaEstimadaChegada);
        this.setQuantidadeMaxPassageiros(quantidadeMaxPassageiros);
        this.setPesoMaxMalas(pesoMaxMalas);
        this.setDestinoPais(destinoPais);
    }

    public void setQuantidadeMaxPassageiros(int quantidadeMaxPassageiros) {
        this.quantidadeMaxPassageiros = quantidadeMaxPassageiros;
    }

    public void setPesoMaxMalas(float pesoMaxMalas) {
        this.pesoMaxMalas = pesoMaxMalas;
    }

    public void setDestinoPais(String destinoPais) {
        this.destinoPais = destinoPais;
    }

    public int getQuantidadeMaxPassageiros() {
        return this.quantidadeMaxPassageiros;
    }

    public float getPesoMaxMalas() {
        return this.pesoMaxMalas;
    }

    public int getCodigoMalas(int i) {
        return this.codigoMalas[i];
    }

    public String getDestinoPais() {
        return this.destinoPais;
    }

    @Override
    public String imprimeDados() {
        return String.format("\n\nNome do Avião: %s\nNumero do Voo: %d\nQuantidade de Passageiros: %d\nQuantidade Maxima de Passageiros: %d\nPaís de destino: %s", this.getNome(), this.getNumeroDoVoo(), this.getQuantidadePassageiros(), this.getQuantidadeMaxPassageiros(), this.getDestinoPais());
    }

    @Override
    public boolean verificarMala(int[] codigoMalas) {
        for (int i = 0; i < this.quantidadeMaxPassageiros; i++) {
            if (this.codigoMalas.equals(codigoMalas[i])) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String imprimeRota() {
        return String.format("\n\nPonto de Saída: %s\nDestino: %s\nPaís de Destino: %s\nHora de Saída: %s\nHora Estimada de Chegada: %s\n", this.getPontoDeSaida(), this.getDestino(), this.getDestinoPais(), this.horaDeSaida.imprimeHora(), this.horaEstimadaChegada.imprimeHora());
    }

    @Override
    public boolean verificaPeso() {
        if (this.pesoAtualMalas > this.pesoMaxMalas) {
            return false;
        }
        return true;
    }
}
