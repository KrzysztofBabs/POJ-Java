import java.util.Scanner;

public class Main {
    public static int znajdzMinElement(int[]t){
        int min=22222222;
        for(int i=0;i<t.length;i++) {
            if(t[i]<min) min=t[i];
        }
        System.out.print("najmeniejszy element tablicy to: ");
        return min;
    }

    public static int znajdzMaxElement(int[]t){
        int max=0;
        for(int i=0;i<t.length;i++){
            if(t[i]>max) max=t[i];
        }
        System.out.print("najwiekszy element tablicy to: ");
        return max;
    }

    public static int ObliczSume(int[]t){
        int suma=0;
        for(int i=0;i<t.length;i++){
            suma=suma+t[i];
        }
        System.out.print("suma wynosi: ");
        return suma;
    }

    public static double ObliczSrednia(int[]t){
        double suma=0;
        double srednia;
        for(int i=0;i<t.length;i++){
            suma = suma+t[i];
        }
        srednia=suma/t.length;
        System.out.print("srednia wynosi: ");
        return srednia;
    }

    public static void ObliczMediane(int[]t){
        if((t.length)%2!=0) System.out.println("mediana wynosi: " + t[(t.length/2)]);
        if(t.length%2==0) System.out.println("mediana wynosi: " + (t[t.length/2]+t[(t.length/2)-1])/2.0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x;
        System.out.print("Podaj wielkosc tablicy: ");
        x = scanner.nextInt();
        int[] tablica = new int[x];
        int y;
        System.out.print("Podaj wartosc pierwszego elementu: ");
        y = scanner.nextInt();
//        System.out.println(y);
        tablica[0]=y;
        for(int i=0;i<x;i++){
            tablica[i]=y++;
            if(tablica[i]%2==0)y++;
            System.out.println(tablica[i]);
        }
        System.out.println(znajdzMinElement(tablica));
        System.out.println(znajdzMaxElement(tablica));
        System.out.println(ObliczSume(tablica));
        System.out.println(ObliczSrednia(tablica));
        ObliczMediane(tablica);

    }


}