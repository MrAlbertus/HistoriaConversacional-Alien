
public class Company extends Entitat{
    private Boolean despertar;
    private Boolean portaTargeta;

    public Company(String nom, int vida, String posicio, Boolean despertar, Boolean portaTargeta){
        super(nom, vida, posicio);
        this.despertar = despertar;
        this.portaTargeta = portaTargeta;
    }


    
}
