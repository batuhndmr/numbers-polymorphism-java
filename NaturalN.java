/**
 * A class that represents a natural number 
 * and extends the {@link Number} class.
 */
public class NaturalN extends Number {

  /**
   * Constructs a new NaturalN object with the given value.
   * 
   * @param value the value of the natural number
   * @throws ArithmeticException if the value is negative
   */
  public NaturalN(int value) {
    super(value);
    if(value < 0) {
      throw new ArithmeticException("Natural numbers can not be negative!");
    }
  }
  
  /**
   * Returns the string representation of this natural number.
   * 
   * @return the string representation of the value of this natural number
   */
  @Override 
  public String toString() {
    return String.valueOf(getValue());
  } 

}