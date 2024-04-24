public class Sportowe extends Car{
    private int IloscDrzwi;

    public Sportowe(String kolor, String marka, int iloscDrzwi) {
        super(kolor, marka);
        this.IloscDrzwi = iloscDrzwi;
    }
    public void getInfo(){
        System.out.println(this.kolor + " " + this.marka +" "+ this.IloscDrzwi);
    }
}
