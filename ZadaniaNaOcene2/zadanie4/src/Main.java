//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Kalkulator kalkulator = new Kalkulator();
        kalkulator.obliczCene(Ulga.ulgowy, Czas.dobowy);
        kalkulator.obliczCene(Ulga.ulgowy, Czas.godzinny);
        kalkulator.obliczCene(Ulga.normalny, Czas.jednorazowy);
        kalkulator.obliczCene(Ulga.normalny, Czas.dobowy);






    }
}