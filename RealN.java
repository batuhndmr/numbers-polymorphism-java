/**
 * A class that represent a real number and extends the {@link Number} class.
 */
public class RealN extends Number {

  /**
   * Constructs a new RealN object with the given value.
   * 
   * @param value the value of the real number
   */
  public RealN(double value) {
    super(value);
  }
  
  /**
   * Returns the string representation of this real number.
   * 
   * @return the string representation of the value of this real number
   */
  @Override 
  public String toString() {
    return String.valueOf(getValue());
  }

}