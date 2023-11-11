package businessLogic;

import java.util.Vector;

import domain.Event;

public class EventIterator implements ExtendedIterator {

	public Vector<Event> events=new Vector<Event>();
	public int position = 0;

	public Event next() {
		Event ev = events.elementAt(position);
		position = position + 1;
		return ev;
	}

	public boolean hasNext() {
		return position < events.size();
	}

	public Event previous() {
		Event ev = events.elementAt(position);
		position = position - 1;
		return ev;
	}

	public boolean hasPrevious() {
		return position >= 0;
	}

	public void goFirst() {
		position = 0;
	}

	public void goLast() {
		position = events.size() - 1;
	}

}
