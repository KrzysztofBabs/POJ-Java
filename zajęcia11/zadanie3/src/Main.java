import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;


public class Main {

    public static Map<String,Integer> zliczWystapieniaSlow(String tekst){
        tekst = tekst.replaceAll("[^a-zA-Z0-9\\s]", "");

        LinkedHashMap<String,Integer> slowo = new LinkedHashMap<>();
        String[] words = tekst.split("\\s+");
        for(String word : words){
            if(slowo.containsKey(word)){
                slowo.put(word , slowo.get(word)+1);
            }
            else{
                slowo.put(word,1);
            }
        }
        return slowo;
    }

    public static void main(String[] args) {

        String zdanie = "Ala ma kota, kot ma Ale";
        String zdanie1 = "Barcelona to najlepszy klub , a Real to najgorszy klub !";
        Map<String,Integer> mapa = zliczWystapieniaSlow(zdanie1);

        System.out.println(mapa);


    }
}