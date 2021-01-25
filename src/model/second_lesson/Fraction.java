package model.second_lesson;


public class Fraction {

    private int numerator;
    private int denominator;
    public static int count = 0;

    public Fraction(int numerator, int denominator) {
        count++;
        this.numerator = numerator;
        this.denominator  = denominator;
    }

    public Fraction Plus(Fraction fraction) {
        if (this.denominator != fraction.denominator) {
            int new_numerator = this.numerator * fraction.numerator;
            int new_denominator = this.denominator * fraction.numerator + fraction.denominator * this.numerator;
            return new Fraction(new_numerator, new_denominator);
        }
        else {
            int new_numerator = this.numerator + fraction.numerator;
            return new Fraction(new_numerator, this.denominator);
        }
    }

    public void display_fraction () {
        System.out.println(this.numerator + "/" + this.denominator);
    }

    public void display () {
        if (this.denominator == 1) { System.out.println(this.numerator); }
        else { System.out.println(this.numerator/this.denominator); }
    }

    public void display_count () {
        System.out.println("Count: " + count);
    }

    public void simplify () {
        int gcd = search_gcd(this.numerator, this.denominator);
        if (gcd != 0) {
            this.denominator /= gcd;
            this.numerator /= gcd;
        }
    }

    private int search_gcd (int numerator, int denominator) {
        if (numerator == 0) { return denominator; }
        else if (denominator == 0) {return numerator; }
        return search_gcd(denominator, numerator % denominator);
    }
}
