import java.util.ArrayList;

public class Habitacio {
    private String nom = "";
    private String descripcio = "";
    private int adalt; // aqui posem la ID de la habitació d'adalt. -1 si no hi ha
    private int abaix; // aqui posem la ID de la habitació d'abaix. -1 si no hi ha
    private int esquerra; // aqui posem la ID de la habitació de l'esquerra. -1 si no hi ha
    private int dreta; // aqui posem la ID de la habitació de la dreta. -1 si no hi ha

    private ArrayList<Objectes> objectes;
    
    public Habitacio(String nom, String descripcio, int adalt, int abaix, int esquerra, int dreta){
        setNom(nom);
        setDescripcio(descripcio);
        setAdalt(adalt);
        setAbaix(abaix);
        setEsquerra(esquerra);
        setDreta(dreta);
        this.objectes = new ArrayList<>(); // crea la arraylist pels objectes en cada habitació.    
    }

    public void setNom(String nom){
        this.nom = nom;
    }
    
    public String getNom(){
        return nom;
    }

    public void setDescripcio(String descripcio){
        this.descripcio = descripcio;
    } 

    public String getDescripcio(){
        return descripcio;
    }


    public void afegirObjecte(Objectes obj){
        this.objectes.add(obj);
    }
    
    public void treureObjecte(Objectes obj) {
        this.objectes.remove(obj);
    }


    // pos Adalt
    public void setAdalt(int adalt){
        this.adalt = adalt;
    }

    public int getAdalt(){
        return adalt;
    }


    // pos Abaix
    public void setAbaix(int abaix){
        this.abaix = abaix;
    }

    public int getAbaix(){
        return abaix;
    }

    // pos Esquerra
    public void setEsquerra(int esquerra){
        this.esquerra = esquerra;
    }
    
    public int getEsquerra(){
        return esquerra;
    }

    // pos Dreta
    public void setDreta(int dreta){
        this.dreta = dreta;
    }

    public int getDreta(){
        return dreta;
    }

}