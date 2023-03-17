/**
 * A class that contains methods for performing 
 * arithmetic operations on objects of the {@link Number} class.
 */
public class Arithmetic {
  // Add method  
  /**
   * Adds the given numbers and returns the result as a new {@link Number} object.
   * 
   * @param num_1 the first number to add
   * @param num_2 the second number to add
   * @return the result of adding the given numbers as a {@link Number} object
   */
  public static Number add(Number num_1, Number num_2) {
        if (num_1 instanceof ComplexN || num_2 instanceof ComplexN) {
            
           if (num_1 instanceof ComplexN && num_2 instanceof ComplexN) {
               
                ComplexN complexA = (ComplexN) num_1;
                ComplexN complexB = (ComplexN) num_2;
                return new ComplexN(complexA.getValue() + complexB.getValue(), complexA.getImaginary() + complexB.getImaginary());
            } 
            else if (num_1 instanceof ComplexN) {
                ComplexN complexA = (ComplexN) num_1;
                return new ComplexN(complexA.getValue() + num_2.getValue(), complexA.getImaginary());
            } 
            else {
                ComplexN complexB = (ComplexN) num_2;
                return new ComplexN(num_1.getValue() + complexB.getValue(), complexB.getImaginary());
            }
        } 
        else if (num_1 instanceof RationalN || num_2 instanceof RationalN) {
            
          if (num_1 instanceof RationalN && num_2 instanceof RationalN) {
                
                RationalN rationalA = (RationalN) num_1;
                RationalN rationalB = (RationalN) num_2;
                int numerator = rationalA.getNumerator() * rationalB.getDenominator() + rationalB.getNumerator() * rationalA.getDenominator();
                int denominator = rationalA.getDenominator() * rationalB.getDenominator();
                return new RationalN(numerator, denominator);
            } 
          else if (num_1 instanceof RationalN) {
                RationalN rationalA = (RationalN) num_1;
                int numerator = rationalA.getNumerator() + rationalA.getDenominator() * (int) num_2.getValue();
                return new RationalN(numerator, rationalA.getDenominator());
            } 
           else {
                
                RationalN rationalB = (RationalN) num_2;
                int numerator = rationalB.getNumerator() + rationalB.getDenominator() * (int) num_1.getValue();
                return new RationalN(numerator, rationalB.getDenominator());
            }
        } 
        else {
            return new RealN(num_1.getValue() + num_2.getValue());
        }

    }

  
    // Subtraction
    /**
     * Subtracts two Numbers and returns the result as a new Number.
     * 
     * @param num_1 the first number to subtract
     * @param num_2 the second number to subtract
     * @return the result of subtracting num_2 from num_1 as a new Number
     */
    public static Number subtract(Number num_1, Number num_2) {
    
      if (num_1 instanceof ComplexN || num_2 instanceof ComplexN) {
        
        /* If either number is a ComplexN, the result must also be a ComplexN */
        if (num_1 instanceof ComplexN && num_2 instanceof ComplexN) {
            
            /* Both numbers are ComplexN, so we can subtract them directly */
            ComplexN complexA = (ComplexN) num_1;
            ComplexN complexB = (ComplexN) num_2;
            return new ComplexN(complexA.getValue() - complexB.getValue(), complexA.getImaginary() - complexB.getImaginary());
        } 
        else if (num_1 instanceof ComplexN) {
            
            /* Only num_1 is a ComplexN, so we must subtract num_2 from it as a RealN */
            ComplexN complexA = (ComplexN) num_1;
            return new ComplexN(complexA.getValue() - num_2.getValue(), complexA.getImaginary());
        } 
        else {
            
            /* Only num_2 is a ComplexN, so we must subtract num_1 from it as a RealN */
            ComplexN complexB = (ComplexN) num_2;
            return new ComplexN(num_1.getValue() - complexB.getValue(), -complexB.getImaginary());
        }
    } 
      else if (num_1 instanceof RationalN || num_2 instanceof RationalN) {
        
        /* If either number is a RationalN, the result must also be a RationalN */
        if (num_1 instanceof RationalN && num_2 instanceof RationalN) {
            
            /* Both numbers are RationalN, so we can subtract them directly */
            RationalN rationalA = (RationalN) num_1;
            RationalN rationalB = (RationalN) num_2;
            int numerator = rationalA.getNumerator() * rationalB.getDenominator() - rationalB.getNumerator() * rationalA.getDenominator();
            int denominator = rationalA.getDenominator() * rationalB.getDenominator();
            return new RationalN(numerator, denominator);
        } 
        else if (num_1 instanceof RationalN) {
            
            /* Only num_1 is a RationalN, so we must subtract num_2 from it as an int */
            RationalN rationalA = (RationalN) num_1;
            int numerator = rationalA.getNumerator() - rationalA.getDenominator() * (int) num_2.getValue();
            return new RationalN(numerator, rationalA.getDenominator());
        } 
        else {
            
            /* Only num_2 is a RationalN, so we must subtract num_1 from it as an int */
            RationalN rationalB = (RationalN) num_2;
            int numerator = rationalB.getDenominator() * (int) num_1.getValue() - rationalB.getNumerator();
            return new RationalN(numerator, rationalB.getDenominator());
        }
    } 
      else {
        return new RealN(num_1.getValue() - num_2.getValue());
    }
}
    // Multiplication
    /**
     * Multiplies two numbers and returns the result as a new number.
     * 
     * @param num_1 the first number to multiply
     * @param num_2 the second number to multiply
     * @return the result of multiplying num_1 and num_2 as a new number
     */
    public static Number multiply(Number num_1, Number num_2) {
    
      if (num_1 instanceof ComplexN || num_2 instanceof ComplexN) {
        
        /* If either number is a ComplexN, the result must also be a ComplexN */
        if (num_1 instanceof ComplexN && num_2 instanceof ComplexN) {
            
            /* Both numbers are ComplexN, so we can multiply them directly */
            ComplexN complexA = (ComplexN) num_1;
            ComplexN complexB = (ComplexN) num_2;
            double real = complexA.getValue() * complexB.getValue() - complexA.getImaginary() * complexB.getImaginary();
            double imaginary = complexA.getValue() * complexB.getImaginary() + complexA.getImaginary() * complexB.getValue();
            return new ComplexN(real, imaginary);
        } 
        else if (num_1 instanceof ComplexN) {
            
            /* Only num_1 is a ComplexN, so we must multiply num_2 with it as a RealN */
            ComplexN complexA = (ComplexN) num_1;
            double real = complexA.getValue() * num_2.getValue();
            double imaginary = complexA.getImaginary() * num_2.getValue();
            return new ComplexN(real, imaginary);
        } 
        else {
            
            /* Only num_2 is a ComplexN, so we must multiply num_1 with it as a RealN */
            ComplexN complexB = (ComplexN) num_2;
            double real = complexB.getValue() * num_1.getValue();
            double imaginary = complexB.getImaginary() * num_1.getValue();
            return new ComplexN(real, imaginary);
        }
    } 
      else if (num_1 instanceof RationalN || num_2 instanceof RationalN) {
        
        /* If either number is a RationalN, the result must also be a RationalN */
        if (num_1 instanceof RationalN && num_2 instanceof RationalN) {
            
            /* Both numbers are RationalN, so we can multiply them directly */
            RationalN rationalA = (RationalN) num_1;
            RationalN rationalB = (RationalN) num_2;
            int numerator = rationalA.getNumerator() * rationalB.getNumerator();
            int denominator = rationalA.getDenominator() * rationalB.getDenominator();
            return new RationalN(numerator, denominator);
        } 
        else if (num_1 instanceof RationalN) {
            
            /* Only num_1 is a RationalN, so we must multiply num_2 with it as an int */
            RationalN rationalA = (RationalN) num_1;
            int numerator = rationalA.getNumerator() * (int) num_2.getValue();
            return new RationalN(numerator, rationalA.getDenominator());
        } 
        else {
            
            /* Only num_2 is a RationalN, so we must multiply num_1 with it as an int */
            RationalN rationalB = (RationalN) num_2;
            int numerator = rationalB.getNumerator() * (int) num_1.getValue();
            return new RationalN(numerator, rationalB.getDenominator());
        }
    } 
      else {
        return new RealN(num_1.getValue() * num_2.getValue());
    }
}
    // Division
    /**
     * Divides two numbers and returns the result as a new number.
     * 
     * @param num_1 the number to be divided
     * @param num_2 the number to divide by divisor
     * @return the result of dividing num_1 by num_2 as a new number
     */
    public static Number divide(Number num_1, Number num_2) {
    
      if (num_1 instanceof ComplexN || num_2 instanceof ComplexN) {
        
        /* If either number is a ComplexN, the result must also be a ComplexN */
        if (num_1 instanceof ComplexN && num_2 instanceof ComplexN) {
            
            /* Both numbers are ComplexN, so we can divide them directly */
            ComplexN complexA = (ComplexN) num_1;
            ComplexN complexB = (ComplexN) num_2;
            double denominator = complexB.getValue() * complexB.getValue() + complexB.getImaginary() * complexB.getImaginary();
            double real = (complexA.getValue() * complexB.getValue() + complexA.getImaginary() * complexB.getImaginary()) / denominator;
            double imaginary = (complexA.getImaginary() * complexB.getValue() - complexA.getValue() * complexB.getImaginary()) / denominator;
            return new ComplexN(real, imaginary);
        } 
        else if (num_1 instanceof ComplexN) {
            
            /* Only num_1 is a ComplexN, so we must divide it by num_2 as a RealN */
            ComplexN complexA = (ComplexN) num_1;
            double real = complexA.getValue() / num_2.getValue();
            double imaginary = complexA.getImaginary() / num_2.getValue();
            return new ComplexN(real, imaginary);
        } 
        else {
            
            /* Only num_2 is a ComplexN, so we must divide */
            ComplexN complexB = (ComplexN) num_2;
            double denominator = complexB.getValue() * complexB.getValue() + complexB.getImaginary() * complexB.getImaginary();
            return new ComplexN(num_1.getValue() / denominator, -num_1.getValue() * complexB.getImaginary() / denominator);
        }
    } 
      else if (num_1 instanceof RationalN || num_2 instanceof RationalN) {
        
        /* If either number is a RationalN, the result must also be a RationalN */
        if (num_1 instanceof RationalN && num_2 instanceof RationalN) {
            
            /* Both numbers are RationalN, so we can divide them directly */
            RationalN rationalA = (RationalN) num_1;
            RationalN rationalB = (RationalN) num_2;
            int numerator = rationalA.getNumerator() * rationalB.getDenominator();
            int denominator = rationalA.getDenominator() * rationalB.getNumerator();
            return new RationalN(numerator, denominator);
        } 
        else if (num_1 instanceof RationalN) {
            
            /* Only num_1 is a RationalN, so we must divide num_2 with it as an int */
            RationalN rationalA = (RationalN) num_1;
            int numerator = rationalA.getNumerator();
            int denominator = rationalA.getDenominator() * (int) num_2.getValue();
            return new RationalN(numerator, denominator);
        } 
        else {
            
            /* Only num_2 is a RationalN, so we must divide num_1 with it as an int */
            RationalN rationalB = (RationalN) num_2;
            int numerator = rationalB.getDenominator() * (int) num_1.getValue();
            int denominator = rationalB.getNumerator();
            return new RationalN(numerator, denominator);
        }
    } 
      else {
        return new RealN(num_1.getValue() / num_2.getValue());
    }
}
    

}

    

