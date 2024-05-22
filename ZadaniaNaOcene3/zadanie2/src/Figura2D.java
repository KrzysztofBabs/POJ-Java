public class Figura2D extends Figura{

    public Figura2D(int[] tablica) {
        super(tablica);
    }

    @Override
    public double ObliczPole() {
        double pole;
        pole = Tablica[0]*Tablica[1];
        return pole;
    }

    @Override
    public int ObliczObwod() {
        int obwod;
        obwod = Tablica[0]+Tablica[1]+Tablica[2]+Tablica[3];
        return obwod;
    }
}
