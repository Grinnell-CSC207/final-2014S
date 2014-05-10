import java.io.BufferedReader;
import java.io.PrintWriter;

/**
 * Some simple experiments with JSON.
 */
public class JSONExpt
{
  // +-------+-----------------------------------------------------------
  // | Notes |
  // +-------+

  /*
    Taken almost verbatim from Samuel A. Rebelsky's quick-and-dirty
    JSON parser, available at
      <https://github.com/Grinnell-CSC207/sample-json-parser>
    Dumping using the dump method is all that's been added.
   */

  // +-------------+-----------------------------------------------------
  // | Experiments |
  // +-------------+

  /**
   * One experiment.  Print a JSON string.  Parse the string.  Print the
   * parsed version.
   */
  public static void expt(PrintWriter pen, String str)
    throws Exception
  {
    pen.println("Input:    " + str);
    Object obj = JSON.parse(str);
    pen.println("Parsed:   " + obj);
    String json = JSON.toString(obj);
    pen.println("Unparsed: " + json);
    obj = JSON.parse(json);
    pen.println("Reparsed: " + obj);
    json = JSON.toString(obj);
    pen.println("Unparsed: " + json);
    pen.println("Dumped: ");
    JSON.dump(pen, obj);
    pen.println();
  } // expt(String)

  // +------+------------------------------------------------------------
  // | Main |
  // +------+

  /**
   * A host of experiments.
   */
  public static void main(String[] args)
    throws Exception
  {
    PrintWriter pen = new PrintWriter(System.out, true);
    expt(pen, "11");
    expt(pen, "0.2");
    expt(pen, "\"Hello\"");
    expt(pen, "[null,true,false]");
    expt(pen, "[null,[true,false],[],[\"a\",\"b\"]]");
    expt(pen, "\"\\\"\"");
    expt(pen, "{\"a\":\"alpha\",\"b\":\"beta\"}");
    expt(pen, "{\"a\":\"alpha\",\"b\":{\"a\":\"alpha\",\"b\":\"beta\"}}");
    expt(pen,
         "{\"a\":\"alpha\",\"b\":{\"a\":\"alpha\",\"b\":\"beta\"},\"c\":{},\"d\":\"d\"}");
  } // main(String[])
} // JSONExpt
