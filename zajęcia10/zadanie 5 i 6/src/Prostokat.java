public class Prostokat implements Figura, Comparable{
    int Bok1;
    int Bok2;

    public Prostokat(int bok1, int bok2) {
        this.Bok1 = bok1;
        this.Bok2 = bok2;
    }

    @Override
    public int obliczPole() {
        int pole;
        pole = Bok1*Bok2;
        return pole;

    }
    @Override
    public int obliczObwod() {
        int obwod;
        obwod = 2*Bok1 + 2*Bok2;
        return obwod;

    }
    public String toString(){
        return "Prostokat: " + obliczObwod();
    }


    @Override
    public int compareTo(Object o) {
        return this.obliczPole() - ((Figura) o).obliczPole();
    }
}
