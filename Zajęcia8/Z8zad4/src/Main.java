import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TworzenieOsoby();
    }
    public static Osoba TworzenieOsoby() {
        Scanner scanner = new Scanner(System.in);
        String Imie = scanner.nextLine();
        String Nazwisko = scanner.nextLine();
        int RokUrodzenia = scanner.nextInt();
        Osoba osoba = new Osoba(Imie, Nazwisko, RokUrodzenia);

        try {
            if (Imie.isEmpty()) {
//                System.out.println("puste pole imienia");
                throw new IllegalArgumentException("Podano niewlasciwe imie!");
            }
            if (Nazwisko.isEmpty()) {
//                System.out.println("pusty pole nazwiska");
                throw new IllegalArgumentException("Podano niewlasciwe nazwisko!");
            }
            if(RokUrodzenia < 1900 || RokUrodzenia > 2021) {
//                System.out.println("Podano niewlasciwy rok urodzenia!");
                throw new IllegalArgumentException("Podano niewlasciwy rok urodzenia!");
            }

            System.out.println(osoba);

        } catch (IllegalArgumentException e) {
            System.out.println("nie udalo sie stworzyc osoby, " + e.getMessage());
            System.out.println("Wprowadz dane jeszcze raz.");
            osoba = TworzenieOsoby();
        }
        return osoba;
    }

}