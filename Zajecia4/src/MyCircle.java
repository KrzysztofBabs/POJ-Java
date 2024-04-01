public class MyCircle {
    int radius;

    public MyCircle(int promien){
        this.radius=promien;
    }
    public double ObliczObwod(){
        double obwod;
        obwod = Math.PI*2*this.radius;
        return obwod;
    }
    public double ObliczPole(){
        double pole;
        pole = Math.PI*this.radius*this.radius;
        return pole;
    }
    public double ObliczSrednice(){
        double srednica;
        srednica = 2*this.radius;
        return srednica;
    }
}
