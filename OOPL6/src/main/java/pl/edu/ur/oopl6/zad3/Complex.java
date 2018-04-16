package pl.edu.ur.oopl6.zad3;

/**
 *
 * @author rafineria123
 */
public class Complex {

    private double re;
    private double im;
    private double sinx;
    private double cosx;

    public Complex() {
        this(0, 0);
    }

    public Complex(double re) {
        this(re, 0);

    }

    public Complex(double re, double im) {
        this.re = re;
        this.im = im;
        this.sinx = im / Modul();
        this.cosx = re / Modul();

    }

    public double Modul() {
        return Math.pow(Math.pow(re, 2) + Math.pow(im, 2), 1 / 2);
    }

    public Complex Sprzezenie() {
        return new Complex(re, -im);
    }

    @Override
    public String toString() {
        return re + " + " + im + "i";
    }

    public Complex Dodawanie(Complex druga) {
        double re = this.re + druga.re;
        double im = this.im + druga.im;
        return new Complex(re, im);
    }

    public Complex Odejmowanie(Complex druga) {
        double re = this.re - druga.re;
        double im = this.im - druga.im;
        return new Complex(re, im);
    }

    public Complex Mnozenie(Complex druga) {
        double re = this.re * druga.re - this.im * druga.im;
        double im = this.im * druga.re + druga.im * this.re;
        return new Complex(re, im);
    }

    public Complex Dzielenie(Complex druga) {
        Complex x = new Complex(re / (re * re + im * im), im / (re * re + im * im));

        return this.Mnozenie(x);
    }

    public void Wykladnicza() {
        System.out.println("z = " + Modul() + " * " + "e^(i* " + Math.asin(sinx) + ")");
    }

    public void Trygonometryczna() {
        System.out.println("z = " + Modul() + "* (" + cosx + " + i*" + sinx + ")");
    }

}
