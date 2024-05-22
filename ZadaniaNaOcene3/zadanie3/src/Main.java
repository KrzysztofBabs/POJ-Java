//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        StringUtils o = new StringUtils();
        System.out.println(o.encrypt("abc", 1));



        StringUtils x = new StringUtils();
        try {
            String odwroconyWyraz = x.OdwrocString("");
            System.out.println("Odwrocony wyraz: " + odwroconyWyraz);
        } catch (StringTakiSam e) {
            System.out.println("Błąd: " + e.getMessage());
        } catch(PustyString e){
            System.out.println("Bląd: " + e.getMessage());
        }
        System.out.println();


        StringUtils y = new StringUtils();
        try{
             String zmieniony = y.NaMale("Tata");
            System.out.println("zmieniony wyraz to: " + zmieniony);
        }catch(StringTakiSam e){
            System.out.println("Bład: " + e.getMessage());
        }catch(PustyString e){
            System.out.println("Błąd: " + e.getMessage());
        }


    }
}