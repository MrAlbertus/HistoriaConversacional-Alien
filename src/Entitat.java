public class Entitat {
    private String nom;
    private int vida;
    private String posicio;

    public Entitat(String nom, int vida, String posicio){
        setNom(nom);
        setPosicio(posicio);
        setVida(vida);
    }

    //Setters i Getters
    public String getNom(){
        return nom;
    }
    public void setNom(String nom){
        this.nom = nom;
    }

    public int getVida(){
        return vida;
    } 
    public void setVida(int vida){
        this.vida = vida;
    }

    public String getPosicio(){
        return posicio;
    }
    public void setPosicio(String posicio){
        this.posicio = posicio;
    }
}
