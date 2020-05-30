package testcase;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import com.javacodegeeks.examples.junitmavenexample.AppTest;
public class TestLogic {

	@BeforeClass  
    public static void setUpBeforeClass() throws Exception {  
        System.out.println("before class");  
    }  
    @Before  
    public void setUp() throws Exception {  
        System.out.println("before");  
    }  
  
    @Test  
    public void testFindMax(){  
        System.out.println("test case find max");  
        assertEquals(4,AppTest.findMax(new int[]{1,3,4,2}));  
        assertEquals(-2,AppTest.findMax(new int[]{-12,-3,-4,-2}));  
    }  
    @Test  
    public void testCube(){  
        System.out.println("test case cube");  
        assertEquals(27,AppTest.cube(3));  
    }  
    @Test  
    public void testReverseWord(){  
        System.out.println("test case reverse word");  
        assertEquals("ym eman si nahk",AppTest.reverseWord("my name is khan"));  
    }  
    @After  
    public void tearDown() throws Exception {  
        System.out.println("after");  
    }  
  
    @AfterClass  
    public static void tearDownAfterClass() throws Exception {  
        System.out.println("after class");  
    }  
  
}  