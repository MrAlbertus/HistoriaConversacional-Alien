public class App {
    public static void main(String[] args) {
        //objectes de cada un dels ítems que s'utilitzen al joc
        Objectes llanterna = new Objectes("Llanterna", "x", "Petita llanterna de color negre amb un botó per poder encendre la llum.",true);
        Objectes targetaPersonal = new Objectes("Targeta personal", "Oficina principal", "Petita targeta identificadora que porta la foto del capità.", true);
        Objectes targetaCompany = new Objectes("Targeta del company", "Dormitoris", "Una targeta d'accés que pertany a un altre tripulant de la nau.", true);
        Objectes vestitAstronauta = new Objectes ("Vestit d'astronauta", "Vestuaris", "És un vestit blanc amb un casc gran i rodo.", true);
        Objectes donuts = new Objectes ("Dónuts", "Cuina", "Una caixa de dònuts acabats de fer i amb una bona capa de sucre. Fan una olor deliciosa que no només temptaria qualsevol membre de la tripulació afamat.", true);
        Objectes einaDelTaller = new Objectes ("Eina del taller", "Taller", "Petita caixa d’eines antiga. Es pot utilitzar per reparar la nau!", true);
    }
}
