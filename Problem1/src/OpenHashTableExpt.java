import java.io.PrintWriter;
import java.util.ArrayList;

/**
 * A quick and dirty experiment with open hash tables.  Intended mostly
 * to reveal potential flaws in an implementation of hash tables.  May
 * only work well with the default settings of our open hash table
 * implementation: default size 41, default offset 17.
 */
public class OpenHashTableExpt
{
  // +--------+----------------------------------------------------------
  // | Fields |
  // +--------+

  /**
   * The open hash table that's the subject of our experiments.
   */
  static OpenHashTable<String,String> dict = new OpenHashTable<String,String>();

  /**
   * The keys in that table (supposedly).
   */
  static ArrayList<String> keys = new ArrayList<String>();

  /**
   * Our favorite output device.
   */
  static PrintWriter pen = new PrintWriter(System.out, true);

  // +---------+---------------------------------------------------------
  // | Helpers |
  // +---------+

  /**
   * Add an element.
   */
  static void add(String key)
  {
    pen.println("Adding " + key);
    dict.set(key,key);
    keys.add(key);
  } // add(String)

  /**
   * Check to make sure that everything that belongs in the dictionary
   * is there.
   */
  static void check()
  {
    boolean ok = true;
    for (String key : keys)
      {
        String value = null;
        try 
          {
            value = dict.get(key);
            if ((value == null) || (key.compareTo(value) != 0))
              {
                ok = false;
                pen.println("ERROR: " + key + " has value " + value);
              } // if the wrong value
          } // try
        catch (Exception e)
          {
            ok = false;
            pen.println("ERROR: " + key + " is missing.");
          } // try/catch
      } // for
    if (ok)
      {
        pen.println("Checked.");
      }
  } // check

  /**
   * Get an element.
   */
  static void get(String key)
  {
    try 
      {
        pen.println(key + " -> " + dict.get(key));
      }
    catch (Exception e)
      {
        pen.println(key + " IS MISSING!");
      } // catch (Exception)
  } // get(String)

  /**
   * Remove an element.
   */
  static void remove(String key)
  {
    pen.println("Removing " + key);
    dict.remove(key);
    keys.remove(key);
  } // remove(String)

  // +------+------------------------------------------------------------
  // | Main |
  // +------+

  public static void main(String[] args)
      throws Exception
  {
    add("as");
    add("that");
    add("were");
    add("mimsy");
    check();
    remove("that");
    check();
  } // main(String[])

} // OpenHashTableExpt
