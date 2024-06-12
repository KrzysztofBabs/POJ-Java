import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Osoba osoba1 = new Osoba("Kamil", "Klemiato");
        Osoba osoba2 = new Osoba("Leo", "Messi");
        Osoba osoba3 = new Osoba("Piotr", "Nowak");
        Osoba osoba4 = new Osoba("Robert", "Lewandowski");
        Osoba osoba5 = new Osoba("Kamil", "Stoch");
        Osoba osoba6 = new Osoba("Karol", "Angielski");

        Osoba[] tablica = {osoba1, osoba2, osoba3,osoba4,osoba5,osoba6};
        System.out.println("Bez sortowania: ");
        for(int i=0;i<6;i++){
            System.out.println(tablica[i].toString());}
        System.out.println();

        System.out.println("Posortowane wedlug nazwisk, odwrotnie do alfabetu: ");
        Arrays.sort(tablica);
        for(int i = 0; i<6; i++) {
            System.out.println(tablica[i].toString());
        }

    }
}