import java.util.Random;

public class Moneta {

    public static Wartosc rzut(){
        Random random = new Random();
        int x = random.nextInt(2);
        if(x==1) return Wartosc.Reszka;
        else return Wartosc.Orzel;




    }





}
