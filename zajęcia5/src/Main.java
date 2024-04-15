//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Karta.Zrobzadanie2();
//        Symulacja.symulacja();

//        Zawodnik zawodnik1 = new Zawodnik("Robert" , 2, 12);
//        Zawodnik zawodnik2 = new Zawodnik("Marek" , 3, 13);
//        Zawodnik zawodnik3 = new Zawodnik("Jacek" , 4, 14);
//        zawodnik1.PrzedstawSie();
//        zawodnik2.PrzedstawSie();
//        zawodnik3.PrzedstawSie();
//
//        zawodnik1.biegnij();
//        zawodnik2.biegnij();
//        zawodnik3.biegnij();

        Ulamek ulamek1 = new Ulamek(2,8);
        Ulamek ulamek2 = new Ulamek(2,6);
        Ulamek suma = ulamek2.Dodawanie(ulamek2);
        System.out.println("suma: " + suma);



    }
}