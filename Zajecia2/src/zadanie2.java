import java.util.Scanner;

public class zadanie2 {
    public static void Zrobzadanie2(){
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.print("podaj rozmiar tablicy: ");
        n = scanner.nextInt();
        int[] tablica = new int[n];
        for(int i=0;i<n;i++){
            int x;
            x = scanner.nextInt();
            tablica[i]=x;
        }
        for(int i=n-1;i>=0;i--){
            System.out.print(tablica[i] + " ");
        }
    }
}
