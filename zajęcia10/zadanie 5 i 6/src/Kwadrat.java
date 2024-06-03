public class Kwadrat implements Figura, Comparable{
    int Bok;
    public Kwadrat(int bok) {
        this.Bok = bok;
    }
    @Override
    public int obliczPole() {
        int pole;
        pole = Bok*Bok;
        return pole;
    }
    @Override
    public int obliczObwod() {
        int obwod;
        obwod = 4*Bok;
        return obwod;
    }

    public String toString(){
        return "Kwadrat: " + obliczObwod();
    }


//    @Override
//    public int compareTo(Object o) {
//        return this.obliczPole() - ((Figura)o).obliczPole();
//    }

    @Override
    public int compareTo(Object o) {
        return Integer.compare(this.obliczPole(), ((Figura)o).obliczPole());
    }






}
