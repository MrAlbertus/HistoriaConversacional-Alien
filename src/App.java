import java.util.Scanner;

public class App {
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        

        App p = new App();
        p.principal();

    }

    public void principal(){
        // FALTA PROGRAMAR QUE LA LLANTERNA APAREGUI DE MANERA ALEATÒRIA
        // FALTA PROGRAMAR L'INVENTARI AMB UN ARRAYLIST QUE S'ACTUALITZI QUAN EL JUGADOR
        // AGAFI UN OBJECTE

        // variable que permeti finalitzar el joc (sortir del bucle del joc)
        boolean jugant = true;

        while (!jugant) {

            // objectes de cada un dels ítems que s'utilitzen al joc
            Objectes llanterna = new Objectes("Llanterna", "x",
                    "Petita llanterna de color negre amb un botó per poder encendre la llum.", true);
            Objectes targetaPersonal = new Objectes("Targeta personal", "Oficina principal",
                    "Petita targeta identificadora que porta la foto del capità.", true);
            Objectes targetaCompany = new Objectes("Targeta del company", "Dormitoris",
                    "Una targeta d'accés que pertany a un altre tripulant de la nau.", true);
            Objectes vestitAstronauta = new Objectes("Vestit d'astronauta", "Vestuaris",
                    "És un vestit blanc amb un casc gran i rodo.", true);
            Objectes donuts = new Objectes("Dónuts", "Cuina",
                    "Una caixa de dònuts acabats de fer i amb una bona capa de sucre. Fan una olor deliciosa que no només temptaria qualsevol membre de la tripulació afamat.",
                    true);
            Objectes einaDelTaller = new Objectes("Eina del taller", "Taller",
                    "Petita caixa d’eines antiga. Es pot utilitzar per reparar la nau!", true);
            
            System.out.println("========== MENÚ INICIAL ==========");
            System.out.println("1. Iniciar una partida nova");
            System.out.println("2. Sortir del joc ");
            System.out.println("==================================");
            int opcioMenu = llegirEnters();
            switch (opcioMenu) {
                case 1:
                    System.out.println("OPCIO11");
                    break;
                case 2: 
                    System.out.println("OPCIO2");
                    break;
                default:
                    System.out.println("Torna-ho a intentar!");
                    break;
            }
    }
}
//funció per llegir nombres enters
    public int llegirEnters(){
        int nombre = 0;
        try {
            nombre = sc.nextInt();
            sc.nextLine();
        } catch (Exception e) {
            System.out.println("Error, torna-ho a intentar!");
            sc.nextLine();
        }
        return nombre;
    }
}
