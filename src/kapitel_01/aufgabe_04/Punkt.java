package kapitel_01.aufgabe_04;

public class Punkt {
    // InstanzFelder
    private double x;
    private double y;
    //Konstruktor
    public Punkt (double x, double y){
        this.x = x;
        this.y = y;
    }
    public Punkt (){
        this(0.0, 0.0);
    }

    public void setX(double x){
        // zuweisung
        this.x = x;
    }

    public void setY(double y){
        this.y = y;
    }

    public double getX(){

        return this.x;
    }
    public double getY(){
        return this.y;

    }

    public void anzeige(){
        System.out.println(this);
    }

    public String toString(){
        return new String("Punkt(" + "x: " + x + "," + "y:" + y + ")" );
    }
}
