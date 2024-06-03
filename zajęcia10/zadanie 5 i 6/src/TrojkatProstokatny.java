public class TrojkatProstokatny implements Figura,Comparable {
    int Bok3;
    int Bok4;
    int Bok5;

    public TrojkatProstokatny(int bok3, int bok4, int bok5) {
        this.Bok3 = bok3;
        this.Bok4 = bok4;
        this.Bok5 = bok5;
    }

    @Override
    public int obliczPole() {
        int pole;
        pole = Bok3*Bok4/2;
        return pole;

    }
    @Override
    public int obliczObwod() {
        int obwod;
        obwod = Bok3+Bok4+Bok5;
        return obwod;

    }
    public String toString(){
        return "TP: " + obliczObwod();
    }


    @Override
    public int compareTo(Object o) {
        return this.obliczPole() - ((Figura) o).obliczPole();

    }



}
