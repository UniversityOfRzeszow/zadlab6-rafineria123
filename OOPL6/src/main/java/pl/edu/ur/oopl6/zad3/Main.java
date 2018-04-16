package pl.edu.ur.oopl6.zad3;

/**
 *
 * @author rafineria123
 */
public class Main {

    public static void main(String[] args) {
        Complex pierwszy = new Complex(1, 2);
        System.out.println("Moduł = " + pierwszy.Modul());
        System.out.println("Sprzezenie = " + pierwszy.Sprzezenie());
        Complex drugi = new Complex(3, 5);
        System.out.println("Dodawanie = " + pierwszy.Dodawanie(drugi));
        System.out.println("Odejmowanie = " + pierwszy.Odejmowanie(drugi));
        System.out.println("Mnozenie = " + pierwszy.Mnozenie(drugi));
        System.out.println("Dzielenie = " + pierwszy.Dzielenie(drugi));
        System.out.println("Postac algebraiczna = " + pierwszy);
        pierwszy.Wykladnicza();
        pierwszy.Trygonometryczna();

    }

}
