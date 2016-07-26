import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author Grupo 8 Hugo Elvira, Dieter de Wit, Gerardo Cardoza
 * @version 25/07/2016
 */
public class CalculadoraTest {
    
    public CalculadoraTest() {
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
     * Test of Calcular method, of class Calculadora.
     */
    @Test
    public void testCalcular() {
        System.out.println("Calcular");
        String vector = "";
        Calculadora instance = new Calculadora();
        int expResult = 0;
        int result = instance.Calcular(vector);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ToString method, of class Calculadora.
     */
    @Test
    public void testToString() {
        System.out.println("ToString");
        Calculadora instance = new Calculadora();
        String expResult = "";
        String result = instance.ToString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of LeerArchivo method, of class Calculadora.
     */
    @Test
    public void testLeerArchivo() {
        System.out.println("LeerArchivo");
        String direccion = "";
        Calculadora instance = new Calculadora();
        String expResult = "";
        String result = instance.LeerArchivo(direccion);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
