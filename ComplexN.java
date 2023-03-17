/**
 * A class that represents a complex number 
 * and extends the {@link Number} class.
 */
public class ComplexN extends Number {

  /**
   * The imaginary part of the complex number */
  private double imaginaryPart;
  
  /**
   * Constructs a new ComplexN object with the given real part and imaginary part.
   * 
   * @param realPart the real part of the complex number
   * @param imaginaryPart the imaginary part of the complex number
   */
  public ComplexN(double realPart, double imaginaryPart) {
    super(realPart);
    this.imaginaryPart = imaginaryPart;
  }
  
  /**
   * Returns the imaginary part of this complex number.
   * 
   * @return the imaginary part of this complex number
   */
  public double getImaginary() {
    return imaginaryPart;
  }
  
  /**
   * Returns the string representation of this complex number.
   * 
   * @return the string representation of this complex number
   */
  @Override
  public String toString() {
    if(imaginaryPart > 0) {
      return getValue() + " + " + imaginaryPart + "i";
    }
    else {
      return getValue() + " - " + Math.abs(imaginaryPart) + "i";
    }
  }
}