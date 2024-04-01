import java.util.Arrays;
import java.util.Scanner;

public class zadanie1 {
    public static void ZrobZadanie1(){
        Scanner scanner = new Scanner(System.in);
        int a;
        int b;
        System.out.print("Podaj rozmiar 1 tablicy: ");
        a = scanner.nextInt();
        System.out.print("Podaj rozmiar 2 tablicy: ");
        b = scanner.nextInt();
        if(a!=b) {
            System.out.println("[]");
            return;
        }
        int[] tablica1 = new int[a];
        int[] tablica2 = new int[b];
        int[] tablica3 = new int[a];
        for(int i=0;i<a;i++){
            System.out.print("podaj " + (i+1) + " element tablicy1: ");
            tablica1[i]= scanner.nextInt();
        }
        for(int i=0;i<a;i++){
            System.out.print("podaj " + (i+1) + " element tablicy2: ");
            tablica2[i]= scanner.nextInt();
        }

        for(int i=0;i<a;i++) {
            tablica3[i]=tablica1[i]+tablica2[i];
        }
            System.out.println(Arrays.toString(tablica3));
        }


        }




