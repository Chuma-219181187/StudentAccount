/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.studentaccount;

import org.junit.jupiter.api.AfterAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertSame;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Disabled;

/**
 *
 * @author Dieuci ND
 */
public class EmployeeTest {


     private static  Employee employee1;

     private static Employee employee2;

      private static  Employee employee3;

      private static Employee employee4;


    @BeforeEach
    public void setUp() {
        employee1 = new Employee("1997", "Elie", 2000.0);
        employee4 = employee1;
        employee2 = new Employee("2000", "Dieuci", 2000.0);
        employee3 = new Employee("1997", "Elie", 2000.0);
    }


    @Test
    public void testObjectEquality() {
         assertNotEquals(employee1, employee2);
         assertEquals(employee1, employee3);
    }

    @Test
    public void testObjectIdentity(){
         assertNotSame(employee1, employee2);
         assertNotSame(employee1, employee3);
         assertSame(employee1,employee4);
   }

    @Test 
    public void testFailing(){
        assertEquals(employee1.name, employee2.name);
    }

    @Test 
    @Timeout(value = 100, unit = TimeUnit.MILLISECONDS)
    public void testTimeOut(){

    }

    @Test
    @Disabled
    public void testDisabled(){
        assertEquals(employee1.name, employee2.name);
        assertEquals(employee1.name, employee4.name);
    }



    @AfterAll
    public static void tearDownClass() {
        employee1 = null;
        employee2 = null;
        employee3 = null;
        employee4 = null;
    }

}