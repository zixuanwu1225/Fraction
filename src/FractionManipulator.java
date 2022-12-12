public class FractionManipulator
{
    private int numerator;
    private int denominator;

    public FractionManipulator(Fraction fraction)
    {
        this.numerator = fraction.getNumerator();
        this.denominator = fraction.getDenominator();
    }

    public FractionManipulator(int numerator, int denominator)
    {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator()
    {
        return numerator;
    }

    public int getDenominator()
    {
        return denominator;
    }

    public void invert()
    {
        int temp = numerator;
        numerator = denominator;
        denominator = temp;
    }

    // other fun methods not shown (but trust me, they are awesome)
}