import java.io.BufferedReader;
import java.io.FileReader;

/**
 * 
 */

/**
 * @author Grupo 8 Hugo Elvira, Dieter de Wit, Gerardo Cardoza
 * @version 25/07/2016
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
				
				
			case "-":
				total = -(int)pila.Pop() + (int)pila.Pop();
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
			String leer;
			while((leer = direc.readLine()) != null){
				operacion = operacion + leer;				
			}
		
		}
		catch(Exception e){
			System.err.println("No puede leerse el archivo");
		}
		return operacion;

	}

}
