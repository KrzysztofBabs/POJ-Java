import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<Integer> liczby = new HashSet<>();
        while(liczby.size()<10){
            String input = scanner.nextLine();
            try {
                for(int i=0;i<10;i++) {
                    int liczba = Integer.parseInt(input);
                    liczby.add(liczba);
                }
            }catch(NumberFormatException e){
                System.out.println("podaj liczbe , nie litere");

            }

        }
        System.out.println(liczby);
        int suma=0;
        for(int x : liczby){
            suma = suma + x;
        }
        System.out.println("ich suma to: " + suma);



    }
}