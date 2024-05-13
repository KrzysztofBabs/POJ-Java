public class Osoba {
    String Imie;
    String Nazwisko;
    int RokUrodzenia;

    public Osoba(String imie, String nazwisko, int rokUrodzenia) {
        this.Imie = imie;
        this.Nazwisko = nazwisko;
        this.RokUrodzenia = rokUrodzenia;
    }

    @Override
    public String toString() {
        return this.Imie + " " + this.Nazwisko + " " + this.RokUrodzenia;
     }


}
