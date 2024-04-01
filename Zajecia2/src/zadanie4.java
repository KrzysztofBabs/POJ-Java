import java.util.Scanner;

public class zadanie4 {
    public static void Zrobzadanie4(){
        String wyraz;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wyraz: ");
        wyraz = scanner.next();
        int a;
        a = wyraz.length();
        char[] tablica = wyraz.toCharArray();
        boolean CzyPalindrom = true;
        for(int i=0;i<a;i++){
            if(tablica[i]!=tablica[a-i-1]) CzyPalindrom = false;
            break;
        }
        if(CzyPalindrom) System.out.println("jest to palindrom");
        else System.out.println("nie jest to palindrom");
    }

}
