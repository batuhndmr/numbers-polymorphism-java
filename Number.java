/**
 * A class that represents a number.
 */
public abstract class Number {
  
  /*The value of the number.
   */
  protected double value;
  
  /**
   * Constructs a new Number object with the given value.
   * 
   * @param value the value of the number
   */
  public Number(double value) {
    this.value = value;
  } 
  
  /**
   * Returns the value of this number.
   * 
   * @return the value of this number
   */
  public double getValue() {
    return value;
  }
  
  /**
   * Returns the string representation of this number.
   * 
   * @return the string representation of this number
   */
  public abstract String toString();
  
}