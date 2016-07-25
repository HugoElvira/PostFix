import java.util.Vector;

/**
 * 
 */

/**
 * @author Grupo 8 Hugo Elvira, Dieter de Wit, Gerardo Cardoza
 * @version 25/07/2016
 */
public  class Pila<E> implements I_Stack<E>{
	
	private Vector<E> miPila;
	
	/**
	 * @descripcion: Constructor
	 */
	public Pila() {
	  miPila=new Vector<E>();
		}
	 
	/**
	 * @descripcion: push, inserta elemento en pila
	 */
	@Override
	public void Push(E element){
		miPila.addElement(element);
	}
	
	/**
	 * @descripcion: pop, extrae ultimo elemento en pila y lo elimina de la misma
	 */
	@Override
	public E Pop(){
		E x= (E) miPila.lastElement();
		miPila.remove(miPila.lastElement());
		return x;
	}


	/**
	 * @descripcion: indica true si la pila esta vacia o false en caso contrario
	 */
	@Override
	public boolean IsEmpty() {
		boolean y;
		if(miPila.size()==0){y=true;}
		else {y=true;}
		return y;
	}
	
	/**
	 * @descripcion: devuelve el tama�o de la pila
	 */
	@Override
	public int Size() {
		int tam=miPila.size();
		return tam;
	}

	@Override
	public E get() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	

}
