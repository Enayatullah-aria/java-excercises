package kapitel_02.aufgabe_2_10;

public class Rose extends Blumen {
    // Konstruktordefinition
    Rose() {
        super(0, ROT);
    }
    // Die Methode der Oberklasse wird überschrieben und aufgerufen
    public void identifizieren() {
        super.identifizieren();
        System.out.print("Rose");
    }
    public void wurzeln() {
        System.out.println(" und hat Wurzeln");
    }
}