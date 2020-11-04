package projeto;

public class Hora {

    private int hora;
    private int min;
    private int seg;

    public Hora() {
    }

    public Hora(int hora, int min, int seg) {
        this.setHora(hora);
        this.setMin(min);
        this.setSeg(seg);
    }

    public Hora(int hora, int min) {
        this.setHora(hora);
        this.setMin(min);
    }

    public Hora(int hora) {
        this.setHora(hora);
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public void setSeg(int seg) {
        this.seg = seg;
    }

    public int getHora() {
        return this.hora;
    }

    public int getMin() {
        return this.min;
    }

    public int getSeg() {
        return this.seg;
    }

    public String imprimeHora() {
        return String.format("\n%d:%d:%d\n", hora, min, seg);
    }
}
