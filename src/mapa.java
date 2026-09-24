import java.util.ArrayList;

public class mapa {
    private ArrayList<Habitacio> llistaHabitacions;

    public mapa() {
        this.llistaHabitacions = new ArrayList<>();
        crearMapa();
    }

    public void crearMapa() {
        // Índex 0: TALLERS
        llistaHabitacions.add(new Habitacio(
            "Tallers",
            "Zona de manteniment plena de peces de recanvi i eines pesades.",
            -1, // adalt
            2,  // abaix -> Oficines
            -1, // esquerra
            -1  // dreta
        ));

        // Índex 1: VESTUARI
        llistaHabitacions.add(new Habitacio(
            "Vestuari",
            "Taquilles metàl·liques i vestits espacials de recanvi.",
            -1, // adalt
            5,  // abaix -> Cuina
            -1, // esquerra
            2   // dreta -> Oficines
        ));

        // sala Oficines
        llistaHabitacions.add(new Habitacio(
            "Oficines",
            "Terminals d'ordinador amb informes i registres de la tripulació.",
            0,  // adalt -> Tallers
            4,  // abaix -> Comandament
            1,  // esquerra -> Vestuari
            3   // dreta -> Banys
        ));

        // sala Banys
        llistaHabitacions.add(new Habitacio(
            "Banys",
            "Instal·lacions sanitàries bàsiques de la nau.",
            -1, // adalt
            7,  // abaix -> Dormitori
            2,  // esquerra -> Oficines
            -1  // dreta
        ));

        // Índex 4: COMANDAMENT
        llistaHabitacions.add(new Habitacio(
            "Comandament",
            "El pont de comandament central amb el timó i sistemes de navegació.",
            2,  // adalt -> Oficines
            6,  // abaix -> Menjador
            -1, // esquerra
            -1  // dreta
        ));

        // Índex 5: CUINA
        llistaHabitacions.add(new Habitacio(
            "Cuina",
            "Rebost i dispensadors de menjar liofilitzat.",
            1,  // adalt -> Vestuari
            -1, // abaix
            -1, // esquerra
            6   // dreta -> Menjador
        ));

        // sala Menjador
        llistaHabitacions.add(new Habitacio(
            "Menjador",
            "Taules llargues on es reunia la tripulació per menjar i descansar.",
            4,  // adalt -> Comandament
            8,  // abaix -> Sala Sortida Exterior
            5,  // esquerra -> Cuina
            7   // dreta -> Dormitori
        ));

        // sala Dormitori
        llistaHabitacions.add(new Habitacio(
            "Dormitori",
            "Lliteres encastades a la paret per al descans dels tripulants.",
            3,  // adalt -> Banys
            -1, // abaix
            6,  // esquerra -> Menjador
            -1  // dreta
        ));

        // sala SORTIDA exterior
        llistaHabitacions.add(new Habitacio(
            "Sala Sortida Exterior",
            "La resclosa d'aire pressuritzada que dona accés a l'espai exterior.",
            6,  // adalt -> Menjador
            9,  // abaix -> Propulsors
            -1, // esquerra
            -1  // dreta
        ));

        // sala Propulsors
        llistaHabitacions.add(new Habitacio(
            "Propulsors",
            "La sala dels motors principals amb una forta vibració de fons.",
            8,  // adalt -> Sala Sortida Exterior
            -1, // abaix
            -1, // esquerra
            -1  // dreta
        ));
    }
}
