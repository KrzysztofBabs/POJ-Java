//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String[] ksiazki = {"Quo Vadis" , "Rok 1984"};
        String[] chleby = {"pszenny", "zytni"};


//        nawiazanie do budowania tablicy u gory, ze mozna tutaj inicjowac zmienne!
        int a=50;
        String ulica = "Złota 1";

        Bookshop ksiegarnia = new Bookshop(ulica, a, ksiazki);
        Bakery piekarnia = new Bakery("Zielona 1", 40, chleby);
        ksiegarnia.getInformation();
        piekarnia.getInformation();






    }
}