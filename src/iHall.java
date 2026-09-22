public class iHall extends Entitat{
    private Boolean estatAnormal;

    public iHall(String nom, int vida, String posicio, Boolean estatAnormal){
        super(nom, vida, posicio);
        this.estatAnormal = estatAnormal;
    }

    
}
