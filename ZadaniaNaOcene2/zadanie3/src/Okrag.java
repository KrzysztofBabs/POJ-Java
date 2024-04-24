public class Okrag {
    private Punkt punkt;
    private double Promien;

    public Okrag(Punkt punkt, double promien){
        this.punkt = punkt;
        this.Promien = promien;

    }

    public boolean CzyJest(Punkt P){
        double odleglosc;
        odleglosc = Math.sqrt((Math.pow(this.punkt.x - P.x,2)) + (Math.pow(this.punkt.y-P.y,2)));
        if(odleglosc<Promien) return  true;
        else return false;



    }

}
