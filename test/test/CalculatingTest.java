/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import largestpalindrome.Calculating;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author Vaio
 */
public class CalculatingTest {
    
    Calculating c;
    
    @Before
    public void before(){
        try{
            
            long n = 101102;
            c = new Calculating(n);
            
        }catch(Exception e){
            fail(e.getMessage());
        }
    }
    
    @Test
    public void setNTest(){
        
        try{
            long n = 101110;
            c.setN(n);
        }catch(Exception e){
            
            fail(e.getMessage());
            
        }
        
    }
    
    @Test
    public void isPalindromeTest(){
        assertTrue(c.isPalindrome("793397"));
    }
    
    @Test
    public void getLargestPalindromeTest(){
        try{
            assertEquals(101101, c.getLargestPalindrome());   
        }catch(Exception e){
            fail(e.getMessage());
        }
    }
    
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
