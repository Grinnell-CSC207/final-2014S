import java.io.PrintWriter;
import java.util.Arrays;

/**
 * A simple user interface for the minStamps procedure.  Takes a
 * goal price and a list of stamp prices from the command line.
 */
public class Stamps
{
  // +------+------------------------------------------------------------
  // | Main |
  // +------+

  public static void main(String[] args)
  {
    // Build the output device
    PrintWriter pen = new PrintWriter(System.out, true);

    // Get the desired price
    // STUB
    int price = 10;

    // Get the array of stamp values
    // STUB
    int[] values = new int[] { 1, 2, 5 };

    // Compute stamps to make price
    int[] stamps = Misc.minStamps(price, values);

    // Print out the results
    // STUB
    pen.println(Arrays.toString(stamps));
  } // main(String[])

} // class Stamps
