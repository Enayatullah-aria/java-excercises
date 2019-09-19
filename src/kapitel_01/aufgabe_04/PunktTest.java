package kapitel_01.aufgabe_04;

public class PunktTest {
    public static void main(String[] args) {
        Punkt punktA = new Punkt();
        punktA.anzeige();

        Punkt punktB = new Punkt(3.0, 5.0);
        punktB.anzeige();
        System.out.println("x: " + punktA.getX());
        System.out.println("y: " + punktA.getY());
        System.out.println("x: " + punktB.getX());
        System.out.println("y: " + punktB.getY());
    }

}
