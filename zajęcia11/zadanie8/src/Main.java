import java.util.*;


public class Main {
    public static LinkedHashSet<Character> ZwrocUnikatowe(String tekst){
        LinkedHashSet<Character> znaki = new LinkedHashSet<>();
        for(char literka : tekst.toCharArray()){
            znaki.add(literka);
        }
        return znaki;
    }
    public static List<Character> metoda(String tekst){
        List<Character> litery = new ArrayList<>();
        for(char literka : tekst.toCharArray()){
            litery.add(literka);
        }
        return litery;

    }
    public static void main(String[] args) {
        String wyraz = "Barcelonab";
        LinkedHashSet<Character> unikalne = ZwrocUnikatowe(wyraz);
        System.out.println(unikalne);

        List<Character> unikal = metoda(wyraz);
        System.out.println(unikal);



    }
}