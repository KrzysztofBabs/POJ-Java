public class Prostokat extends Figura2D{
    public Prostokat(int[] tablica) {
        super(tablica);
    }

    @Override
    public double ObliczPole() {
//        return super.ObliczPole();
        double pole;
        pole = Tablica[0] * Tablica[1];
        return pole;
    }


    @Override
    public int ObliczObwod() {
        return super.ObliczObwod();
    }
}
