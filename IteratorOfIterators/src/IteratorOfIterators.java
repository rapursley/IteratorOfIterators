import java.util.Iterator;

public class IteratorOfIterators<E> implements Iterator<E> {

	private Iterator<E> i, j;	
	private boolean first = true;

	public IteratorOfIterators(Iterator<E> i, Iterator<E> j) {
		super();
		this.i = i;
		this.j = j;
	}

	@Override
	public boolean hasNext() {
		// if either one hasNext value then return true.
		return i.hasNext() || j.hasNext();
	}

	@Override
	public E next() {
		E next;		
		if(first) {
			if(i.hasNext()){
				next = i.next();
			} else {
				next = j.next();
			}
		} else {
			if(j.hasNext()){
				next = j.next();
			} else {
				next = i.next();
			}
		}
		
		first = !first;
		return next;
	}
	
	
		
}
