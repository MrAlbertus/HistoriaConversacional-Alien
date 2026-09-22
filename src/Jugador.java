import java.util.ArrayList;

public class Jugador extends Entitat{
    private ArrayList Motxilla;
    private Boolean vestitPosat;

    public Jugador(String nom, int vida, String posicio, ArrayList Motxilla, Boolean vestitPosat) {
        super(nom, vida, posicio);
        this.Motxilla = Motxilla;
        this.vestitPosat = vestitPosat;
    }
    
    
}
