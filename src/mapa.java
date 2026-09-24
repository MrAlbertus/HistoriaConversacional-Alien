import java.util.ArrayList;

public class mapa {
    private ArrayList<Habitacio> llistaHabitacions;

    public mapa() {
        this.llistaHabitacions = new ArrayList<>();
        crearMapa();
    }

    public void crearMapa() {
        // Posicio 0: TALLERS
        llistaHabitacions.add(new Habitacio(
            "Tallers",
            "Zona de manteniment plena de peces de recanvi i eines pesades.",
            -1, // adalt NO ES POT
            2,  // abaix es Oficines
            -1, // esquerra NO ES POT
            -1  // dreta NO ES POT
        ));

        // Posicio 1: VESTUARI
        llistaHabitacions.add(new Habitacio(
            "Vestuari",
            "Taquilles metàl·liques i vestits espacials de recanvi.",
            -1, // adalt NO ES POT
            5,  // abaix es Cuina
            -1, // esquerra NO ES POT
            2   // dreta es Oficines
        ));

        // Posicio 2: OFICINES
        llistaHabitacions.add(new Habitacio(
            "Oficines",
            "Terminals d'ordinador amb informes i registres de la tripulació.",
            0,  // adalt es Tallers
            4,  // abaix es Comandament
            1,  // esquerra es Vestuari
            3   // dreta es Banys
        ));

        // Posicio 3: BANYS
        llistaHabitacions.add(new Habitacio(
            "Banys",
            "Instal·lacions sanitàries bàsiques de la nau.",
            -1, // adalt NO ES POT
            7,  // abaix es Dormitori
            2,  // esquerra es Oficines
            -1  // dreta NO ES POT
        ));

        // Posicio 4: COMANDAMENT
        llistaHabitacions.add(new Habitacio(
            "Comandament",
            "El pont de comandament central amb el timó i sistemes de navegació.",
            2,  // adalt es Oficines
            6,  // abaix es Menjador
            -1, // esquerra NO ES POT
            -1  // dreta NO ES POT
        ));

        // Posicio 5: CUINA
        llistaHabitacions.add(new Habitacio(
            "Cuina",
            "Lloc on .",
            1,  // adalt es Vestuari
            -1, // abaix NO ES POT
            -1, // esquerra NO ES POT
            6   // dreta es Menjador
        ));

        // Posicio 6: MENJADOR
        llistaHabitacions.add(new Habitacio(
            "Menjador",
            "Taules on es reuneix la tripulació per menjar.",
            4,  // adalt es Comandament
            8,  // abaix es Sala Sortida Exterior
            5,  // esquerra es Cuina
            7   // dreta es Dormitori
        ));

        // Posicio 7: DORMITORI
        llistaHabitacions.add(new Habitacio(
            "Dormitori",
            "Lliteres incrustades a la paret on els tripulants de la nau dormen.",
            3,  // adalt es Banys
            -1, // abaix NO ES POT
            6,  // esquerra es Menjador
            -1  // dreta NO ES POT
        ));

        // Posicio 8: SALA SORTIDA EXTERIOR
        llistaHabitacions.add(new Habitacio(
            "Sala Sortida Exterior",
            "La comporta que dona accés a l'espai exterior.",
            6,  // adalt es Menjador
            9,  // abaix es Propulsors
            -1, // esquerra NO ES POT
            -1  // dreta NO ES POT
        ));

        // Posicio 9: PROPULSORS
        llistaHabitacions.add(new Habitacio(
            "Propulsors",
            "La sala dels motors principals amb una forta vibració de fons.",
            8,  // adalt es Sala Sortida Exterior
            -1, // abaix NO ES POT
            -1, // esquerra NO ES POT
            -1  // dreta NO ES POT
        ));
    }

    public Habitacio getHabitacio(int index) {
        if (index >= 0 && index < llistaHabitacions.size()) {
            return llistaHabitacions.get(index);
        }
        return null;
    }
}
