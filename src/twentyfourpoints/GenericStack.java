import java.util.ArrayList;
import java.util.EmptyStackException;

public class GenericStack<E> implements GenericStackInterface<E>{
	  /**
	   * The list of objects of this stack
	   */
	  private int size; //size of the stack
	  private Object[] array;
	  private int top;

	  private ArrayList<E> list = new ArrayList<E> ();
	  /**
	   * Implemented all the methods of the interface
	   */
	    

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return list.size();
	}

	@Override
	public E peek() {
		// TODO Auto-generated method stub
		return list.get((top-1));
	}

	@Override
	public void push(E item) {
		// TODO Auto-generated method stub
		 list.add (top++, item);
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public E pop() {
		return list.remove (--top);
	} 
}
