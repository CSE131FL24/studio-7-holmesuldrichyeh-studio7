package studio7;

public class Fraction {
    private int numerator;
    private int denominator;

   
    public Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator cannot be zero.");
        }
        this.numerator = numerator;
        this.denominator = denominator;
        simplify();
    }

    
    public Fraction add(Fraction other) {
        int newNumerator = this.numerator * other.denominator + other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new Fraction(newNumerator, newDenominator);
    }

    
    public Fraction multiply(Fraction other) {
        int newNumerator = this.numerator * other.numerator;
        int newDenominator = this.denominator * other.denominator;
        return new Fraction(newNumerator, newDenominator);
    }

   
    public Fraction reciprocal() {
        if (this.numerator == 0) {
            throw new IllegalArgumentException("Cannot take the reciprocal of zero.");
        }
        return new Fraction(this.denominator, this.numerator);
    }

   
    private void simplify() {
        int gcd = gcd(numerator, denominator);
        this.numerator /= gcd;
        this.denominator /= gcd;
        if (denominator < 0) { 
            numerator = -numerator;
            denominator = -denominator;
        }
    }

    
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a);
    }

   
   
    public String toString() {
        return numerator + "/" + denominator;
    }

    
    public static void main(String[] args) {
        Fraction frac1 = new Fraction(1, 2);
        Fraction frac2 = new Fraction(3, 4);

        System.out.println("Fraction 1: " + frac1);
        System.out.println("Fraction 2: " + frac2);
        System.out.println("Sum: " + frac1.add(frac2));
        System.out.println("Product: " + frac1.multiply(frac2));
        System.out.println("Reciprocal of Fraction 1: " + frac1.reciprocal());
        System.out.println("Reciprocal of Fraction 2: " + frac2.reciprocal());
    }
}