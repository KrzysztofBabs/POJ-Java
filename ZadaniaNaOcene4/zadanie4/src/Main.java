import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static Map<String,Integer> iloscSamoglosek(String tekst) {
        tekst = tekst.toLowerCase();
        Map<String, Integer> mapa = new HashMap<>();
        String samogloski = "aeouiy";
        for(char x : samogloski.toCharArray()){
            mapa.put(String.valueOf(x),0);
        }
        for(int i=0;i<tekst.length();i++){
            char y = tekst.charAt(i);
            String a = String.valueOf(y);
            if(mapa.containsKey(a)){
                mapa.put(a,mapa.get(a)+1);
            }
        }
        return mapa;
    }
    public static int liczenie(Map<String,Integer> mapa){
        int ilosc =0;for(int x : mapa.values()){
            ilosc = ilosc + x;
        }
        return ilosc;
    }
    public static void main(String[] args) {
        String zdanie;zdanie = "Ala ma kota";
        Map<String, Integer> mapa = iloscSamoglosek(zdanie);
        System.out.println("ilosc samoglosek to: " + liczenie(mapa));
        System.out.println();
        for(Map.Entry<String, Integer> entry : mapa.entrySet()){
            if (entry.getValue() > 0){
                System.out.println(entry.getKey() + " -> " + entry.getValue());}}

    }
}