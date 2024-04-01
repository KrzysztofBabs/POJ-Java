import java.util.Scanner;

public class zadanie1 {
    public static void Zrobzadanie1(){
        Scanner scanner = new Scanner(System.in);
        double r;
        System.out.println("Podaj promien: ");
        r = scanner.nextDouble();
        double pole;
        double obwod;
        pole = Math.PI*r*r;
        obwod = 2*r*Math.PI;
        System.out.println("pole wynosi: " + pole);
        System.out.println("obwod wynosi: " + obwod);

    }
}
