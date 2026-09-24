import java.util.ArrayList;
import java.util.Scanner;

public class App {
    Scanner sc = new Scanner(System.in);
    
    private mapa mapa;
    private Jugador jugador;
    private boolean partidaActiva;

    public static void main(String[] args) {

        App p = new App();
        p.principal();

    }

    public void inicialitzar() {

        // INICIALITZAR MAPA
        this.mapa = new mapa();

        //INICIALITZAR PERSONATGE (EN UN FUTUR PODER PREGUNTAR A l'USUARI EL NOM I FER-HO PERSONALITZAT)
        this.jugador = new Jugador("Bond", 100, "7", new ArrayList<Objectes>(), false);
        
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
            
    }

    public void menuP() {
        System.out.println("========== MENÚ INICIAL ==========");
        System.out.println("1. Iniciar una partida nova");
        System.out.println("2. Sortir del joc ");
        System.out.println("==================================");
    
    }

    public void principal(){

        // variable que permeti finalitzar el joc (sortir del bucle del joc)
        boolean jugant = true;

        while (jugant) {

            inicialitzar();

            menuP();
            int opcioMenu = llegirEnters();
            switch (opcioMenu) {
                case 1:
                    //INICI DEL JOC
                    textIntro();
                    mostrarMapa();
                    metodeJoc();
                    break;
                case 2: 
                    jugant = false;
                    break;
                default:
                    System.out.println("Torna-ho a intentar!");
                    break;
            }
        }
    }

    // funció per llegir nombres enters
    public int llegirEnters() {
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
    public void mostrarMapa() {
    System.out.println(
        "                         ╭──────────────────────────────────────────╮\n" +
        "                   ╭─────╯                                          ╰─────╮\n" +
        "               ╭───╯                                                    ╰───╮\n" +
        "            ╭──╯                                                            ╰──╮\n" +
        "          ╭─╯                ┌───────────────────────┐                         ╰─╮\n" +
        "        ╭─╯                  │        TALLERS        │                           ╰─╮\n" +
        "       ╱                     │                       │                              ╲\n" +
        "      ╱         ┌────────────┘                       └───────────────┐               ╲\n" +
        "     │          │                                                    │                │\n" +
        "     │          │   VESTUARI           OFICINES            BANYS     │                │\n" +
        "     │          │                                                    │                │\n" +
        "     │          │             │                       │              │                │\n" +
        "     │          │             │                       │              │                │\n" +
        "     │          │             │                       │              │                │\n" +
        "     │          │             │     ╭───    ────╮     │              │                │\n" +
        "     │          ├─────        ├─────╯           ╰─────┤        ──────┤                │\n" +
        "     │          │             │    │ COMANDAMENT │    │              │                │\n" +
        "     │          │             │     ╲           ╱     │              │                │\n" +
        "     │          │             │      ╰─────────╯      │              │                │\n" +
        "     │          │             │                       │              │                │\n" +
        "     │          │             │                       │              │                │\n" +
        "     │          │                                                    │                │\n" +
        "     │          │   CUINA            MENJADOR          DORMITORI     │                │\n" +
        "     │          │                                                    │                │\n" +
        "      ╲         └────────────┐                       ┌───────────────┘               ╱\n" +
        "       ╲                     │                       │                              ╱\n" +
        "        ╰─╮                  │ SALA SORTIDA EXTERIOR │                           ╭─╯\n" +
        "          ╰─╮                │                       │                         ╭─╯\n" +
        "            ╰──╮             └───────────────────────┘                      ╭──╯\n" +
        "               ╰───╮                      │                             ╭───╯\n" +
        "                   ╰─────╮                │                       ╭─────╯\n" +
        "                         ╰────────────────┼──────────────────────╯\n" +
        "                                          │\n" +
        "                                      ╭────────╮\n" +
        "                                      PROPULSORS\n" +
        "                                      ╰────────╯"
    ); 
    }

    public void textIntro(){
            System.out.println("La nau PIAXII explora l'espai inhòspit en direcció al planeta SUMMEM on es creu que hi poden haver les condicions idònies per arrelar una nova vida.");
            System.out.println("Desrpés d'un llarg període d'hivernació provocada pel llarg viatge, el capità Bond es desperta del son induït...");
            System.out.println("iHall: Que tal ha dormit capità Bond? Em sap greu destorbar-lo però he detectat una anomalia a la nau. S'ha de reparar immediatament");
            System.out.println("Bond: Coi de ferralla intel·ligent!");
            System.out.println("En Bond està altament irritat ja que el somni no podia ser d'allò més excitant i realista...");
            System.out.println("Bond: Espero que hagi estat indispensable que haver-me destorbat del son! Sinó prepara't per que et programi unes quantes sessions de Treball cooperatiu amb un pedagog inspirat...");
            System.out.println("iHall: Li garanteixo capità que no és una falsa alarma, no m'arriscaria a patir un càstig similar...");
            System.out.println("Bond: Està bé iHall, dona'm l'informe de la situació i anem per feina!");
            System.out.println("iHall: Aqui va l'informe... Resulta que hem xocat contre un petit aeròlit que ha provocat petits danys al sistema de propulsió de la nau els quals necessiten intervenció humana.");
            System.out.println("iHall: El teu objectiu és fer-te amb l'eina de reparació que està al taller de la nau i reparar els danys dels propulsors de la nau.");
            System.out.println("Aquest és el mapa de la nau: ");
    }
    public void metodeJoc() {
    boolean partidaActiva = true;

    System.out.println("\nEscriu 'ajuda' per veure les accions possibles.");

    while (partidaActiva) {
        System.out.print("\n> ");
        String accio = sc.nextLine().toLowerCase();

        switch (accio) {
            case "ajuda":
                mostrarManual();
                break;

            case "mapa":
                mostrarMapa();
                break;

            case "mirar":
                System.out.println("Mires al teu voltant...");
                // Aquí anirà el codi per realitzar l'acció "mirar" la qual et digui quins objectes hi ha a la habitació on estas
                break;

            case "moure":
                moureJugador();
                break;

            case "inventari":
                // Aquí es mostrarà l'ArrayList de l'inventari (en cas de no tenir cap objecte, es mostrarà buit o et dira que no tens cap objecte)
                break;

            case "agafar":
                System.out.print("Quin objecte vols agafar? ");
                String objecteAgafar = sc.nextLine();

                System.out.println("Has intentat agafar: " + objecteAgafar);
                //Aquí haurem de posar el codi per tal de que verifiqui que l'objecte estigui a la sala i te l'afegeixi a l'inventari
                break;

            case "usar":
                System.out.print("Quin objecte vols utilitzar? ");
                String objecteUsar = sc.nextLine();

                System.out.println("Has intentat utilitzar: " + objecteUsar);
                // Aquí anirà el codi de cada un dels objectes (quan l'utilitzin)
                break;

            case "sortir":
                System.out.println("Has abandonat la partida.");
                partidaActiva = false;
                break;

            default:
                System.out.println("No entenc aquesta acció. Escriu 'ajuda' per veure el manual.");
                break;
        }
    }
}
public void mostrarManual() {
    System.out.println("\n========== MANUAL D'INSTRUCCIONS ==========");
    System.out.println("ajuda           - Mostra les accions possibles.");
    System.out.println("mapa            - Mostra el mapa de la nau.");
    System.out.println("mirar           - Mira la sala on et trobes.");
    System.out.println("moure           - Moure't a una habitació");
    System.out.println("inventari       - Mostra els objectes que portes.");
    System.out.println("agafar          - Intenta agafar un objecte.");
    System.out.println("usar            - Intenta utilitzar un objecte.");
    System.out.println("sortir          - Abandona la partida i torna al menú inicial.");
    System.out.println("===========================================");
}
public void moureJugador(){

    int posActual = Integer.parseInt(jugador.getPosicio());
    Habitacio habActual = mapa.getHabitacio(posActual);

    mostrarMapa();
    System.out.println("Ets a: " + habActual.getNom());
    System.out.println("Cap a quina direcció et vols moure? (Dreta, esquerra, adalt o abaix)");
    String direccio = sc.nextLine().toLowerCase();

    //DIRECCIONS
    
    int desti = -1;
    
    if (direccio.equals("adalt")) {
        desti = habActual.getAdalt();
    } else if (direccio.equals("abaix")) {
        desti = habActual.getAbaix();
    } else if (direccio.equals("esquerra")) {
        desti = habActual.getEsquerra();
    } else if (direccio.equals("dreta")) {
        desti = habActual.getDreta();
    } else {
        System.out.println("Direcció no vàlida! Tria entre: adalt, abaix, esquerra o dreta.");
        return;
    }

    if (desti != -1) {
            // Condició de mort: entrar a la Sala Sortida Exterior (sala 8) sense vestit
            if (desti == 8 && !jugador.getVestitPosat()) {
                System.out.println("\n========================================================");
                System.out.println("ALERTA! Has obert la porta exterior sense el vestit!");
                System.out.println("L'aire s'escapa al buit i et quedes sense oxigen a l'instant.");
                System.out.println("HAS MORT. FI DE LA PARTIDA.");
                System.out.println("========================================================");
                partidaActiva = false;
                return;
            }

    // Actualitzem la posició del jugador
        // 1. Convertim el número 'desti' a text i actualitzem la posició del personatge
            jugador.setPosicio(String.valueOf(desti));

            // 2. Busquem la nova habitació al mapa amb el nou índex
            Habitacio habNova = mapa.getHabitacio(desti);

            // 3. Mostrem la confirmació del trasllat i la descripció de la sala
            System.out.println("\n-------------------------------------------");
            System.out.println("T'has mogut a: " + habNova.getNom());
            System.out.println(habNova.getDescripcio());
            System.out.println("-------------------------------------------");
    }}
}

