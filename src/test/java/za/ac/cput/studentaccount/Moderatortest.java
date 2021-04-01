package za.ac.cput.studentaccount;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Disabled;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Raaziq
 */
public class Moderatortest {
         private Moderator moderator;
     
     private Moderatortest moderator1;
     private Moderatortest moderator2;
     private Moderatortest moderator3;
    public Moderatortest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
        
        moderator1 = new Moderatortest();
        moderator2 = new Moderatortest();
        moderator3 = moderator1;
        
    }
    
    @AfterEach
    public void tearDown() {
    }

        @Test
        public void testEquality (){ //Testing for equality between two instances
            
            assertEquals(moderator1, moderator3);
   
        }
        
       
         @Test
         public void testIdentity (){ //Testing for object identity between two instances
            
            assertSame(moderator1, moderator3);
            
        }
       
        @Test
         public void testFail (){ //Testing for object identity between two instances
            
            assertSame(moderator2, moderator3);
            
        }
    
            
          @Test
           @Timeout(value = 100, unit = TimeUnit.MILLISECONDS)
           public void infinity() { 

            }
          
 
@Disabled
@Test
public void testDisable(){   
  assertSame(moderator1,moderator3);  
}
}
