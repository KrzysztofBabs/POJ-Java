public class Calculator {



    public int calculate(int liczba){
        return liczba*liczba;
//        return Math.pow(liczba,2); wtedy metoda musi byc double by bylo POW2
    }

    public int calculate(int x, int liczba2){
        return x*liczba2;
    }

    public int calculate(int a, int liczba2, int liczba3){
        return a + liczba2 + liczba3;
    }

}
