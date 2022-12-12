public class FractionRunner {
    public static void main(String[] args) {
        Fraction frac1 = new Fraction(7, 8);
        System.out.println(frac1);

        Fraction frac2 = new Fraction(6);
        System.out.println(frac2);

        Fraction frac3 = new Fraction();
        System.out.println(frac3);

        Fraction frac4 = new Fraction(2, 4);
        Fraction frac5 = frac4.multiplyWithFraction(frac1);
        System.out.println(frac5);
        System.out.println(frac1);

        Fraction frac6 = new Fraction(9, 14);
        frac6.flip();
        System.out.println(frac6);

        System.out.println("----");

        // watch the references!
        Fraction frac7 = new Fraction(3, 4);
        Fraction bigger = frac7.largerFraction(frac4);
        System.out.println(bigger);
        bigger.flip();
        System.out.println(frac7);

        Fraction frac8 = new Fraction(2);
        bigger = frac7.largerFraction(frac8);
        System.out.println(bigger);
        bigger.flip();
        System.out.println(frac8);
        Fraction frac9 = new Fraction(1, 2);
        Fraction frac10 = new Fraction(2, 3);
        System.out.println(frac9);
        System.out.println(frac10);

    }
}
