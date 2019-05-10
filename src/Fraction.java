public class Fraction {

    private int numerator;
    private int denominator;

    public Fraction(int numerator,int denominator){

        if(denominator == 0){
            throw new IllegalArgumentException("Denominator can't be zero!! ");
        }
        if(denominator<0){
            numerator *= -1;
            denominator *= -1;
        }

        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction(int numerator){

        this(numerator,0);
    }

    public Fraction(){

        this(1,0);
    }

    public int getNumerator(){
        return this.numerator;
    }

    public int getDenominator(){
        return this.denominator;
    }

    public String toString(){

        return this.numerator+"/"+this.denominator;
    }

    public Double toDouble(){
        Double dNumerator = new Double(this.numerator);
        Double dDenominator = new Double(this.denominator);
        return dNumerator/dDenominator;
    }

    public static int gcd(int a, int b){
        if(a == 0) {
            return b;
        }
        return gcd(b%a, a);
    }

    public void toLowerTerms(){
        int Gcd = gcd(this.numerator,this.denominator);
        this.numerator /= Gcd;
        this.denominator /= Gcd;
    }
    public Fraction add(Fraction other){

        int Gcd = gcd(this.denominator,other.denominator);

        // LCM * GCD = a*b
        Gcd = (this.denominator)*(other.denominator) / Gcd;

        int num = (this.numerator)*(Gcd/this.denominator) + (other.numerator)*(Gcd/other.denominator);

        Fraction Sum = new Fraction(num,Gcd);
        Sum.toLowerTerms();

        return Sum;

    }

    public Boolean equals(Object other){
        return (other instanceof Fraction) && ( ((Fraction) other).numerator == this.numerator) && (((Fraction) other).denominator == this.denominator);
    }










}
