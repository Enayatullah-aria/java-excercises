package kapitel_01.aufgabe_10;

public class RationaleZahl {
    // Globale Referenzen vom Typ der Klasse GanzeZahlen
    private GanzeZahl zähler, nenner;
    // Konstruktordefinition
    public RationaleZahl(GanzeZahl zaehler, GanzeZahl nenner) {
        this.zähler = zaehler;
        this.nenner = nenner;
    }
    @Override
    public String toString() {
        return "RationaleZahl(" + " Zähler: " + this.zähler
                   + ", Nenner: " + this.nenner + ")";
    }
    public GanzeZahl getZaehler() {
        return zähler;
    }
    public GanzeZahl getNenner() {
        return nenner;
    }
    public void setZaehler(GanzeZahl a) {
        zähler = a;
    }
    public void setNenner(GanzeZahl b) {
        nenner = b;
    }
    public void anzeige() {
        // System.out.println("Rationale Zahl: "+ zähler.getZahl() + "/" + nenner.getZahl());
        System.out.println(this);
    }
// Da beim Kürzen der Erhalt des ursprünglichen Objektes nicht
// erforderlich ist, werden die Änderungen im aktuellen Objekt
// durchgeführt und dieses wird auch zurückgegeben
    public RationaleZahl kuerzen() {
// Lokale Referenz vom Typ der Klasse GanzeZahlen
        GanzeZahl t = GanzeZahl.ggTeiler(zähler, nenner);
        zähler = GanzeZahl.divid(zähler,t);
        nenner = GanzeZahl.divid(nenner,t);
        return this;
    }
    public static RationaleZahl add(RationaleZahl a,
                                    RationaleZahl b) {
        GanzeZahl gNenner = GanzeZahl.kgVielfaches(a.nenner, b.nenner);
        return new RationaleZahl(GanzeZahl.add(
                GanzeZahl.divid(gNenner,a.nenner).multipl(a.zähler),
                GanzeZahl.divid(gNenner,b.nenner).multipl(b.zähler)),gNenner);
    }
    public RationaleZahl subtr(RationaleZahl a) {
        GanzeZahl gNenner = GanzeZahl.kgVielfaches(this.nenner, a.nenner);
        return new RationaleZahl(((GanzeZahl.divid(
                gNenner,this.nenner)). multipl(this.zähler)). subtr((
                GanzeZahl.divid(gNenner,a.nenner)).multipl(a.zähler)), gNenner);
    }
    public static RationaleZahl divid(RationaleZahl a,
                                      RationaleZahl b) {
        return new RationaleZahl((a.zähler).multipl(b.nenner),
                (a.nenner).multipl(b.zähler));
    }
    public RationaleZahl multipl(RationaleZahl a) {
        return new RationaleZahl(zähler.multipl(a.zähler), nenner.multipl(a.nenner));
    }

}
