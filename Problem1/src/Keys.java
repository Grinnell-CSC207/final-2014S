import java.io.PrintWriter;

/**
 * A program that prints out the likely location of keys specified on
 * the command line.
 */
public class Keys
{
  /**
   * The size of the table.
   */
  static final int TABLE_SIZE = 41;

  public static void main(String[] keys)
  {
    PrintWriter pen = new PrintWriter(System.out);
    for (String key : keys)
      {
        int index = Math.abs(key.hashCode() % 41);
        pen.println(index + ": " + key);
      } // for
    pen.close();
  } // main
} // class Keys
