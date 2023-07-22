package practice.generics.task1;
// Not going to lie, in some cases I would prefer just overriding stuff instead of using generics, for arithmethical operations using them just feels exhausting. Type safety? Code reusability? Bite me.
/**
 * Has only one method getSum(T, T), which returns the sum of two numbers that user decided to input.
 */
public class Summable<T extends Number> {
    
    public T getSum(T firstDecimal, T secondDecimal) {

        // Avoiding NullPointerException
        if (firstDecimal == null || secondDecimal == null) {
            return null;
        }
        // Cases for both types of numbers
        if (firstDecimal instanceof Double) {
            double sum = firstDecimal.doubleValue() + secondDecimal.doubleValue();
            return (T) Double.valueOf(sum);
        }
        if (firstDecimal instanceof Integer) {
            int sum = firstDecimal.intValue() + secondDecimal.intValue();
            return (T) Integer.valueOf(sum);
        }
        // Default case if we get anything other than Double or Integer
        throw new IllegalArgumentException("Type " + firstDecimal.getClass() + " is not supported by this method");
    }
}
