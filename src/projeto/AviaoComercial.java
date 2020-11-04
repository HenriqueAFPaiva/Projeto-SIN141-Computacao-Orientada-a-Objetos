package projeto;

public class AviaoComercial extends Avioes {

    public AviaoComercial() {
    }

    public AviaoComercial(String nome, int numeroDoVoo, Destino destino, Hora horaDeSaida, Hora horaEstimadaChegada, int quantidadeMaxPassageiros, float pesoMaxMalas) {
        super(nome, numeroDoVoo, destino, horaDeSaida, horaEstimadaChegada);
        this.setQuantidadeMaxPassageiros(quantidadeMaxPassageiros);
        this.setPesoMaxMalas(pesoMaxMalas);
    }

    public void setQuantidadeMaxPassageiros(int quantidadeMaxPassageiros) {
        this.quantidadeMaxPassageiros = quantidadeMaxPassageiros;
    }

    public void setPesoMaxMalas(float pesoMaxMalas) {
        this.pesoMaxMalas = pesoMaxMalas;
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

    @Override
    public String imprimeDados() {
        return String.format("\n\nNome do Avião: %s\nNumero do Voo: %d\nQuantidade de Passageiros: %d\nQuantidade Maxima de Passageiros: %d", this.getNome(), this.getNumeroDoVoo(), this.getQuantidadePassageiros(), this.getQuantidadeMaxPassageiros());
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
        return String.format("\n\nPonto de Saída: %s\nDestino: %s\nHora de Saída: %s\nHora Estimada de Chegada: %s\n", this.getPontoDeSaida(), this.getDestino(), this.horaDeSaida.imprimeHora(), this.horaEstimadaChegada.imprimeHora());
    }

    @Override
    public boolean verificaPeso() {
        if (this.pesoAtualMalas > this.pesoMaxMalas) {
            return false;
        }
        return true;
    }
}
