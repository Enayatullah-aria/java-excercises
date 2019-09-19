package kapitel_01.aufgabe_05;

public class QuadratDefinition {
    private int a;
    // Konstruktordefinition
    public QuadratDefinition(int x) {
        a = x;
    }
    // Instanzmethode zum Berechnen des Flächeninhaltes
    public int flaeche() {
        return a * a;
    }
    // Gleichnamige Klassenmethode zum Berechnen des Flächeninhaltes
    public static int flaeche(QuadratDefinition q) {
        return q.a*q.a;
    }
    public void anzeige(){
        System.out.println(this);
    }
}
