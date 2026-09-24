public class Malien extends Entitat {
    private boolean distret;

    public Malien(String nom, int vida, String posicio, boolean distret) {
        super(nom, vida, posicio);
        this.distret = distret;
    }

    // es com el get. (esta distret?)
    public boolean isDistret() {
        return distret;
    }

    // Setter per distret
    public void setDistret(boolean distret) {
        this.distret = distret;
    }
}