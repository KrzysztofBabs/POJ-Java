public class Zawodnik {
    private String klub;
    protected String pozycja;
    protected int numer;
    protected String liga;
    protected String narodowosc;

    public Zawodnik(String klub, String pozycja, int numer, String liga, String narodowosc){
        this.klub = klub;
        this.pozycja = pozycja;
        this.numer = numer;
        this.liga = liga;
        this.narodowosc = narodowosc;
    }

    public String toString(){
        return this.klub + " "+ this.liga + " " + this.narodowosc + " " + this.pozycja + " " +this.numer;

    }
}
