package kapitel_01.aufgabe_07;

public class VektorTest {

    public static void main(String[] args) {


        //---
        Vektor vektorA = new Vektor(50, 60, 70);
        Vektor vektorB = vektorA.neu(50, 30, 30);

        System.out.println("vektorA" + " " + vektorA);
        System.out.println("vektorA vergleichen:  vektorA.equals(vektorB) " + vektorA.equals(vektorB));
        System.out.println(vektorA.toString());
        System.out.println(vektorB.toStringObject());

    }

//---------------------
    void nichtBenutzterCode() {
        System.out.print("Ursprung: ");
        Vektor.Ursprung.anzeige();
        System.out.println();

        System.out.println("Ursprung: " + Vektor.Ursprung );
        System.out.println();

        System.out.println("Einheitsvektor: " + Vektor.Einheitsvektor );
        System.out.println();

        // Erzeugen von Vektor-Objekten mit den unterschiedlichen
// Konstruktoren
        Vektor v1 = new Vektor();
        v1.anzeige();
        Vektor v2 = new Vektor(1,1,1);
        v2.anzeige();
        Vektor v3 = new Vektor(v2);
        v3.anzeige();

// Erzeugen eines neuen Vektor-Objektes durch Veränderung des
// aufrufenden Objektes
        Vektor vneu = v1.neu(3,3,3);
        v1.anzeige();
        vneu.anzeige();
// oder
        v1 = new Vektor();
        Vektor vcopy = v1.neu(new Vektor(3,3,3));
        v1.anzeige();
        vcopy.anzeige();
// Erzeugen eines neuen Vektor-Objektes durch Beibehalten des
// aufrufenden Objektes
        v1 = new Vektor();
        Vektor vneu1 = v1.neu1(3,3,3);
        v1.anzeige();
        vneu1.anzeige();

        // System.out.println("Vergleiche vneu und v1:", vneu.equals(v1).toString());
    }

}
