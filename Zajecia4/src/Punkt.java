public class Punkt {
    public int x;
    public int y;

    public Punkt() {
        this.x=0;
        this.y=0;

    }
    public Punkt(int d, int f){
        this.x = d;
        this.y = f;

    }
    public double ObliczOdlegoscOdPunktu(int x,int y){
        double odleglosc;
        odleglosc = Math.sqrt(((this.x-x)*(this.x-x))+((this.y-y)*(this.y-y)));
        return odleglosc;
    }
}
