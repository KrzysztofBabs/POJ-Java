public class Miejskie extends Car{
    private int IloscMiejsc;
    public Miejskie(String kolor, String marka, int iloscMiejsc) {
        super(kolor, marka);
        this.IloscMiejsc = iloscMiejsc;
    }
    public void getInfo(){
        System.out.println(this.kolor + " " + this.marka + " "+ this.IloscMiejsc);
    }
}
