public class Company extends Entitat {
    private boolean despertar;
    private boolean portaTargeta;

    public Company(String nom, int vida, String posicio, boolean despertar, boolean portaTargeta) {
        super(nom, vida, posicio);
        this.despertar = despertar;
        this.portaTargeta = portaTargeta;
    }

    // Getters y Setters per despertar
    public boolean isDespertar() {
        return despertar;
    }

    public void setDespertar(boolean despertar) {
        this.despertar = despertar;
    }

    // Getters y Setters per si porta o no Targeta
    public boolean isPortaTargeta() {
        return portaTargeta;
    }

    public void setPortaTargeta(boolean portaTargeta) {
        this.portaTargeta = portaTargeta;
    }
}