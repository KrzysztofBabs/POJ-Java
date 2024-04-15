import java.util.Scanner;

public class Symulacja {
    public static void symulacja(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("podaj ilosc prob: ");
        int ilosc = scanner.nextInt();
        double orly=0;
        double reszki=0;
        for(int i=0;i<ilosc;i++) {
            if (Moneta.rzut() == Wartosc.Orzel) orly++;
            else reszki++;
        }
        double ProcentSzansO = Math.round((orly/ilosc)*100);
        double ProcentSzansR = Math.round((reszki/ilosc)*100);

        System.out.println("Procent szans na orla: " + ProcentSzansO + "%");
        System.out.println("Procent szans na reszke: " + ProcentSzansR + "%");
        System.out.println("dla " + ilosc + " rzutow");








    }
}
