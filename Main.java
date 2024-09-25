public class Main {
    public static void main(String[] args) {
        // Test des constructeurs
        Fraction f1 = new Fraction(3, 4);  // 3/4
        Fraction f2 = new Fraction(5);     // 5/1
        Fraction f3 = new Fraction();      // 0/1

        // Test toString()
        assert f1.toString().equals("3/4");
        assert f2.toString().equals("5/1");
        assert f3.toString().equals("0/1");

        // Test des constantes ZERO et UN
        assert Fraction.ZERO.toString().equals("0/1");
        assert Fraction.UN.toString().equals("1/1");

        // Test des getters
        assert f1.getNumerator() == 3;
        assert f1.getDenominator() == 4;

        // Test de doubleValue()
        assert f1.doubleValue() == 0.75;
        assert f2.doubleValue() == 5.0;

        // Test de l'addition
        Fraction result = f1.add(new Fraction(1, 4));  // 3/4 + 1/4 = 1/1
        assert result.toString().equals("16/16");  // Simplification non implémentée dans cet exemple

        // Test d'égalité
        Fraction f4 = new Fraction(2, 4);  // équivalent à 1/2
        assert f4.equals(new Fraction(1, 2));

        // Test de comparaison
        assert f1.compareTo(new Fraction(1, 2)) > 0;   // 3/4 est plus grand que 1/2
        assert f1.compareTo(new Fraction(3, 4)) == 0;  // 3/4 est égal à 3/4
        assert f1.compareTo(new Fraction(5, 4)) < 0;   // 3/4 est plus petit que 5/4

        System.out.println("Tous les tests sont passés avec succès !");
    }
}

