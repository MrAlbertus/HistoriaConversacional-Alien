public class Objectes {
    private String tipus;
    private String posicio;
    private String descripcio;
    private boolean util;   

    public Objectes(String tipus, String posicio, String descripcio, boolean util){
        this.tipus = tipus;
        this.posicio = posicio;
        this.descripcio = descripcio;
        this.util = util;
    }

    //Getters i setters
    public String getTipus(){
        return tipus;
    }
    public String getPosicio(){
        return posicio;
    }
    public String getDescripcio(){
        return descripcio;
    }
    public boolean getUtil(){
        return util;
    }

    public void setTipus(String tipus){
        this.tipus = tipus;
    }
    public void setPosicio(String posicio){
        this.posicio = posicio;
    }
    public void setDescripcio(String descripcio){
        this.descripcio = descripcio;
    }
    public void setUtil(boolean util){
        this.util = util;
    }

    //Altres mètodes

    public void consultarInformacio(){
        //Aquí hem de programar el mètode que ens retornarà la informació de l'objecte 
    }
}

