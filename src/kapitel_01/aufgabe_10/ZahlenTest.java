package kapitel_01.aufgabe_10;


public class ZahlenTest {
// Konstantendefinitionen zur Beschreibung von Objektzuständen
    static final int GANZEZAHLEN =  1;
    static final int RATIONALEZAHLEN = 2;
// Der Typ der Zahlen wird zur Vereinfachung von deren Auswahl
// als int-Wert definiert
    int zahlenTyp;

// Globale Referenzen vom Typ der Klasse GanzeZahlen
    GanzeZahl z1;
    GanzeZahl z2;

    // toString für Objekt GanzeZahlen
    @Override
    public String toString() {
        return "ZahlenTest( ZahlenTyp: "
                + (this.zahlenTyp == RATIONALEZAHLEN?"Rationale Zahl":"Ganze Zahl")
                +  ", erste Zahl: "
                + this.z1
                + ", zweite Zahl: "
                + this.z2
                + ")";
    }
    public static void eingerückten_anzeigen(String s){
        System.out.println("\t" + s);
    }

// Konstruktordefinition
    ZahlenTest(int zahlenTyp,int z1, int z2) {
        this.z1 = new GanzeZahl(z1);
        this.z2 = new GanzeZahl(z2);
        this.zahlenTyp = zahlenTyp;
        System.out.println(this);
        switch(zahlenTyp) {
            case GANZEZAHLEN:
                defGanzeZahlen();
                break;
            case RATIONALEZAHLEN:
                defRationaleZahlen();
                break;
        }
    }
    public void defGanzeZahlen() {
        // System.out.println(z1);
        // z1.anzeige();
        // z2.anzeige();
        GanzeZahl t = GanzeZahl.ggTeiler(z1, z2);
        eingerückten_anzeigen( "Groesste gemeinsame Teiler: " + t);
        // System.out.print("Groesste gemeinsame Teiler: ");
        // t.anzeige();
        GanzeZahl v = GanzeZahl.kgVielfaches(z1, z2);

        System.out.print("Kleinste gemeinsame Vielfache: ");
        v.anzeige();
        System.out.print("Ergebnis der Addition: ");
        GanzeZahl.add(z1, z2).anzeige();
        System.out.print("Ergebnis der Subtraktion: ");
// Ketten von Methoden
        z1.subtr(z2).anzeige();
        System.out.print("Ergebnis der Division: ");
        GanzeZahl.divid(z1, z2).anzeige();
        System.out.print("Ergebnis der Multiplikation: ");
        z1.multipl(z2).anzeige();
    }
    public void defRationaleZahlen() {
        RationaleZahl r1 = new RationaleZahl(
                new GanzeZahl(-1), new GanzeZahl(-5));
        r1.anzeige();
        RationaleZahl r2 = new RationaleZahl(z1,z2);
        r2.anzeige();
        System.out.print("Kuerzung von rationalen Zahlen: ");
        r1.kuerzen().anzeige();
        r2.kuerzen().anzeige();
        System.out.print("Ergebnis der Addition: ");
        RationaleZahl.add(r1, r2).anzeige();
        System.out.print("Ergebnis der Subtraktion: ");

        // Ketten von Methoden
        r1.subtr(r2).anzeige();
        System.out.print("Ergebnis der Division: ");
        RationaleZahl.divid(r1, r2).anzeige();
        System.out.print("Ergebnis der Multiplikation: ");
        r1.multipl(r2).anzeige();


    }
    // Objekte der Klasse erzeugen
    public static void main(String[] args) {
        ZahlenTest test1 = new ZahlenTest(GANZEZAHLEN, 6, -9);
        ZahlenTest test2 = new ZahlenTest(RATIONALEZAHLEN, 6, -9);

    }

}
