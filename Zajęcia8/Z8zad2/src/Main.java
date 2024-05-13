import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Metoda();



    }
    public static void Metoda(){
        int[] tablica = new int[3];
        try{
            System.out.println(tablica[6]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Nie ma takiego elementu tablicy " );
        }

        int x=4;
        int y=2;
        int wynik = x+y;
        System.out.println(wynik);
    }


}