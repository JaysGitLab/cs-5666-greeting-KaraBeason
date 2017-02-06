import java.io.*;
import static org.junit.Assert.assertEquals;
import org.junit.*;

public class HelloTest {
      private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
      private Hello helloWorld;
      
      @Before
      public void SetUp(){
       
        System.setOut(new PrintStream(outContent));
      }

      @After
      public void TearDown(){

        System.setOut(null);
      }

      @Test
      public void PrintWithOneArgument(){
          helloWorld = new Hello();
          helloWorld.main(new String[] {"Charles"});
	      assertEquals("Hello, Charles!\nMy name is Optimus Prime.\nHow are you doing today?\n", outContent.toString());
      }

      @Test
      public void PrintWithTwoArguements(){
          helloWorld = new Hello();
          helloWorld.main(new String[] {"-me", "Computron", "Charles"});
          assertEquals("Hello, Charles!\nMy name is Computron.\nHow are you doing today?\n", outContent.toString());
      }

      @Test
      public void PrintWithNoArgument(){
        helloWorld = new Hello();
        helloWorld.main(new String[] {});
        assertEquals("Hello, Kara!\nMy name is Optimus Prime.\nHow are you doing today?\n", outContent.toString());
      }

      @Test
      public void FixIncorrectCase(){
          helloWorld = new Hello();
          helloWorld.main(new String[] {"charles"});
          assertEquals("Hello, Charles!\nMy name is Optimus Prime.\nHow are you doing today?\n", outContent.toString());
      }
}
