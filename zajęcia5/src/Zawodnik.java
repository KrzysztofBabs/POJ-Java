import java.util.Random;

public class Zawodnik {
    private String Imie;
    private int MinSpeed;
    private int MaxSpeed;
    private int Odleglosc;

    public Zawodnik(String imie, int minSpeed, int maxSpeed){
        this.Imie=imie;
        this.MinSpeed=minSpeed;
        this.MaxSpeed=maxSpeed;
        this.Odleglosc=0;

    }

    public void PrzedstawSie(){
        System.out.println("Jestem " + this.Imie + " biegam z predkoscia " + this.MinSpeed + "-" + this.MaxSpeed + " km/h.");
        }

    public void biegnij(){
        Random random = new Random();
        int dystans = random.nextInt(20)+1;
        this.Odleglosc += dystans;
        System.out.println("Jestem " + this.Imie + " przebieglem " + this.Odleglosc + " km.");

    }

    }



