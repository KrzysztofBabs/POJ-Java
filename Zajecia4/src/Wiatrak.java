public class Wiatrak {
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    int speed;
    boolean on;
    double radius;
    String color;

    public Wiatrak(int predkosc, boolean CzyWlaczony, double promien, String kolor) {
        this.speed = predkosc;
        this.on = CzyWlaczony;
        this.radius = promien;
        this.color = kolor;
    }
    public Wiatrak(){
        this.speed=MEDIUM;
        this.on=false;
        this.radius=5.5;
        this.color="bialy";
    }

    public String wyswietlInformacje() {
        return "Prędkość: " +this.speed + ", Włączony: " + (this.on ? "Tak" : "Nie") + ", Promień: " + this.radius + ", Kolor: " + this.color;
    }

}
