// Definindo a classe SoloFertil como uma subclasse de Solo
public class SoloFertil extends Solo {
    public SoloFertil(String tipoSolo, double ph, int nutrientes) {
        super(tipoSolo, ph, nutrientes);
    }

    // Sobrescrevendo o método isFertil para o solo fértil
    @Override
    public boolean isFertil() {
        return true;
    }
}