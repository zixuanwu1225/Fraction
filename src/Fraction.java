public class Fraction
{
    private int numerator;
    private int denominator;

    // static utility method that accepts any two Fraction objects and multiples them, returning a new Fraction object
    public static Fraction multiplyFractions(Fraction fraction1, Fraction fraction2)
    {
        // inside a static method, we have no reference to "this" so we couldn't use that anywhere in there if we wanted to
        // (but we would never want to since it doesn't make sense!)
        int num = fraction1.getNumerator() * fraction2.getNumerator();
        int den = fraction1.getDenominator() * fraction2.getDenominator();
        Fraction newFrac = new Fraction(num, den);
        return newFrac;
    }

    // Java Pro Tip! Constructors are written in a special form since they have no return type writte, but they actually return "this"
    // which is (of course!) the object being created by the constructor
    public Fraction(int numerator, int denominator)
    {
        this.numerator = numerator;  // "this" is necessary here to distinguish between instance variable and local variable or parameter
        this.denominator = denominator;
    }

    public Fraction(int wholeNumber)
    {
        this(wholeNumber, 1);  // very useful application for overloaded constructors (especially if the "main" constructor has
    }                        // a lot of logic in it -- there is no need to copy/paste constructor code for each constructor)

    public Fraction()
    {
        this(1);
    }

    public int getNumerator()
    {
        return numerator;
    }

    public int getDenominator()
    {
        return denominator;
    }

    public Fraction multiplyWithFraction(Fraction otherFraction)
    { // unlike instance methods, which can optionally be called with "this."
        // it is NOT legal to call a STATIC method with "this."
        Fraction newFrac = multiplyFractions(otherFraction, this); // you can pass "this" current object as a parameter to a method
        return newFrac;                                            // that has the current class as the parameter type
    }

    public double asDecimal()
    {
        double decimal = (double) this.numerator / this.denominator;  // this is an example of using "this" with instance variables; unnecessary, but optional
        return decimal;                                               // (they are only added here for example purposes -- i would NOT actually encourage their use here)
    }

    public Fraction largerFraction(Fraction otherFraction)
    {
        double frac1 = this.asDecimal();              // although "this" is not necessary here, you could argue the use of "this" here when
        double frac2 = otherFraction.asDecimal();     // juxtaposed to another Fraction helps with readability -- your call!

        if (frac1 > frac2)
        {
            return this;  // can also return "this" if appropriate and return type is this class
        }
        else if (frac2 > frac1)
        {
            return otherFraction;
        }
        else //if they are equal, pass back a 0 Fraction because what else?!
        {
            return (new Fraction(0, 1)); // unrelated, but this is an example of passing the returned object from a new command as a parameter
        }
    }

    public void flip()
    {
        FractionManipulator manipulator = new FractionManipulator(this); // you can pass "this" current object as a parameter to a constructor
        manipulator.invert();                                            // just like you can with other methods (e.g. at line 48)

        numerator = manipulator.getNumerator();
        denominator = manipulator.getDenominator();
    }

    public String toString()
    {
        String str = numerator + "/" + denominator;  // "this" not used here for any variables or method since it is clear what's intended
        return str;                                  // (i wouldn't encourage their use here -- you CAN of course, but it's not common)
    }
}