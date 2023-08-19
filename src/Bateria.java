
public class Bateria {
    private String tipoBateria;
    private int carga;

    public Bateria() {
        this.carga = 1000;
    }

    public String getTipoBateria() {
        return tipoBateria;
    }

    public int getCarga() {
        return this.carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }
    
}
