public class Fraction extends Number implements Comparable<Fraction> {
    private int numerator;
    private int denominator;

    // Constructeurs
    public Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Le dénominateur ne peut pas être zéro.");
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction(int numerator) {
        this(numerator, 1);
    }

    public Fraction() {
        this(0, 1);
    }

    // Constantes
    public static final Fraction ZERO = new Fraction(0, 1);
    public static final Fraction UN = new Fraction(1, 1);

    // Méthodes de consultation (getters)
    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    // Méthode pour obtenir la valeur en double
    @Override
    public double doubleValue() {
        return (double) numerator / denominator;
    }

    @Override
    public int intValue() {
        return (int) doubleValue();

    }

    @Override
    public long longValue() {
        return (long) doubleValue();
    }

    @Override
    public float floatValue() {
        return (float) doubleValue();
    }

    // Méthode d'addition
    public Fraction add(Fraction other) {
        int newNumerator = this.numerator * other.denominator + other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new Fraction(newNumerator, newDenominator);
    }

    // Test d'égalité entre fractions
    @Override

    public boolean equals(Object obj) {

        return Integer.compare(this.numerator * other.denominator, other.numerator * this.denominator);
    }

    // Méthode toString
    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
}
