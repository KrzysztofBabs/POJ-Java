import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void zliczSamogloskiISpolgloski(String tekst) {
        Map<Character, Integer> zliczenia = new HashMap<>();
        String samogloski = "aeiou";


        for (char znak : tekst.toLowerCase().toCharArray()) {
            if (Character.isLetter(znak)) {
                if (samogloski.contains(String.valueOf(znak))) {
                    if (zliczenia.containsKey(znak)) {
                        zliczenia.put(znak, zliczenia.get(znak) + 1);
                    } else {
                        zliczenia.put(znak, 1);
                    }
                } else {
                    if (zliczenia.containsKey(znak)) {
                        zliczenia.put(znak, zliczenia.get(znak) + 1);
                    } else {
                        zliczenia.put(znak, 1);
                    }
                }
            }
        }
        int liczbaSamoglosek = 0;
        int liczbaSpolglosek = 0;
        for (char znak : zliczenia.keySet()) {
            if (samogloski.contains(String.valueOf(znak))) {
                liczbaSamoglosek += zliczenia.get(znak);
            } else {
                liczbaSpolglosek += zliczenia.get(znak);
            }
        }

        System.out.println("Liczba samogłosek: " + liczbaSamoglosek);
        System.out.println("Liczba spółgłosek: " + liczbaSpolglosek);
    }

    public static void main(String[] args) {
        String tekst = "Ala ma kota";
        zliczSamogloskiISpolgloski(tekst);
    }
}
