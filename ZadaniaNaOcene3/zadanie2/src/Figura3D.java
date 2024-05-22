public class Figura3D extends Figura{
    public Figura3D(int[] tablica) {
        super(tablica);
    }

    @Override
    public double ObliczPole() {
        double pole;
        pole = 2*Tablica[0]*Tablica[1] + 2*Tablica[0]*Tablica[2] + 2*Tablica[1]*Tablica[2];
        return pole;
    }

    @Override
    public int ObliczObwod() {
        int obwod;
        obwod = 4*Tablica[0] + 4*Tablica[1] + 4*Tablica[2];
        return obwod;
    }

    public double ObliczObjetosc(){
        double objetosc;
        objetosc = Tablica[0] * Tablica[1] * Tablica[2];
        return objetosc;
    }
}
