

import java.util.Scanner;

public class zadanie4{
    public static void PodajWyraz(String wyraz) {

    }
    public static void ZrobZadanie4() {
        Scanner scanner = new Scanner(System.in);
        String Wyraz = scanner.next();
        int a = Wyraz.length();
        System.out.print("Wyraz od tylu: ");

        for(int i=a-1;i>=0;i--) {
            System.out.print(Wyraz.charAt(i));
        }

        zadanie4.PodajWyraz(Wyraz);
    }
}

