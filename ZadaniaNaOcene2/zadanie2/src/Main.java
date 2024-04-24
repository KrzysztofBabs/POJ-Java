//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Prostokat prostokat1 = new Prostokat(2,3);
        Prostokat prostokat2 = new Prostokat(4);

        System.out.println(prostokat1.PoliczObwod());
        System.out.println(prostokat1.PoliczPole());
        System.out.println(prostokat2.PoliczObwod());
        System.out.println(prostokat2.PoliczPole());




    }
}