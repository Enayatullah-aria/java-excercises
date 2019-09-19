package kapitel_01.aufgabe_03;

public class FeldZugriffe {

    // Klassenfeld

    // Instanzfeld hängt an jedem Object.
    private int zahlerAlsInstanzfeld;

    // Instanzfeld
    int zaehlerAlsInstanzfeld;
    // Klassenfeld
    static private int zaehlerAlsKlassenfeld;
    // Konstruktordefinition
    FeldZugriffe() {
        zaehlerAlsKlassenfeld++;
        zaehlerAlsInstanzfeld++;
    }
    // Konstuktor


    public static void main(String[] args) {
	    System.out.println("Yes, it works.");
	    printThema();
    }

    // Wird als Instanzmethode gelesen, wenn der Modifikator `static`fehlt.
    static void printThema() {
        StringBuffer thema = new StringBuffer();
        thema.append("Das Thema");
        thema.append("\n");
        thema.append("Man kann eine Klasse benutzen, ohne sie zu instanzieren.");
        System.out.println(thema.toString());
    }


    // instanzmethoden, haben direkten zugriff auf instanz- und
    // klassenfelder
    public void anzeigeinstmeth() {
        System.out.print("zaehler als instanzfeld: "
             +  this.zahlerAlsInstanzfeld);
    // zeilenumbruch ausgeben
        System.out.println();
        System.out.print("zaehler als klassenfeld: "
                + FeldZugriffe.zaehlerAlsKlassenfeld);
// innerhalb der klasse kann auf den klassennamen verzichtet
// werden
        System.out.print("*"+ FeldZugriffe.zaehlerAlsKlassenfeld);
        System.out.println();
    }
    // klassenmethoden haben direkten zugriff auf klassenfelder,
// darin können nur die instanzfelder eines erzeugten objektes
// der klasse angesprochen werden
    public static void anzeigeklsmeth() {
        System.out.print("zaehler als klassenfeld: "
                + FeldZugriffe.zaehlerAlsKlassenfeld);
        System.out.print("*"+FeldZugriffe.zaehlerAlsKlassenfeld);
// zeilenumbruch
        System.out.println();
// System.out.println(zaehleralsinstanzfeld); // fehler
// instanz vom typ der klasse erzeugen
        FeldZugriffe t = new FeldZugriffe();
        System.out.print("zaehler als instanzfeld: "
                + t.zahlerAlsInstanzfeld);
        System.out.print("*"+t.zahlerAlsInstanzfeld);
    }


}