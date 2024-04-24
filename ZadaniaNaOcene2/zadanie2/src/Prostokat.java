public class Prostokat {

    private int bok1;
    private int bok2;

    public  Prostokat(int a, int b){
        this.bok1 = a;
        this.bok2 = b;

    }

    public Prostokat(int a){
        this.bok1=a;
        this.bok2=a;
    }

    public int PoliczObwod(){
        int obwod;
        obwod = 2*this.bok1 + 2*this.bok2;

        return obwod;

    }

    public int PoliczPole(){
        int pole;
        pole = this.bok1 * this.bok2;
        return pole;
    }




}
