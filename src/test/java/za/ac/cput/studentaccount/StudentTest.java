/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.studentaccount;

import static java.time.Duration.ofMillis;
import static java.time.Duration.ofMinutes;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Timeout;

/**
 *
 * @author Chuma 219181187
 */
public class StudentTest {
    
  
     private Student student;
     
     private StudentTest studentaccount1;
     private StudentTest studentaccount2;
     private StudentTest studentaccount3;
 
    public StudentTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
        
        studentaccount1 = new StudentTest();
        studentaccount2 = new StudentTest();
        studentaccount3 = studentaccount1;
        
    }
    
    @AfterEach
    public void tearDown() {
    }

        @Test
        public void testEquality (){ //Testing for equality between two instances
            
            assertEquals(studentaccount1, studentaccount3);
   
        }
        
       
         @Test
         public void testIdentity (){ //Testing for object identity between two instances
            
            assertSame(studentaccount1, studentaccount3);
            
        }
       
         @Test
          public void testDisplayStudentName1() { //This method if the method going to fail or not when entering the wrong string name
             
            this.student = new Student();
            String studentName = student.displayStudentName1("Chuma", "Nxazonke");
            assertEquals("ChumaNxazonke", studentName);
  
        }
    
            
          @Test
           @Timeout(value = 100, unit = TimeUnit.MILLISECONDS)
           public void infinity() { 
            // fails if execution time exceeds 100 milliseconds
            //...
            }
          
 
    /**
     * Test of getName method, of class Student.
     */
    @Test
    @Disabled
    public void testGetName() {
        System.out.println("getName");
        student.setName("Chuma");
        String expResult = "";
        String result = student.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of setName method, of class Student.
     */
    @Test
    @Disabled
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Student instance = new Student();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSurname method, of class Student.
     */
    @Test
    @Disabled
    public void testGetSurname() {
        System.out.println("getSurname");
        Student instance = new Student();
        String expResult = "";
        String result = instance.getSurname();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSurname method, of class Student.
     */
    @Test
    @Disabled
    public void testSetSurname() {
        System.out.println("setSurname");
        String surname = "";
        Student instance = new Student();
        instance.setSurname(surname);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDepartment method, of class Student.
     */
    @Test
    @Disabled
    public void testGetDepartment() {
        System.out.println("getDepartment");
        Student instance = new Student();
        String expResult = "";
        String result = instance.getDepartment();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDepartment method, of class Student.
     */
    @Test
    @Disabled
    public void testSetDepartment() {
        System.out.println("setDepartment");
        String department = "";
        Student instance = new Student();
        instance.setDepartment(department);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Student.
     */
    @Test
    @Disabled
    public void testToString() {
        System.out.println("toString");
        Student instance = new Student();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of displayStudentName method, of class Student.
     */
    @Test
    @Disabled
    public void testDisplayStudentName() {
        System.out.println("displayStudentName");
        String a = "";
        String b = "";
        Student instance = new Student();
        String expResult = "";
        String result = instance.displayStudentName1(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        
    }  
   
    @Override
    public String toString() {
        return "StudentTest{" + "student=" + student + ", studentaccount1=" + studentaccount1 + ", studentaccount2=" + studentaccount2 + ", studentaccount3=" + studentaccount3 + '}';
    }
    
}  
    
