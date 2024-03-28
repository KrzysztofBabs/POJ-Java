
import java.util.Random;
import java.util.Scanner;

public class zadanie6{
    public static void ZrobZadanie6() {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int suma = 0;
        System.out.print("podaj rozmiar tablicy: ");
        int x = scanner.nextInt();
        int[] tablica = new int[x];

        for(int i=0;i<x;i++) {
            tablica[i] = rand.nextInt(10);
            System.out.print(tablica[i] + " ");
            suma += tablica[i];
        }

        System.out.println();
        if(suma%5==0) System.out.println("true");
         else System.out.println("false");

    }
}

