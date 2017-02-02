import java.io.*;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class HelloTest {
      private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
      
      @Test
      public void PrintHelloWorld() {
      System.setOut(new PrintStream(outContent));
      Hello helloWorld = new Hello();
	  assertEquals("Hello, World!", outContent.toString());
      System.setOut(null);
      }
}
