import java.util.ArrayList;

public class Habitacio {
    String nom = "";
    String descripcio = "";
    String posicio = "";
    ArrayList<Objectes> objectes= new ArrayList<Objectes>();
    
    public Habitacio(String nom, String descripcio, String posicio){
        this.nom = nom;
        this.descripcio = descripcio;
        this.posicio = posicio;
    }

    public void setName(String nom){
        this.nom = nom;
    }
    
    public String getName(){
        return nom;
    }

    public void setDescripcio(String descripcio){
        this.descripcio = descripcio;
    } 

    public String getDescripcio(){
        return descripcio;
    }

    public void setPosicio(String posicio){
        this.posicio = posicio;
    }

    public String getPosicio(){
        return posicio;
    }

    public void setObjecte(ArrayList<Objectes> objectes){
        this.objectes = objectes;
    }
    
    public ArrayList<Objectes> getObjecte(ArrayList<Objectes>objectes){
        return objectes;
    }


}