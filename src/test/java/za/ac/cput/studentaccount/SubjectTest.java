/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.studentaccount;

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
 * @author mogamadgithr
 */
public class SubjectTest {
    
    private Subject subject;
    
    private SubjectTest subjectchoice1;
    private SubjectTest subjectchoice2;
    private SubjectTest subjectchoice3;
   
    public SubjectTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
        
        subjectchoice1 = new SubjectTest();
        subjectchoice2 = new SubjectTest();
        subjectchoice3 = subjectchoice1;

    }
    
    @AfterEach
    public void tearDown() {
    }
    
    @Test
    public void testEquality(){
        assertEquals(subjectchoice1, subjectchoice3);
    }

    @Test
    public void testIdentity(){
        assertEquals(subjectchoice1, subjectchoice3);
    }
    
    @Test 
    @Timeout(value = 100, unit = TimeUnit.MILLISECONDS)
    public void infinity(){
    }
    
    @Test 
    public void testFail(){
        assertSame(subjectchoice1, subjectchoice3);
        fail("Test Invalid");
    }
    
    @Disabled
    @Test
    public void testdisable(){
        assertSame(subjectchoice1, subjectchoice3);
    }

    /**
     * Test of getType method, of class Subject.
     */
    @Test
    @Disabled 
    public void testGetType() {
        System.out.println("getType");
        Subject instance = new Subject();
        String expResult = "";
        String result = instance.getType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setType method, of class Subject.
     */
    @Test
    @Disabled 
    public void testSetType() {
        System.out.println("setType");
        String type = "";
        Subject instance = new Subject();
        instance.setType(type);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCode method, of class Subject.
     */
    @Test
    @Disabled 
    public void testGetCode() {
        System.out.println("getCode");
        Subject instance = new Subject();
        String expResult = "";
        String result = instance.getCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCode method, of class Subject.
     */
    @Test
    @Disabled 
    public void testSetCode() {
        System.out.println("setCode");
        String code = "";
        Subject instance = new Subject();
        instance.setCode(code);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class Subject.
     */
    @Test
    @Disabled 
    public void testGetName() {
        System.out.println("getName");
        Subject instance = new Subject();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Subject.
     */
    @Test 
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Subject instance = new Subject();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Subject.
     */
    @Test
    @Disabled
    public void testToString() {
        System.out.println("toString");
        Subject instance = new Subject();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
