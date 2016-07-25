import java.io.BufferedReader;
import java.io.FileReader;

/**
 * 
 */

/**
 * @author Pc
 *
 */
public class Calculadora implements I_Calculadora{

	/**
	 * 
	 */
	
	Pila pila = new Pila();
	
	public Calculadora() {
		// TODO Auto-generated constructor stub
	}

	
	
	@Override
	public int Calcular(String vector) {
	int total=0;
	
	String[] Arreglo = vector.split(" ");
	
	for(String arreglo: Arreglo){ 
		try{
		pila.Push(Integer.parseInt(arreglo)); 
		}
		catch(Exception e){ 
			switch(arreglo){
			case "+":
				total = (int)pila.Pop() + (int)pila.Pop();
				pila.Push(total);
				break;
				
			case "*":
				total = (int)pila.Pop() * (int)pila.Pop();
				pila.Push(total);
				break;
				
			case "/":
				total = (int)pila.Pop() / (int)pila.Pop();
				pila.Push(total);
				break;
			}
		}
		}
	
		return total;		
	}
	

	@Override
	public String ToString() {
		String res="El resultado es: ";
		return res;
	}

	@Override
	public String LeerArchivo(String direccion) {
		
		String operacion = "";
		try{
			BufferedReader direc = new BufferedReader(new FileReader(direccion));
			String x = "";
			String leer;
			while((leer = direc.readLine()) != null){
				x = x + leer;				
			}
			
		operacion = x;
		
		}
		catch(Exception e){
			System.err.println("No puede leerse el archivo");
		}
		return operacion;

	}

}
