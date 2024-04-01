public class Kwadrat{
    int bok;
    public Kwadrat(int bokk){
        this.bok = bokk;
    }
    public int ObliczPole(){
        int pole;
        pole = this.bok*this.bok;
        return pole;
    }
    public int ObliczObwod(){
        int obwod;
        obwod = this.bok*4;
        return obwod;
    }
}
