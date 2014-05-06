/**
 * Miscellaneous utilities.
 */
public class Misc
{
  /**
   * Find a minimum-size collection of stamps for a particular price.
   *
   * @return
   *   stamps, an array of integers
   *
   * @pre
   *   values is nonempty
   * @pre
   *   For all i, 0 <= i < values.length, values[i] > 0
   * @pre
   *   price >= 0
   * @post
   *   P1: For all i, 0 <= i < stamps.length; stamps[i] is in values
   * @post
   *   P2: The sum of the values in stamps is equal to price.
   * @post
   *   For any array, a, for which P1 and P2 hold, a.length >= stamps.length.
   */
  public static int[] minStamps(int price, int[] values)
  {
    // STUB
    return new int[] { price };
  } // minStamps(int, int[])
} // class Misc
