import java.util.ArrayList;

public class Jugador extends Entitat {
    private ArrayList<Objectes> motxilla;
    private boolean vestitPosat;

    public Jugador(String nom, int vida, String posicio, ArrayList<Objectes> motxilla, boolean vestitPosat) {
        super(nom, vida, posicio);
        this.motxilla = motxilla;
        this.vestitPosat = vestitPosat;
    }

    // Getters i Setters per al vestit
    public boolean getVestitPosat() {
        return vestitPosat;
    }

    public void setVestitPosat(boolean vestitPosat) {
        this.vestitPosat = vestitPosat;
    }

    // Getters i Setters per a la motxilla
    public ArrayList<Objectes> getMotxilla() {
        return motxilla;
    }

    public void setMotxilla(ArrayList<Objectes> motxilla) {
        this.motxilla = motxilla;
    }

    // Metodes agafar i treure objectes de la motxilla
    public void afegirObjecte(Objectes obj) {
        this.motxilla.add(obj);
    }

    public void treureObjecte(Objectes obj) {
        this.motxilla.remove(obj);
    }
}