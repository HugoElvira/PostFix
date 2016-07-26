
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Grupo 8 Hugo Elvira, Dieter de Wit, Gerardo Cardoza
 * @version 25/07/2016
 */
public class PilaTest {
    
    public PilaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of Push method, of class Pila.
     */
    @Test
    public void testPush() {
        System.out.println("Push");
        Object element = null;
        Pila instance = new Pila();
        instance.Push(element);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Pop method, of class Pila.
     */
    @Test
    public void testPop() {
        System.out.println("Pop");
        Pila instance = new Pila();
        Object expResult = null;
        Object result = instance.Pop();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of IsEmpty method, of class Pila.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("IsEmpty");
        Pila instance = new Pila();
        boolean expResult = false;
        boolean result = instance.IsEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Size method, of class Pila.
     */
    @Test
    public void testSize() {
        System.out.println("Size");
        Pila instance = new Pila();
        int expResult = 0;
        int result = instance.Size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get method, of class Pila.
     */
    @Test
    public void testGet() {
        System.out.println("get");
        Pila instance = new Pila();
        Object expResult = null;
        Object result = instance.get();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
