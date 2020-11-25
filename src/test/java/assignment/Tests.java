package assignment;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

//import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
//import org.junit.jupiter.params.ParameterizedTest;
//import org.junit.jupiter.params.provider.CsvSource;

//import java.io.*;


public class Tests {


   @Test
   public void code1(){
       App.main(null);
       assertEquals("Johnny", App.name("Johnny"), "name() failed");
       assertEquals("Tim", App.name("Tim"), "name() failed");
   }

   @Test
   public void code2(){
       App.main(null);
       assertEquals("Your favorite color is blue and your favorite number is 999.", App.favorites("blue", 999), "favorites() failed");
       assertEquals("Your favorite color is pink and your favorite number is 69.", App.favorites("pink", 69), "favorites() failed");
   }

   @Test
   public void code3(){
       App.main(null);
       assertEquals(182, App.bigAdd(45,98,2,15,22), "bigAdd() failed");
       assertEquals(184, App.bigAdd(8,74,6,9,87), "bigAdd() failed");
   }

   @Test
   public void code4(){
       App.main(null);
       assertEquals(141.63637, App.fourOperations(45,98,2,15,22), "fourOperations() failed");
       assertEquals(81.37209, App.fourOperations(8,74,6,9,86), "fourOperations() failed");
   }

   @Test
    public void late() {
        App.main(null);
        assertTrue(DueDate.onTime(2020, 12, 22), "Submitted Late");
    }

}
