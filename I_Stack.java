/**
 * 
 */

/**
 * @author Pc
 * @param <E>
 *
 */
public interface I_Stack<E> {
	
	public void Push(E element);
	public E Pop();
	public boolean IsEmpty();
	public int Size();
	public E get();

}
