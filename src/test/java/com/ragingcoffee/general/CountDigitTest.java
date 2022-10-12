import static org.junit.Assert.*; 
 import org.junit.Test; 
  
 /** 
  * Test cases for countDigits method, of class TDDForCountDigitsMethod. 
  * 
  * @author Tom Verhoeff (TU/e) 
  */ 
 public class TDDForCountDigitsMethodTest { 
  
     /** Subject Under Test.  Only static members are used. */ 
     private static final TDDForCountDigitsMethod SUT = null; 
  
     // Test cases, phase 1 
     /** 
      * Test of countDigits method, of class TDDForCountDigitsMethod. 
      * Boundary case: smallest n 
      */ 
     @Test 
     public void testCountDigits0() { 
         System.out.println("countDigits(0)"); 
         long n = 0L; 
         int expResult = 1; 
         int result = SUT.countDigits(n); 
         assertEquals("result", expResult, result); 
     } 
  
     // Test cases, phase 2: Refactored test code 
     /** 
      * Invokes countDigits(n) and checks result against expectation. 
      * 
      * @param n  the number whose digits are counted 
      * @param expResult  the expected result 
      */ 
     private void checkCountDigits(long n, int expResult) { 
         System.out.println("countDigits(" + n + ")"); 
         int result = SUT.countDigits(n); 
         assertEquals("result", expResult, result); 
     } 
  
     /** 
      * Test of countDigits method, of class TDDForCountDigitsMethod. 
      * Boundary case: largest n with smallest result 
      */ 
     @Test 
     public void testCountDigits9() { 
         checkCountDigits(9L, 1); 
     } 
  
     // Test cases, phase 3 
     /** 
      * Test of countDigits method, of class TDDForCountDigitsMethod. 
      * Boundary case: smallest n with result 2 
      */ 
     @Test 
     public void testCountDigits10() { 
         checkCountDigits(10L, 2); 
     } 
  
     // Test cases, phase 4: More systematic approach 
     /** 
      * Test of countDigits method, of class TDDForCountDigitsMethod. 
      * Boundary cases: smallest and largest numbers with small results 
      */ 
     @Test 
     public void testCountDigitsSmall() { 
         long n = 1L; 
         for (int r = 0; r <= 5; ++ r) { 
             // n == 10 ^ r 
             checkCountDigits(n - 1, Math.max(1, r)); 
             checkCountDigits(n, r + 1); 
             n *= 10; 
         } 
     } 
  
     // Test cases, phase 5: Largest number 
     /** 
      * Test of countDigits method, of class TDDForCountDigitsMethod. 
      * Boundary case: largest long value. 
      * N.B. Overflow causes linear search to loop endlessly. 
      */ 
     @Test(timeout = 1000) 
     public void testCountDigitsMaxValue() { 
         checkCountDigits(Long.MAX_VALUE, 19); 
     } 
  
 }
