public class Karta {
    private Figura figura;
    private Kolor kolor;

    public Karta(Figura f, Kolor k){
        this.kolor = k;
        this.figura = f;
    }

    public String toString(){

         return figura + " " + kolor;

    }
    public static void Zrobzadanie2(){
        Figura[] figura = Figura.values();
        Kolor[] kolor = Kolor.values();

        for(int i=0;i< figura.length;i++){
            for(int j=0;j< kolor.length;j++){
                Karta karta = new Karta(figura[i],kolor[j]);
                System.out.println(karta);
            }
        }

    }

}
