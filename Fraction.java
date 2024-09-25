public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction(int numerator) {
        this(numerator, 1);
    }

    public Fraction() {
        this(0, 1);
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public double doubleValue() {
        return (double) numerator / denominator;
    }

    public Fraction add(Fraction other) {
        int newNumerator = this.numerator * other.denominator + other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new Fraction(newNumerator, newDenominator);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Fraction other = (Fraction) obj;
        return this.numerator * other.denominator == other.numerator * this.denominator;
    }

    public int compareTo(Fraction other) {
        return Integer.compare(this.numerator * other.denominator, other.numerator * this.denominator);
    }

    public static final Fraction ZERO = new Fraction(0, 1);
    public static final Fraction UN = new Fraction(1, 1);
}

