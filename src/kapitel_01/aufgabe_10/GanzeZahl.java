package kapitel_01.aufgabe_10;

public class GanzeZahl {
    private int z;
    // Konstruktordefinition
    public GanzeZahl(int z) {
        this.z = z;
    }

// toString für Objekt GanzeZahlen
    @Override
    public String toString() {
        return "GanzeZahl(" + this.z + ")";
    }

    public int getZahl() {
        return this.z;
    }
    public void setZahl(int a) {
        this.z = a;
    }
    public GanzeZahl negativ() {
        this.z = -this.z;
        return this;
    }


    public boolean gleich(GanzeZahl a) {
        if(this.z == a.z) {
            return true;
        } else {
            return false;
        }
    }
    public boolean kleiner(GanzeZahl a) {
        if(this.z < a.z) {
            return true;
        } else {
            return false;
        }
    }
    public static GanzeZahl ggTeiler(GanzeZahl a,
                                     GanzeZahl b) {
// Mit den nachfolgenen Zuweisungen würde das Vorzeichen der
// Objekte, deren Referenz beim Methodenaufruf übergeben wird,
// abgeändert
// GanzeZahlen r = a;
// GanzeZahlen s = b;
// Um die ursprünglichen Objekte nicht zu verändern, werden
// Kopien von diesen erzeugt
        GanzeZahl r = new GanzeZahl(a.z);
        GanzeZahl s = new GanzeZahl(b.z);
        if(r.getZahl()<0)
            r.negativ();
        if(s.getZahl()<0)
            s.negativ();
        if(r.gleich(new GanzeZahl(0)))
            return s;
        else if(s.gleich(new GanzeZahl(0)))
            return r;
        else {
            while(!r.gleich(s)) {
                if(r.kleiner(s))
                    s = s.subtr(r);
                else
                    r = r.subtr(s);
            }
        }
        return r;
    }
    public static GanzeZahl kgVielfaches(GanzeZahl a,
                                         GanzeZahl b) {
        GanzeZahl r = new GanzeZahl(a.z);
        GanzeZahl s = new GanzeZahl(b.z);
        if(r.getZahl() < 0)
            r.negativ();
        if(s.getZahl() < 0)
            s.negativ();
        GanzeZahl t = ggTeiler(r,s);
        GanzeZahl v = r.multipl(s);
        GanzeZahl u = divid(v,t);
        return u;
    }
    public void anzeige() {
        System.out.println("Ganze Zahl: "+this.z);
    }
    public static GanzeZahl add(GanzeZahl a, GanzeZahl b) {
        return new GanzeZahl(a.z+b.z);
    }
    public GanzeZahl subtr(GanzeZahl a) {
        return new GanzeZahl(this.z - a.z);
    }
    public static GanzeZahl divid(GanzeZahl a, GanzeZahl b){
        return new GanzeZahl(a.z/b.z);
    }
    public GanzeZahl multipl(GanzeZahl a) {
        return new GanzeZahl(z*a.z);
    }

}
