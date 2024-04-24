public class Wyscigowe extends Car{

    private int MaxSpeed;
    public Wyscigowe(String kolor, String marka, int maxSpeed) {
        super(kolor, marka);
        this.MaxSpeed = maxSpeed;
    }

    public void getInfo(){
        System.out.println(this.kolor + " " + this.marka +" "+ this.MaxSpeed);
    }
}
