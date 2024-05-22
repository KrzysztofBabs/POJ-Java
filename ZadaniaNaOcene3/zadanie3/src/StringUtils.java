public class StringUtils {
    public String OdwrocString(String wyraz) throws StringTakiSam, PustyString {

        if(wyraz.isEmpty()){
            throw new PustyString("String jest pusty");
        }
        StringBuilder a = new StringBuilder(wyraz);
        String zmieniony =  a.reverse().toString();
        if(zmieniony.equals(wyraz)){
            throw new StringTakiSam("Odwrocony wyraz jest taki sam jak pierwotny");
        }


        return zmieniony;
     }



    public String NaMale(String wyraz) throws StringTakiSam, PustyString {
        if(wyraz.isEmpty()){
            throw new PustyString("String jest pusty");
        }
        String WyrazZmieniony = wyraz.toLowerCase();
        if(WyrazZmieniony.equals(wyraz)){
            throw new StringTakiSam("Pierwotny wyraz jest taki sam jak zmieniony");
        }
        return WyrazZmieniony;

    }

    public String NaDuze(String wyraz){
        return wyraz.toUpperCase();

    }

    public  String encrypt(String text, int shift) {
        StringBuilder encrypted = new StringBuilder();
        shift = shift % 26;

        for (char c : text.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isLowerCase(c) ? 'a' : 'A';
                char encryptedChar = (char) ((c - base + shift) % 26 + base);
                encrypted.append(encryptedChar);
            } else {
                encrypted.append(c);
            }
        }
        return encrypted.toString();
    }




    }
