import java.util.*;


public class Main {

    public static Map<String, Set<Integer>> skorowidzLiterowy(String tekst){
        LinkedHashMap<String, Set<Integer>> literki = new LinkedHashMap<>();
        for(int i=0;i<tekst.length();i++){
            char litera = tekst.charAt(i);
            if(!Character.isLetter(litera)){
                continue;
            }
            String Litera = Character.toString(Character.toLowerCase(litera));
            literki.putIfAbsent(Litera, new HashSet<>());
            literki.get(Litera).add(i);
        }
        return literki;
    }

//    public static Map<Character, Integer> iloscLiter(String tekst){
//        LinkedHashMap<Character,Integer> litery = new LinkedHashMap<>();
//        tekst = tekst.toLowerCase();
//        for(char x : tekst.toCharArray()){
//            if(litery.containsKey(x)){
//                litery.put(x,litery.get(x)+1);
//            }
//            else {
//                litery.put(x,1);
//
//            }
//
//        }
//        return litery;
//    }
    public static void main(String[] args) {
//        String slowo = "Barcelona";
//        Map<Character,Integer> mapa = iloscLiter(slowo);
//        System.out.println(mapa);


        String tekst = "Ala ma kota";
        Map<String, Set<Integer>> mapa = skorowidzLiterowy(tekst);

        // Wyświetlamy mapę, gdzie kluczami są litery, a wartościami zbiory ich indeksów
        System.out.print("[ ");
        for (Map.Entry<String, Set<Integer>> entry : mapa.entrySet()) {
            System.out.print(entry.getKey() + "->" + entry.getValue() + ", ");
        }
        System.out.print(" ]");


    }
}