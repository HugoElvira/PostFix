
import java.sql.SQLException;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


/* @author GerardoEnrique
 */
public class CalculadoraTest1 {

    /**
     * @param args the command line arguments
     */
     @Test
    
    public void PSuma() throws SQLException {
        System.out.println("Ver suma");
        Calculadora calcu = new Calculadora();
        asserTrue(calcu.Sumar(3,3)==6);
        asserTrue(calcu.Sumar(1,3)==4);
    }
    
    @Test
    
    public void PResta() throws SQLException {
        System.out.println("Ver resta");
        Calculadora calcu = new Calculadora();
        asserTrue(calcu.Restar(4,2)==2);
        asserTrue(calcu.Restar(9,4)==5);
    }
  
    @Test
    
    public void PMultiplicacion() throws SQLException {
        System.out.println("Ver multiplicacion");
        Calculadora calcu = new Calculadora();
        asserTrue(calcu.Multiplicar(3,3)==9);
        asserTrue(calcu.Multiplicar(1,2)==2);
        
    }
  
    @Test
    
    public void PDivision() throws SQLException {
        System.out.println("Ver division");
        Calculadora calcu = new Calculadora();
        asserTrue(calcu.Dividir(3,3)==1);
        asserTrue(calcu.Dividir(4,1)==4);
    }
}
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}