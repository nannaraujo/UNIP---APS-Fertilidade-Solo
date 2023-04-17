// Exemplo de uso das classes Solo e SoloFertil
public class Main {
    public static void main(String[] args) {
        Solo solo = new Solo("Argiloso", 6.5, 150);
        SoloFertil soloFertil = new SoloFertil("Argiloso", 6.5, 150);

        System.out.println("Solo é fértil? " + solo.isFertil());
        System.out.println("Solo Fértil é fértil? " + soloFertil.isFertil());
    }
}
