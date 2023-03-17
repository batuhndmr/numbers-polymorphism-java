/**
 * A class that represents a rational number
 * and extends the {@link Number} class.
 */
public class RationalN extends Number {

  /**
   * The numerator of the rational number.
   */
  private int numerator;
  
  /**
   * The denominator of the rational number.
   */
  private int denominator;
  
  /**
   * Constructs a new RationalN object with the given numerator and denominator.
   * 
   * @param numerator the numerator of the rational number
   * @param denominator the denominator of the rational number
   * @throws ArithmeticException if the denominator is 0
   */
  public RationalN(int numerator, int denominator)  {
  
    super((double) numerator / denominator);
    int gcd_ = gcd(numerator, denominator);
   
    this.numerator = numerator/gcd_;
    this.denominator = denominator/gcd_;
   
    if(denominator == 0) {
      throw new ArithmeticException("Denominator can not be 0!");
    }
  };
 

  /**
   * Returns the numerator of this rational number.
   * 
   * @return the numerator of this rational number
   */
  public int getNumerator() {
    return numerator;
  }
  
  /**
   * Returns the denominator of this rational number.
   * 
   * @return the denominator of this rational number
   */
  public int getDenominator() {
    return denominator;
  }
  
  /**
   * Returns the string representation of this rational number.
   * 
   * @return the string representation of this rational number
   */
  @Override
  public String toString() {
    
    if(this.numerator == 0) {
      return "0";
    }
    
   String sign = "";
   if ((numerator*denominator) < 0) {
      sign = "-";
   }
   String result = sign + Math.abs(numerator) + "/" + Math.abs(denominator);
   return result;
 }
  
  /**
   * Returns the greatest common divisor (GCD) of the two given integers.
   * 
   * @param n1 the first integer
   * @param n2 the second integer
   * @return the GCD of the two integers
   */ 
  int gcd(int n1, int n2) {
    int gcd = 1;
    for (int i = 1; i <= n1 && i <= n2; i++) {
        if (n1 % i == 0 && n2 % i == 0) {
            gcd = i;
        }
    }
    return gcd;
}


  }
 