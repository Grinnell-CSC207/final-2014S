import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * A simple interactive experiment.  Reads a JSON string, parses it,
 * and then prints it out in multiple ways.
 */
public class JSONInteractiveExpt
{
  // +-------+-----------------------------------------------------------
  // | Notes |
  // +-------+

  /*
    Taken almost verbatim from Samuel A. Rebelsky's quick-and-dirty
    JSON parser, available at
      <https://github.com/Grinnell-CSC207/sample-json-parser>
    Section headings and a call to dump have been added.
   */

  // +------+------------------------------------------------------------
  // | Main |
  // +------+

  public static void main(String[] args)
    throws Exception
  {
    PrintWriter pen = new PrintWriter(System.out, true);
    BufferedReader eyes = new BufferedReader(new InputStreamReader(System.in));
    pen.print("Enter JSON: ");
    pen.flush();
    Object thing = JSON.parse(eyes);
    pen.println("toString(): " + thing);
    pen.println("toJSONString(): " + JSON.toString(thing));
    pen.println("dumped: ");
    JSON.dump(pen, thing);
  } // main(String[])
} // JSONInteractiveExpt
