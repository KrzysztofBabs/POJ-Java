abstract public class Figura {
    abstract public double ObliczPole();
    abstract public int ObliczObwod();

    int[] Tablica;
    public Figura(int[] tablica) {
        for(int bok : tablica){
            if(bok<=0){
                throw new IllegalArgumentException("Bok nie moze bok byc mniejszy lub rowny 0");
            }
        }
        this.Tablica = tablica;
    }
}
