public class Ulamek {
    private int Licznik;
    private int Mianownik;

    public Ulamek(int licznik, int mianownik){
        this.Licznik = licznik;
        this.Mianownik = mianownik;

    }

    private int nwd(int a,int b){
        while(b!=0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public void skroc(){
        int y = nwd(Licznik, Mianownik);
        Licznik = Licznik/y;
        Mianownik = Mianownik/y;
    }
    public Ulamek Dodawanie(Ulamek inny){
        int nowyLicznik=(this.Licznik * inny.Mianownik + inny.Licznik * this.Mianownik);
        int nowyMianownik=(this.Mianownik* inny.Mianownik);
        Ulamek wynik = new Ulamek(nowyLicznik, nowyMianownik);
//        wynik.skroc();
        return wynik;
    }
    public String toString(){
        return Licznik + "/" + Mianownik;

    }

}
