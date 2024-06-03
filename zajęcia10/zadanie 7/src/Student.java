public class Student implements Comparable{
    String Imie;
    String Nazwisko;
    String NumerIndeksu;

    public Student(String imie, String nazwisko, String numerIndeksu) {
        this.Imie = imie;
        this.Nazwisko = nazwisko;
        this.NumerIndeksu = numerIndeksu;
    }

    @Override
    public int compareTo(Object o) {
        Student that = (Student)o;
        return NumerIndeksu.compareTo(that.NumerIndeksu);
    }
}
