import java.util.Vector;

/**
 * 
 */

/**
 * @author Pc
 * @param <E>
 *
 */
public  class Pila<E> implements I_Stack<E>{
	
	private Vector<E> miPila;
	
	/**
	 * @descripcion: Constructor
	 */
	public Pila() {
	  miPila=new Vector<E>();
		}
	 
	
	@Override
	public void Push(E element){
		miPila.addElement(element);
	}
	
	
	@Override
	public E Pop(){
		E x= (E) miPila.lastElement();
		miPila.remove(miPila.lastElement());
		return x;
	}



	@Override
	public boolean IsEmpty() {
		boolean y;
		if(miPila.size()==0){y=true;}
		else {y=true;}
		return y;
	}

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
