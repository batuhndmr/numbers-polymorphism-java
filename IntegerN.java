/**
 * A class that represents an integer and extends the {@link Number} class
 */
public class IntegerN extends Number {

  /**
   * Constructs a new IntegerN object with the given value.
   * 
   * @param value the value of the integer
   */
  public IntegerN(int value) {
    super(value);
    
  }
  
  /**
   * Returns the string representation of this integer.
   * 
   * @return the string representation of the value of this integer
   */
  @Override
  public String toString() {
    return String.valueOf(getValue());
  }

}
