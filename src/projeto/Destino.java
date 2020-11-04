package projeto;

import java.io.Serializable;

public class Destino implements Serializable {

    private String nomeDest;
    private float distancia;

    public Destino() {
    }

    public Destino(String nomeDest, float distancia) {
        this.setNomeDest(nomeDest);
        this.setDistancia(distancia);
    }

    public Destino(String nomeDest) {
        this.setNomeDest(nomeDest);
    }

    public Destino(float distancia) {
        this.setDistancia(distancia);
    }

    public void setNomeDest(String nomeDest) {
        this.nomeDest = nomeDest;
    }

    public void setDistancia(float distancia) {
        this.distancia = distancia;
    }

    public String getNomeDest() {
        return this.nomeDest;
    }

    public float getDistancia() {
        return this.distancia;
    }

    public String imprimeDestino() {
        if (this.nomeDest != null) {
            return String.format("Destino: %s   Distancia: %.2f", this.nomeDest, this.distancia);
        }
        return null;
    }
}
