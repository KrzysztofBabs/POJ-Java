import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class Main {
    public static List<Integer> wyswietlDuplikaty(List<Integer> l){
        List<Integer> Duplikaty = new ArrayList<>();
        Set<Integer> liczby = new HashSet<>();
        for(Integer i : l){
            if(liczby.contains(i)){
                Duplikaty.add(i);
            }
            else{
                liczby.add(i);
            }
        }
        return Duplikaty;
    }

    public static Set<Integer> usunDuplikaty(Set<Integer> set) {
//        List<Integer> BezDuplikatow = new ArrayList<>();
        Set<Integer> liczby = new HashSet<>();
        for (Integer i : set) {
            if(liczby.contains(i)) {
                liczby.remove(i);
            }
            else{
                liczby.add(i);
            }

        }
        return liczby;
    }

    public static List<Integer> UsunDuplikaty(List<Integer> lista) {
        List<Integer> BezDuplikatow = new ArrayList<>();
        Set<Integer> liczby = new HashSet<>();
        for(Integer i : lista){
            if(!liczby.contains(i)){
                BezDuplikatow.add(i);
                liczby.add(i);
            }
            else{
                liczby.add(i);
            }




        }
        return BezDuplikatow;
    }
    public static void main(String[] args) {
        List<Integer> Lista = new ArrayList<>();
        Lista.add(1);
        Lista.add(2);
        Lista.add(2);
        Lista.add(3);
        Lista.add(3);
        Lista.add(4);
        Lista.add(5);
        Lista.add(5);
        Lista.add(6);
        Lista.add(6);
        System.out.println(wyswietlDuplikaty(Lista));
        System.out.println();

        Set<Integer> Set = new HashSet<>();
        Set.add(1);
        Set.add(2);
        Set.add(2);
        Set.add(3);
        Set.add(3);
        Set.add(4);
        Set.add(4);
        Set.add(5);
        Set.add(5);
        Set.add(6);
        System.out.println(usunDuplikaty(Set));
        System.out.println();


        System.out.println(UsunDuplikaty(Lista));



    }
}