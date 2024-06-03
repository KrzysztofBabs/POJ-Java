import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        Set<Integer> liczby = new HashSet<>();

            while(liczby.size()<6){
                String input = scanner.nextLine();
                try{
                    int liczba = Integer.parseInt(input);
                    if (liczba < 1|| liczba > 49) {
                        System.out.println("Liczba poza zakresem. Podaj liczbę z zakresu 1-49.");
                    } else {
                        if(!liczby.contains(liczba)) {
                            liczby.add(liczba);
                        } else {
                            System.out.println("Ta liczba już została podana. Podaj inną liczbę.");
                        }
                    }
                } catch (NumberFormatException e) {
                    System.out.println("podaj liczbe, nie litere");
                }

            }
        System.out.println("twoje liczby to: " + liczby);


        Set<Integer> LosoweLiczby = new HashSet<>();
        while(LosoweLiczby.size()<6){
            int losowa = random.nextInt(50);
            if(losowa < 1 ){
                LosoweLiczby.remove(losowa);
            }
            else LosoweLiczby.add(losowa);
        }
        System.out.println("wylosowane liczby to: " + LosoweLiczby);
        System.out.println();


        Set<Integer> wspolneLiczby = new HashSet<>(liczby);
        if(wspolneLiczby.retainAll(LosoweLiczby)) {
            System.out.println("liczby ktore sie pokrywaja to: " + wspolneLiczby);
        }
        System.out.println("jest ich " + wspolneLiczby.size());







    }
}