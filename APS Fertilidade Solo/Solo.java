// Definindo a classe Solo como uma superclasse

public class Solo {
    private String tipoSolo;
    private double ph;
    private int nutrientes;

    public Solo(String tipoSolo, double ph, int nutrientes) {
        this.tipoSolo = tipoSolo;
        this.ph = ph;
        this.nutrientes = nutrientes;
    }

    public String getTipoSolo() {
        return tipoSolo;
    }

    public void setTipoSolo(String tipoSolo) {
        this.tipoSolo = tipoSolo;
    }

    public double getPh() {
        return ph;
    }

    public void setPh(double ph) {
        this.ph = ph;
    }

    public int getNutrientes() {
        return nutrientes;
    }

    public void setNutrientes(int nutrientes) {
        this.nutrientes = nutrientes;
    }

    // Método para verificar se o solo é fértil ou não
    public boolean isFertil() {
        return (tipoSolo.equals("Argiloso") && ph >= 6.0 && nutrientes >= 100);
    }
}