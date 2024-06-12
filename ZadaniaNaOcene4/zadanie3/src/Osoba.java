public class Osoba implements Comparable <Object>{

    String Imie;
    String Nazwisko;
    public Osoba(String imie, String nazwisko) {
    this.Imie = imie;
    this.Nazwisko = nazwisko;
    }
    public String toString(){
        return this.Imie + " " + this.Nazwisko;}
    @Override
    public int compareTo(Object o) {
        Osoba c = (Osoba) o;
        return (c.Nazwisko).compareTo(this.Nazwisko);}


}
